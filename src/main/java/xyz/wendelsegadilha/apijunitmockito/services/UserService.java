package xyz.wendelsegadilha.apijunitmockito.services;

import xyz.wendelsegadilha.apijunitmockito.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
