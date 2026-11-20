package com.gestetner.servvista.application.port.out.sales;

import com.gestetner.servvista.domain.entity.sales.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Spring Data JPA repository for {@link Salesman}.
 */
@Repository
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {

    @Query("select salesman from Salesman salesman join fetch salesman.user order by salesman.salesmanId")
    List<Salesman> findAllWithUser();
}
