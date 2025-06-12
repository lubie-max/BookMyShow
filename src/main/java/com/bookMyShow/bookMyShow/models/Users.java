package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Users extends  Base {


    private String username ;
    private String password ;


}
