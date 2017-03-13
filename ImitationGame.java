import java.io.Console;

public class ImitationGame {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Please give us a phrase to encrypt:");
    String phrase = console.readLine();

    String encryptedPhrase = phrase.replaceAll("a", "?");

    System.out.println(encryptedPhrase);
  }
}
