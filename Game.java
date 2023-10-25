import java.util.Random;
import java.util.Scanner;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");
    Random random = new Random();
    int myInt = random.nextInt(100);
    int count = 0;
    Scanner inputName = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = inputName.nextLine();

    while (1 == 1){
      Scanner inputGuess = new Scanner(System.in);
      System.out.println("Enter your guess:");
      String guessNum = inputGuess.nextLine();

      if(Integer.parseInt(guessNum) > myInt){
        System.out.println("Your guess is too high, try again.");
      }else if(Integer.parseInt(guessNum) < myInt){
        System.out.println("Your guess is too low, try again.");
      }else{
        System.out.println("Well done, "+name+"! You found my number in "+ count +" tries!");
        break;
      }
      count += 1;
    }
    



  }
}
