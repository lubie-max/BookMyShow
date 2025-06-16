package com.bookMyShow.bookMyShow.controllers;


import com.bookMyShow.bookMyShow.dtos.UserSignInDTO;
import com.bookMyShow.bookMyShow.dtos.UserSignUpDTO;
import com.bookMyShow.bookMyShow.mappers.UserMapperUtil;
import com.bookMyShow.bookMyShow.models.Users;
import com.bookMyShow.bookMyShow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapperUtil userMapperUtil;
    @PostMapping()
    public ResponseEntity SignUp(@RequestBody UserSignUpDTO userSignUpDTO) {

        Users user = userMapperUtil.dtoToModel(userSignUpDTO);
        UserSignInDTO responseDto = userService.createUser(user);
        return ResponseEntity.ok(responseDto);

    }

}
