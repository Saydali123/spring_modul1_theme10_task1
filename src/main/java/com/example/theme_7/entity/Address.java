package com.example.theme_7.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Saydali Murodullayev, Mon 9:45 AM. 3/7/2022
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double x;
    private double y;

    public Address(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @OneToOne
    private District district;
}
