package com.aldosanchez.users_service.service;

import com.aldosanchez.users_service.dto.UserDTO;

public interface IUserService {

    public UserDTO getUserAndPost(Long user_id);
}
