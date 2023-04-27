package com.example.demo.repositories;

import com.example.demo.models.ImagesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<ImagesModel, Long> {
    Optional<ImagesModel> findByUserId(Long userId);
    Optional<ImagesModel> findByPostId(Long postId);
}
