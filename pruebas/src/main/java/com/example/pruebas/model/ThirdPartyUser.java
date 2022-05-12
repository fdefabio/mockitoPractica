package com.example.pruebas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartyUser {
    private Long id;
    private String firstName;
    private String LastName;
    private String maritalStatus;
    private boolean isAdmin;
    private LocalDate birtday;


}
