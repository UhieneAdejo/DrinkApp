package ng.edu.binghamuni.inventoryapplication.controller.api;

import ng.edu.binghamuni.inventoryapplication.Services.DrinkServices;
import ng.edu.binghamuni.inventoryapplication.domain.Drink;
import ng.edu.binghamuni.inventoryapplication.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkAPIController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkServices drinkServices;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrink(){
        return ResponseEntity.ok().body(drinkServices.getAllDrinks());
    }
}
