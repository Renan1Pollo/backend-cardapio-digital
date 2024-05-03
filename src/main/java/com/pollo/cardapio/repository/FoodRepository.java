package com.pollo.cardapio.repository;

import com.pollo.cardapio.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
