package binghamuni.edu.ng.service;


import binghamuni.edu.ng.Domain.Drink;

import java.util.List;

public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrinks();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);
}

