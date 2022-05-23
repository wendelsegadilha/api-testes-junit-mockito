package xyz.wendelsegadilha.apijunitmockito.resources;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.wendelsegadilha.apijunitmockito.domain.User;
import xyz.wendelsegadilha.apijunitmockito.domain.dto.UserDTO;
import xyz.wendelsegadilha.apijunitmockito.services.impl.UserServiceImpl;

@SpringBootTest
class UserResourceTest {

    @InjectMocks
    private UserResource resource;

    @Mock
    private ModelMapper mapper;

    @Mock
    private UserServiceImpl service;

    /* Constantes para montar os objetos */
    public static final Integer ID = 1;
    public static final String NAME = "Wendel";
    public static final String EMAIL = "wendel@gmail.com";
    public static final String PASSWORD = "123";
    public static final int INDEX = 0;

    private User user;
    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        /* Inicia os mocks da classe */
        MockitoAnnotations.openMocks(this);
        /* Inicia as instâncias dos objetos */
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }

}