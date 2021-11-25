package com.example.homemanagement.restclient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

    @JsonProperty("name")
    private String name;
    @JsonProperty("pw")
    private String password;
}
