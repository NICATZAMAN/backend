package me.eltacshikhsaidov.dailytech1.repositories;

import me.eltacshikhsaidov.dailytech1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByNameLike(String name);
}
