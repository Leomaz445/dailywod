package com.example.dailywod;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Workout {
    @Id
    @SequenceGenerator(
            name= "workout_sequence",
            sequenceName = "workout_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "workout_sequence"
    )
    Long id;
    LocalDate date;
    String author;
    String type;
    String description;
    String imgUrl;

    public Workout() {
    }

    public Workout(LocalDate date, String author, String type, String description, String imgUrl) {
        this.date = date;
        this.author = author;
        this.type = type;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "date=" + date +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

}
