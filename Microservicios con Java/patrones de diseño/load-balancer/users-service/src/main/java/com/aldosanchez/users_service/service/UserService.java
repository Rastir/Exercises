package com.aldosanchez.users_service.service;

import com.aldosanchez.users_service.dto.PostDTO;
import com.aldosanchez.users_service.dto.UserDTO;
import com.aldosanchez.users_service.model.User;
import com.aldosanchez.users_service.repository.IPostsAPI;
import com.aldosanchez.users_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    public IUserRepository userRepo;

    @Autowired
    public IPostsAPI apiPost;

    @Override
    public UserDTO getUserAndPost(Long user_id) {

        //traer los datos del usuario de la base de datos

        User user = userRepo.findById(user_id).orElse(null);

        // una vez traidos los datos, traer los posteos
        //traer posteos desde la api de posteos

        List<PostDTO> postList = apiPost.getPostByUserId(user_id);

        //unificar datos del usuario mas posteos  (user + dto)

        UserDTO userDTO = new UserDTO(user.getUser_id(),user.getName(),
                                        user.getLastname(),user.getCellphone(),
                                        postList);
        return userDTO;
    }
}
