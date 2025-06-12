package com.bookMyShow.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Show  extends Base{

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String language;

    @ManyToOne
    private  Movie movie;

    @ManyToOne
    private  Auditorium aditorium;



}
