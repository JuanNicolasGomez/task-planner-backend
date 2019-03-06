package edu.eci.ieti.taskplannerbackend.services;

import edu.eci.ieti.taskplannerbackend.models.User;

import java.util.List;

public interface UserSevice {

    List<User> getUsersList();

    User getUserById();

    User createUser();

    User updateUser();

    void removeUser();
}
