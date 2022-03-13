package com.example.theme_7.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Saydali Murodullayev, Mon 9:58 AM. 3/7/2022
 */

@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private Double price;

    private Byte madeYear;

    private String stateNumber;

    private String type;

    @ManyToOne
    private Region region;


}
