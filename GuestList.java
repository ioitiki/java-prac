import java.io.Console;

public class GuestList {
  public static void main(String[] args) {
    String[] peopleList = {"John", "Suzy", "Tim"};
    String[] thingsList = {"Turkey", "Beer", "Wine"};

    for (String people : peopleList) {
      if (people.startsWith("J")) {
      System.out.println(peopleList[0] + " should bring " + thingsList[0]);
    } else if (people.startsWith("S")) {
      System.out.println(peopleList[1] + " should bring " + thingsList[1]);
    } else {
      System.out.println(peopleList[2] + " should bring " + thingsList[2]);
    }

  }
}
}
