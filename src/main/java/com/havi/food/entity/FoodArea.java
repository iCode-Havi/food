package com.havi.food.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class FoodArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FoodTypeId;
    private Integer AreaQuantity;

}
