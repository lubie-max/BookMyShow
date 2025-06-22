package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ShowSeat extends Base {

    private int price;

    @ManyToOne
    private MovieShow show;

    @ManyToOne
    private Seat seat;



}
