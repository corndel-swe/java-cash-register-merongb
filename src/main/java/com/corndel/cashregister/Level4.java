package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    // TODO

    if (target <= 0) {
      return true;
    }

    for (Item item : drawer) {
        int itemValue = item.getValue();
        int itemQuantity = item.getQuantity();

        while (itemQuantity > 0 && target >= itemValue) {
          target -= itemValue;
          itemQuantity--;
        }
        if (target == 0) {
          return true;
        }
    }
    return target == 0;

  }
}
