package com.example.pruebas.repositories;

import com.example.pruebas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
