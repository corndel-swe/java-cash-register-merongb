package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;

public class Exercise2a {
  /**
   * Given a list of recipes, return the number of vegetarian recipes in the list.
   */
  public static int countVeggies(List<Recipe> recipes) {
    // TODO

    int sum = 0;
    for (Recipe recipe : recipes) {
      if (recipe.isVegetarian()) {
        sum++;
      }
    }

    return sum;
  }
}
