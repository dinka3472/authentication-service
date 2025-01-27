package com.irish.authenticationservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegRequest {

    private String email;
    private String password;
}
