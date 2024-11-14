package com.aldosanchez.user_service.controller;


import com.aldosanchez.user_service.dto.UserDTO;
import com.aldosanchez.user_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public IUserService servUsu;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserAndPost (@PathVariable Long user_id){

        UserDTO user = servUsu.getUserAndPost(user_id);

        return user;
    }
}
