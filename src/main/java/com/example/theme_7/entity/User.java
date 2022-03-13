package com.example.theme_7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Saydali Murodullayev, Mon 10:37 AM. 3/7/2022
 */
@Getter
@Setter
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Car> cars;


}
