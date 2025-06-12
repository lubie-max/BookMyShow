package com.bookMyShow.bookMyShow.models;

import com.bookMyShow.bookMyShow.models.constants.Language;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Movie extends Base {
    private String title ;
//    @ManyToMany
    @Enumerated(EnumType.STRING)
    private Language language;




}
