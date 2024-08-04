package com.scm.service;

import java.util.*;

import com.scm.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(User user) {
        return Optional.empty();
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public boolean isUserExist(String userId) {
        return false;
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
