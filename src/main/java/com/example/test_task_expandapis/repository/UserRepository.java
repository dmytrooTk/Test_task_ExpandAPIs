package com.example.test_task_expandapis.repository;

import com.example.test_task_expandapis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUsersByUsername(String username);
    boolean existsByUsername(String username);
}
