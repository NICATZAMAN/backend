package me.eltacshikhsaidov.dailytech1.services;

import me.eltacshikhsaidov.dailytech1.entities.Blog;
import me.eltacshikhsaidov.dailytech1.entities.User;
import me.eltacshikhsaidov.dailytech1.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private BlogRepository blogRepository;

    @Autowired
    public void setBlogRepository(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public void addBlog(Blog blog, User user) {
        blog.setUser(user);
        blogRepository.save(blog);
    }

    public List<Blog> findUserBlog(User user) {
        return blogRepository.findByUser(user);
    }
}
