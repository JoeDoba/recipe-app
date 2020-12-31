package joe.doba.recipeapp.service;

import joe.doba.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
