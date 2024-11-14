package com.aldosanchez.user_service.service;

import com.aldosanchez.user_service.dto.UserDTO;

public interface IUserService {

    public UserDTO getUserAndPost(Long user_id);
}
