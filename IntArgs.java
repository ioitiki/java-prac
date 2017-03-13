package com.guest.epicodus;

// import java.io.Console;

public class IntArgs {
  public static String returnString(String string, int integer) {
    // Console console = System.console();
    //
    // System.out.println("type a word");
    // String word = console.readLine();
    //
    // System.out.println("type a number between 1 and 10");
    // String numberString = console.readLine();
    // Integer numberInt = Integer.parseInt(numberString);
    String somestring = string;

    for (int index = 0; index < integer; index++) {
      System.out.println(somestring);
      return somestring;
    }

  }

      //Hey guys,  something isn't getting returned correctly and that's part of the issue. If you run this code now, the error disappears. You need a return statement that returns a string at the end of your method for sure.

      //It seems like you cannot return something in a for loop here without creating a problem. I feel that's context specific and unlikely to be a problem when we are calling methods in apps we write outside of the repl.
}
