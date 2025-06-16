package com.bookMyShow.bookMyShow.mappers;

import com.bookMyShow.bookMyShow.dtos.UserSignInDTO;
import com.bookMyShow.bookMyShow.dtos.UserSignUpDTO;
import com.bookMyShow.bookMyShow.models.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapperUtil {


    public Users dtoToModel(UserSignUpDTO userSignUpDTO) {

        Users user = new Users();
//        user.setId(null);
        user.setUsername(userSignUpDTO.getUsername());
        user.setPassword(userSignUpDTO.getPassword());
        user.setEmail(userSignUpDTO.getEmail());
        return user;
    }


    public UserSignInDTO modelToDto(Users user) {

        UserSignInDTO userSignInDTO = new UserSignInDTO();
//        userSignInDTO.setId(user.getId());

        userSignInDTO.setUsername(user.getUsername());
        userSignInDTO.setEmail(user.getEmail());

        return userSignInDTO;

    }
}
