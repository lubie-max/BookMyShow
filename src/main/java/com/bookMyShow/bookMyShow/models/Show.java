package com.bookMyShow.bookMyShow.models;

import com.bookMyShow.bookMyShow.models.constants.ShowStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Show  extends Base{

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String language;

    @ManyToOne
    private  Movie movie;

    @ManyToOne
    private  Auditorium aditorium;

    @Enumerated(EnumType.STRING)
    ShowStatus showSeatStatus;


}
