package xyz.wendelsegadilha.apijunitmockito.services;

import xyz.wendelsegadilha.apijunitmockito.domain.User;

public interface UserService {

    User findById(Integer id);
}
