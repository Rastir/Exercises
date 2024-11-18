package com.aldosanchez.posts_service.repository;

import com.aldosanchez.posts_service.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p WHERE p.user_id = :user_id")
    List<Post> findPostByUserId(Long user_id);
}
