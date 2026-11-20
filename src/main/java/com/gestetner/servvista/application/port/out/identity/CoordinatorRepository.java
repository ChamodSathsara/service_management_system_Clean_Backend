package com.gestetner.servvista.application.port.out.identity;

import com.gestetner.servvista.domain.entity.identity.Coordinator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoordinatorRepository extends JpaRepository<Coordinator, Long> {
    Optional<Coordinator> findByUserId(Long userId);

    @Query("select coordinator from Coordinator coordinator join fetch coordinator.user order by coordinator.coordinatorId")
    List<Coordinator> findAllWithUser();
}
