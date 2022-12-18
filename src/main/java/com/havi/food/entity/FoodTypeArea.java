package com.havi.food.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FoodTypeArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FoodTypeAreaId;
    private Integer AreaQuantity;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "food_type_id", foreignKey = @ForeignKey(name = "food_type_area_fk1_food_type_id"))
    FoodType foodType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "area_id", foreignKey = @ForeignKey(name = "food_type_area_fk2_area_id"))
    Area area;
}
