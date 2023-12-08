package binghamuni.edu.ng.controller.api;


import binghamuni.edu.ng.Domain.Drink;
import binghamuni.edu.ng.Repository.DrinkRepository;
import binghamuni.edu.ng.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrinks(){

        return ResponseEntity.ok().body(drinkService.getAllDrinks());
    }
    @RequestMapping("/drinks/{id}")
    public ResponseEntity<Drink> getDrinkById(@PathVariable long id){
        return ResponseEntity.ok().body(drinkService.getDrinkById(id));
    }
    @PostMapping("/drinks")
    public ResponseEntity<Drink> createDrink(@RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.saveDrink(drink));
    }
    @PutMapping("/drinks/{id}")
    public ResponseEntity<Drink> updateDrink(@PathVariable long id, @RequestBody Drink drink) {
        return ResponseEntity.ok().body(drinkService.updateDrink(drink));
    }
    @DeleteMapping("/drinks/{id}")
    public HttpStatus deleteDrink(@PathVariable long id){
        drinkService.deleteDrink(id);
        return HttpStatus.OK;
    }
}







