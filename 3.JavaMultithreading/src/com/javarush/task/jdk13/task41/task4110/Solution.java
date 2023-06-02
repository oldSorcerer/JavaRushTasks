package com.javarush.task.jdk13.task41.task4110;

import com.javarush.task.jdk13.task41.task4110.builders.PizzaBuilder;
import com.javarush.task.jdk13.task41.task4110.builders.PizzaRecipeBuilder;
import com.javarush.task.jdk13.task41.task4110.director.Director;
import com.javarush.task.jdk13.task41.task4110.pizzas.Pizza;
import com.javarush.task.jdk13.task41.task4110.pizzas.Recipe;

/* 
Все ходы записаны
*/

public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
