import java.io.Console;

public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = {"ice cream", "hot sauce", "pickles"};
    // Integer[] groceryItemPrices = {3, 6, 4};

     for (Integer index=0; index < myGroceryList.length; index++) {
       System.out.println (myGroceryList[index]);
     }

    // for (String groceryItem : myGroceryList) {
    //   System.out.println(groceryItem);
    // }
    //
    // Integer total = 0;
    // for (Integer price : groceryItemPrices) {
    //   total = total + price;
    // }

    // System.out.println("Your total for this shopping trip will be: $" + total);
  }
}
