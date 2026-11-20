package com.gestetner.servvista.application.port.out.identity;


import com.gestetner.servvista.domain.entity.identity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link RolePermission}.
 */
@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
}
