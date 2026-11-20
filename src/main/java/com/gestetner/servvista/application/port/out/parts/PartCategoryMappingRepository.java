package com.gestetner.servvista.application.port.out.parts;

import com.gestetner.servvista.domain.entity.parts.PartCategoryMapping;
import com.gestetner.servvista.domain.entity.parts.PartCategoryMappingId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartCategoryMappingRepository extends JpaRepository<PartCategoryMapping, PartCategoryMappingId> {
    List<PartCategoryMapping> findAllByPartIdOrderByPartCategoryId(Long partId);
    void deleteAllByPartId(Long partId);
}
