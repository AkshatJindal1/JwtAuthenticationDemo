package io.banking.springsecurityjwt.services;

//import org.springframework.security.core.userdetails.User;

import io.banking.springsecurityjwt.dao.LoginDao;
import io.banking.springsecurityjwt.models.JwtUserDetails;
import io.banking.springsecurityjwt.models.JwtUserDetailsFactory;
import io.banking.springsecurityjwt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    LoginDao dao;

    @Override
    public JwtUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = dao.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Invalid username");
        return JwtUserDetailsFactory.create(user);
    }
}
