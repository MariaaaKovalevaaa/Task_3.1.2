package com.springboot6.springboot6.dao;




import com.springboot6.springboot6.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers(); // запрос select
    User getUserById (Integer id);

    void addUser(User user); //запрос update

    void delete(Integer id); //запрос delete
    void updateUser (Integer id, User updateUser);
}
