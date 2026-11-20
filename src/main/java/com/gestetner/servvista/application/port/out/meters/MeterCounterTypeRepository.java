package com.gestetner.servvista.application.port.out.meters;

import com.gestetner.servvista.domain.Enums.Meters.MeterCounterCode;
import com.gestetner.servvista.domain.entity.meters.MeterCounterType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link MeterCounterType}.
 */
@Repository
public interface MeterCounterTypeRepository extends JpaRepository<MeterCounterType, Long> {

    boolean existsByCounterCode(MeterCounterCode counterCode);

    boolean existsByCounterCodeAndMeterCounterTypeIdNot(
            MeterCounterCode counterCode, Long meterCounterTypeId);
}
