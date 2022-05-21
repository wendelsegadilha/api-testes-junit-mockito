package xyz.wendelsegadilha.apijunitmockito.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import xyz.wendelsegadilha.apijunitmockito.domain.User;
import xyz.wendelsegadilha.apijunitmockito.repositories.UserRepository;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Wendel", "wendel@gmail.com", "123");
        User u2 = new User(null, "Venes", "venes@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }


}
