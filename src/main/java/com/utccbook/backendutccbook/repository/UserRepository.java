package com.utccbook.backendutccbook.repository;

import com.utccbook.backendutccbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long>{
}
