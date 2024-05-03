package com.pollo.cardapio.controller;

import com.pollo.cardapio.domain.Food;
import com.pollo.cardapio.dtos.FoodRequestDTO;
import com.pollo.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public ResponseEntity<Food> createFood(@RequestBody FoodRequestDTO foodRequest){
        Food newFood = foodService.createFood(foodRequest);
        return new ResponseEntity<>(newFood, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoods(){
        List<Food> foodList = this.foodService.getAllFoods();
        return new ResponseEntity<>(foodList, HttpStatus.OK);
    }

}
