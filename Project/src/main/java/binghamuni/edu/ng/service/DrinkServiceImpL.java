package binghamuni.edu.ng.service;

import binghamuni.edu.ng.Domain.Drink;
//import org.springframework.project.domain.Drink;
import binghamuni.edu.ng.Repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DrinkServiceImpL implements DrinkService{
    @Autowired
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        Optional<Drink> drink =drinkRepository.findById(id);
        Drink emptyDrink=null;

        if(drink.isPresent()){
            emptyDrink=drink.get();
            return emptyDrink;
        }else{
            throw new RuntimeException("Drink not found");
        }

    }

    @Override
    public List<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }


    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionalDrink =drinkRepository.findById(drink.getId());

        if(optionalDrink.isPresent()){
            Drink updateDrink=new Drink();
            updateDrink.setCapacity(drink.getCapacity());
            updateDrink.setColor(drink.getColor());
            updateDrink.setCompany(drink.getCompany());
            updateDrink.setName(drink.getName());
            updateDrink.setType(drink.getType());
            updateDrink.setId(drink.getId());
            updateDrink.setIngredientList(drink.getIngredientList());

            drinkRepository.save(updateDrink);
            return updateDrink;
        }else{
            throw new RuntimeException("Drink does not exist");
        }

    }

    @Override
    public void deleteDrink(long id) {
        drinkRepository.deleteById(id);

    }
}