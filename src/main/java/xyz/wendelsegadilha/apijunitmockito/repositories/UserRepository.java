package xyz.wendelsegadilha.apijunitmockito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.wendelsegadilha.apijunitmockito.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
