package binghamuni.edu.ng.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Ingredient")
public class Ingredient {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient() {
    }

    public Ingredient(Long id, String name, String ingredient) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
    }

    @Id
    private Long id;
    private String name;
    private String ingredient;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
