package com.example.user.rest.APIs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private Long id;

    @NotBlank
    private String userName;

    @Email
    private String userEmail;
    private String userAdd;
    private String userPhone;

}
