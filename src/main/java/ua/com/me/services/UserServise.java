package ua.com.me.services;



import ua.com.me.entity.User;

import java.util.List;

public interface UserServise {
    void save(User user);

    User findOne(int id);

    List<User> findAll();

    void delete(User user);

    void delete(int id);

    User findByName(String username);


}
