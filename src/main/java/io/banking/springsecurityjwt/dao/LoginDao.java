package io.banking.springsecurityjwt.dao;

import io.banking.springsecurityjwt.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginDao extends MongoRepository<User, String> {
    public User findByUsername(String username);
}
