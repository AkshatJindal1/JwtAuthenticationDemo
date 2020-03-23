package io.banking.springsecurityjwt.models;

public class JwtUserDetailsFactory {
    public static JwtUserDetails create(User user) {
        return new JwtUserDetails(user.getId(), user.getUsername(), user.getPassword());
    }
}
