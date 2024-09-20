package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3a {
  /**
   * Given a recipeBook containing recipes, returns the title of the last recipe
   * in the array.
   * 
   * Return null if there are no recipes.
   */
  public static Recipe lastRecipe(RecipeBook recipeBook) {
    // TODO
    if (recipeBook.getRecipes().isEmpty()) {
      return null;
    }
    return recipeBook.getRecipes().getLast();
  }
}
