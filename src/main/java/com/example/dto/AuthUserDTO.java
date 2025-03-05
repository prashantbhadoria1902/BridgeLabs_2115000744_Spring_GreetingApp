package com.example.dto;

import jakarta.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserDTO {
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name must start with an uppercase letter")
    private String firstName;

    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "Last name must start with an uppercase letter")
    private String lastName;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$%^&*()-+=])(?=.*[0-9]).{8,}$", message = "Password must contain at least 1 uppercase letter, 1 special character, 1 number, and be 8+ characters")
    private String password;
}
