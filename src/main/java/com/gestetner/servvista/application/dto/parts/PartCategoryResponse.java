package com.gestetner.servvista.application.dto.parts;

import java.time.LocalDateTime;

public record PartCategoryResponse(
        Long partCategoryId,
        String categoryCode,
        String categoryName,
        String description,
        Boolean isActive,
        Long createdBy,
        LocalDateTime createdAt
) {
}
