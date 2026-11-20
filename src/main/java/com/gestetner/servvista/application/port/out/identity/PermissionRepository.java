package com.gestetner.servvista.application.port.out.identity;


import com.gestetner.servvista.domain.entity.identity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Permission}.
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
