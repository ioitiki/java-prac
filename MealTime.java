import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    mealInput("breakfast");
    mealInput("lunch");
    mealInput("dinner");
  }

  public static void mealInput(String meal) {
    Console console = System.console();
    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = console.readLine();
    System.out.println("You had " + yourMeal + " for " + meal + ".");
  }
}
