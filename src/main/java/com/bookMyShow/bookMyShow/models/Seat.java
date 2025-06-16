package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;

@Entity
public class Seat extends  Base{

    private int row;
    private int column;
    private  int seatNumber;




}
