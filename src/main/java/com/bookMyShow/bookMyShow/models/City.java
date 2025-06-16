package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class City extends  Base{

    private String cityName ;

    @OneToMany
    List<Theater> theaterList;

}
