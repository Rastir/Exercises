package com.aldosanchez.user_service.service;

import com.aldosanchez.user_service.dto.PostDTO;
import com.aldosanchez.user_service.dto.UserDTO;
import com.aldosanchez.user_service.model.User;
import com.aldosanchez.user_service.repository.IPostAPI;
import com.aldosanchez.user_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepo;

    @Autowired
    private IPostAPI apiPosts;
    @Override
    public UserDTO getUserAndPost(Long user_id) {

        // traer datos del usuario de la bd
        User user = userRepo.findById(user_id).orElse(null);

        //uan vez traidos los datos, necesitar los posteos
        // traer posteos desde la api de posteos
        List<PostDTO> postsList = apiPosts.getPostByUserId(user_id);

        // unificar datos del usuario más posteos mediante dto
        UserDTO userDTO = new UserDTO(user.getUser_id(),user.getName(),
        user.getLastname(),user.getCellphone(),postsList);

        return null;
    }
}
