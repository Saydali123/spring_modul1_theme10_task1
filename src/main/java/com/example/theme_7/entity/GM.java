package com.example.theme_7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Saydali Murodullayev, Mon 9:44 AM. 3/7/2022
 */
@Getter
@Setter
@Entity
public class GM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String corpName;
    private String directorName;

    @OneToOne
    private Address address;
}
