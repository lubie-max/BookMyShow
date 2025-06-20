package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Users extends  Base {


    private String username ;
    private String email ;
    private String password ;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Ticket> tickets;




}
