package xyz.wendelsegadilha.apijunitmockito.resources;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import xyz.wendelsegadilha.apijunitmockito.domain.User;
import xyz.wendelsegadilha.apijunitmockito.domain.dto.UserDTO;
import xyz.wendelsegadilha.apijunitmockito.services.impl.UserServiceImpl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

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
    void findByIdSuccessTest () {
        when(service.findById(anyInt())).thenReturn(user);
        when(mapper.map(any(), any())).thenReturn(userDTO);

        ResponseEntity<UserDTO> response = resource.findById(ID);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getBody());

        Assertions.assertEquals(ResponseEntity.class, response.getClass());
        Assertions.assertEquals(UserDTO.class, response.getBody().getClass());

        Assertions.assertEquals(ID, response.getBody().getId());
        Assertions.assertEquals(NAME, response.getBody().getName());
        Assertions.assertEquals(EMAIL, response.getBody().getEmail());
        Assertions.assertEquals(PASSWORD, response.getBody().getPassword());

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