package com.ms.user.dtos;

import java.util.UUID;

import com.ms.user.models.UserModel;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(@Id UUID id, @NotBlank String name, @NotBlank @Email String email) {
    public static UserModel toUserModel(UserRecordDto userRecordDto) {
        return new UserModel(userRecordDto.id, userRecordDto.name, userRecordDto.email);
    }
}
