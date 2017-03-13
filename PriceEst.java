import java.io.Console;

public class PriceEst {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("How much does your package weigh?");
    String weightString = console.readLine();
    Integer weightInt = Integer.parseInt(weightString);

    System.out.println("How far do you need to ship?");
    String shipString = console.readLine();
    Integer shipInt = Integer.parseInt(shipString);

    Integer price = (weightInt / 10) + (shipInt / 5);

    System.out.println("Your cost is: $" + price);
  }

  public static void

}
