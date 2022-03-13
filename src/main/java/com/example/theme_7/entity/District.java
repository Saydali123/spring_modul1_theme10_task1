package com.example.theme_7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Saydali Murodullayev, Mon 10:35 AM. 3/7/2022
 */
@Getter
@Setter
@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Region region;

    private String name;


}
