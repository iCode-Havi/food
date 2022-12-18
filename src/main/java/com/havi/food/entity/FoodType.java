package com.havi.food.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class FoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodTypeId;
    private String type;
    private String description;
    private LocalDateTime timePeriod;
    private Integer availableQuantity;

    @OneToMany(mappedBy = "foodType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<Food> foods = new HashSet<>();

    @OneToMany(mappedBy = "foodType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<FoodTypeArea> foodTypeAreas = new HashSet<>();

}
