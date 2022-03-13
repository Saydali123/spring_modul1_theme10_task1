package com.example.theme_7.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Saydali Murodullayev, Mon 9:54 AM. 3/7/2022
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
public class AutoShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private GM gm;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Car> cars;
}
