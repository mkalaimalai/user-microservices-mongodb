package com.mkalaimalai.repository;


import com.mkalaimalai.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by kalaimam on 9/11/17.
 */
public interface UserRepository extends MongoRepository<User, String> {

    public User findByUserName(String userName);
    public User findById(String id);
    public List<User> findAll();


}
