package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Theater extends Base{

    private String theaterName ;

    private String city;

    @OneToMany
    @JoinColumn(name = "auditorium_id")
    private List<Auditorium> auditoriumList;

}
