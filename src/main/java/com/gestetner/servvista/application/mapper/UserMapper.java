package com.gestetner.servvista.application.mapper;

import com.gestetner.servvista.application.dto.identity.CreateUserRequest;
import com.gestetner.servvista.application.dto.identity.UserResponse;
import com.gestetner.servvista.application.dto.identity.UserAccountRequest;
import com.gestetner.servvista.domain.Enums.Identity.Role;
import com.gestetner.servvista.domain.entity.identity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Locale;

@Component
public class UserMapper {

    public User toEntity(CreateUserRequest request, String passwordHash, LocalDateTime createdAt) {
        return toEntity(request, request.role(), passwordHash, createdAt);
    }

    public User toEntity(
            UserAccountRequest request,
            Role role,
            String passwordHash,
            LocalDateTime createdAt) {
        User user = new User();
        user.setUserName(request.userName().trim());
        user.setMobileNumber(normalizeOptional(request.mobileNumber()));
        user.setEmail(request.email().trim().toLowerCase(Locale.ROOT));
        user.setPasswordHash(passwordHash);
        user.setIsActive(request.isActive() == null || request.isActive());
        user.setDivision(request.division());
        user.setArea(request.area());
        user.setRole(role);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(request.createdBy());
        return user;
    }

    public UserResponse toResponse(User user) {
        return new UserResponse(
                user.getUserId(),
                user.getUserName(),
                user.getMobileNumber(),
                user.getEmail(),
                user.getIsActive(),
                user.getDivision(),
                user.getArea(),
                user.getRole(),
                user.getCreatedAt(),
                user.getCreatedBy()
        );
    }

    private String normalizeOptional(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        return value.trim();
    }
}
