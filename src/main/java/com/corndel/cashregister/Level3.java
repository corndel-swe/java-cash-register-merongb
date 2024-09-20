package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {
  /**
   * Calculates the total value of all money in the drawer.
   */
  public static int sumDrawer(List<Item> drawer) {
    // TODO
    int sum = 0;
    for (Item item : drawer) {
      sum += item.getQuantity() * item.getValue();
      System.out.println(sum);
    }
    return sum;

  }

}
