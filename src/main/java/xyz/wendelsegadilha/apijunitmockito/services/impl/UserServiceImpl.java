package xyz.wendelsegadilha.apijunitmockito.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wendelsegadilha.apijunitmockito.domain.User;
import xyz.wendelsegadilha.apijunitmockito.domain.dto.UserDTO;
import xyz.wendelsegadilha.apijunitmockito.repositories.UserRepository;
import xyz.wendelsegadilha.apijunitmockito.services.UserService;
import xyz.wendelsegadilha.apijunitmockito.services.exceptions.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }


}
