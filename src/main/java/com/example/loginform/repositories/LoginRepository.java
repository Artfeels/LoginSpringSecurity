package com.example.loginform.repositories;

import com.example.loginform.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {

}
