package ru.otvdoya.pp_3_1_2_springboot_crud.dao;

import ru.otvdoya.pp_3_1_2_springboot_crud.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void deleteUserById(int id);

    void editUser(User user);

}
