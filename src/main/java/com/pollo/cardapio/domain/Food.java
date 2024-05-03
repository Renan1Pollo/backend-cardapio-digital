package com.pollo.cardapio.domain;

import com.pollo.cardapio.dtos.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="foods")
@Table(name="foods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Double price;

    public Food(FoodRequestDTO data){
        this.id = data.id();
        this.title = data.title();
        this.price = data.price();
        this.image = data.image();
    }
}
