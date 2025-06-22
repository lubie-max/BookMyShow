package com.bookMyShow.bookMyShow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Auditorium extends  Base {

    private String auditoriumName;
    private int capacity ;

    @OneToMany
    private List<MovieShow> showList;
}
