package com.example.homemanagement.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //TODO Update email
@AllArgsConstructor
public class LoggedInUser {

    private final String eMailAddress;
    private final String displayName;
}