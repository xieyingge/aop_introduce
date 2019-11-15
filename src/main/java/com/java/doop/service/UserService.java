package com.java.doop.service;

import com.java.doop.model.User;

public interface UserService {
    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
