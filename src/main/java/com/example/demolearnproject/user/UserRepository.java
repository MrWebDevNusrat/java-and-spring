package com.example.demolearnproject.user;

import com.example.demolearnproject.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    Long countById(Integer id);

    List<User> findAllByDeletedIsFalse();
}
