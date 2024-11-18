package com.aldosanchez.posts_service.service;

import com.aldosanchez.posts_service.model.Post;

import java.util.List;

public interface IPostService {

    public List<Post> getPostByUser(Long user_id);
}
