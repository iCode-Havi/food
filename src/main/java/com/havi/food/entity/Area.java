package com.havi.food.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long areaId;
    private String District;
    private String Name;

    @OneToMany(mappedBy = "area", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<FoodTypeArea> foodTypeAreas = new HashSet<>();

}