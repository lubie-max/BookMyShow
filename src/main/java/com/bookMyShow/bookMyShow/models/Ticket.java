package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;

@Data
@Entity
public class Ticket extends  Base{

    @OneToMany
    @JoinColumn(name = "ticket_id")
    private  List<ShowSeat> showSeatList;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private   Show show;


    double totalPrice;

    @ManyToOne
    private Users user;







}
