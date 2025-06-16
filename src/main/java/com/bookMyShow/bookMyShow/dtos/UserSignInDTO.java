package com.bookMyShow.bookMyShow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserSignInDTO {

    String username;
    String email;
}
