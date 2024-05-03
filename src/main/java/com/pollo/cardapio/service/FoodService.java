package com.pollo.cardapio.service;

import com.pollo.cardapio.domain.Food;
import com.pollo.cardapio.dtos.FoodRequestDTO;
import com.pollo.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repository;

    public List<Food> getAllFoods() {
        return this.repository.findAll();
    }

    public Food createFood(FoodRequestDTO data){
        Food newFood = new Food(data);
        this.saveFood(newFood);
        return newFood;
    }

    public void saveFood(Food food){
        this.repository.save(food);
    }
}
