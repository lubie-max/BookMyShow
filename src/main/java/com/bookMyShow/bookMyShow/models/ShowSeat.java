package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ShowSeat extends Base {

    private int price;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;



}
