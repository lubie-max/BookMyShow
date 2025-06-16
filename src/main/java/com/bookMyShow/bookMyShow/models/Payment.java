package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Payment extends  Base{

    private  int amount ;
    private LocalDateTime PaymentTime;
    private String PaymentStatus ;

    @OneToOne
    private Ticket ticket ;


}
