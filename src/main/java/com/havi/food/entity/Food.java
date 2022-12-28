package com.havi.food.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    private String imageUrl;
    private Integer imageCount;
    private LocalDateTime addedTime;
    private Integer quantity;
    private LocalDateTime canceledTime;
    private String availableStatus;

    private Long farmerId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "food_type_id", foreignKey = @ForeignKey(name = "food_fk1_food_type_id"))
    FoodType foodType;
}
