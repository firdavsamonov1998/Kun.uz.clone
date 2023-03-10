package com.example.kunuz.dto;

import com.example.kunuz.enums.ProfileRole;
import com.example.kunuz.enums.ProfileStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileDTO {

    private Integer id;
    private String name;
    private String surname;
    private String phone;

    private String email;
    private ProfileStatus status;
    private ProfileRole role;
    private Boolean visible;
    private LocalDateTime createdDate;

    public ProfileDTO() {
    }

    public ProfileDTO(Integer id, String name, String surname, String phone, ProfileStatus status, ProfileRole role, Boolean visible, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.visible = visible;
        this.createdDate = createdDate;
    }
}
