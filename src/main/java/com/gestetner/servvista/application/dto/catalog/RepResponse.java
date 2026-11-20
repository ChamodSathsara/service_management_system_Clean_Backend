package com.gestetner.servvista.application.dto.catalog;

import java.time.LocalDateTime;

public record RepResponse(Long repId, String repCode, String repName,
                          String repMobileNumber, Boolean isActive,
                          LocalDateTime createdAt, Long createdBy) {}
