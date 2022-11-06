package com.havi.food.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long imageUrl;
    private Integer imageCount;
    private LocalDateTime addedTime;
    private Integer quantity;
    private LocalDateTime canceledTime;
    private String availableStatus;
}
