package binghamuni.edu.ng.Repository;

import binghamuni.edu.ng.Domain.Drink;
//import binghamuni.edu.ng.project.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Query;

//import java.util.List;


//CRUD FUNCTIONALITY HANDLED
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
//    @Query("")
//    List<Drink> findDrinkByPriceGreaterThan(int price);
}
