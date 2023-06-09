package com.example.demo.repositories;

import com.example.demo.models.Post;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
        List<Post> findAllByUserOrderByCreateDateDesc(User user);
        List<Post> findAllByOrderByCreateDateDesc();

        Optional<Post> findPostByIdAndUser(Long id, User user);
}
