package me.eltacshikhsaidov.dailytech1.repositories;

import me.eltacshikhsaidov.dailytech1.entities.Blog;
import me.eltacshikhsaidov.dailytech1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    List<Blog> findByUser(User user);

}
