package com.bookMyShow.bookMyShow.services;

import com.bookMyShow.bookMyShow.dtos.UserSignInDTO;
import com.bookMyShow.bookMyShow.dtos.UserSignUpDTO;
import com.bookMyShow.bookMyShow.exceptions.UserAlreadyExistsException;
import com.bookMyShow.bookMyShow.mappers.UserMapperUtil;
import com.bookMyShow.bookMyShow.models.Users;
import com.bookMyShow.bookMyShow.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserMapperUtil userMapperUtil;

    public UserSignInDTO createUser(Users user) {
        Optional<Users> ifUser = userRepo.findByEmail(user.getEmail());

        if (ifUser.isPresent()) {

            System.out.println("User in DB ---> " + ifUser);
            throw new UserAlreadyExistsException("Email already registered!");
        }
        else{

        Users savedUser = userRepo.save(user);
        return userMapperUtil.modelToDto(savedUser);
        }

    }


}
