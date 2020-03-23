package io.banking.springsecurityjwt.models;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
