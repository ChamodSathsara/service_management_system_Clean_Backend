package com.gestetner.servvista.application.port.out.customers;


import com.gestetner.servvista.domain.entity.customers.CompanyCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.List;

/**
 * Spring Data JPA repository for {@link CompanyCustomer}.
 */
@Repository
public interface CompanyCustomerRepository extends JpaRepository<CompanyCustomer, Long> {
    List<CompanyCustomer> findAllByCustomerIdIn(Collection<Long> customerIds);

    void deleteAllByCustomerId(Long customerId);

    boolean existsByCustomerIdAndCompany(Long customerId, com.gestetner.servvista.domain.Enums.Organization.Company company);
}
