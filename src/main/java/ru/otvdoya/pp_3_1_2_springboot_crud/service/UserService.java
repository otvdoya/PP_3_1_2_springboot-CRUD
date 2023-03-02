package ru.otvdoya.pp_3_1_2_springboot_crud.service;

import ru.otvdoya.pp_3_1_2_springboot_crud.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void addUser(User user);

    void deleteUserById(int id);

    void editUser(User user);

}
