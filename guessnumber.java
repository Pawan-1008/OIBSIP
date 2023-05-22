import java.util.Random;
import java.util.Scanner;

public class guessnumber{
    public static void main(String[] args) {
        
        Random random1 = new Random();
        int secretnumber = random1.nextInt(100) + 1;    // generate the random number between 1 to 100
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (!hasWon) {                                        // loop will continue until you guess the correct number
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = sc.nextInt();
            attempts++;                                         // counts the attempts you have done

            if (guess == secretnumber) {                       // if the random number between 1 to 100 then the boolean becomes true (hasWon) 
                hasWon = true;
            } else if (guess < secretnumber) {
                System.out.println("Too low! Try again.");   // tells than number is lower than secretNumber 
            } else {
                System.out.println("Too high! Try again.");  // tells than number is greater than secretNumber 
            }
        }

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");     

        // after guessing correct number it tells the total attempts you have done to find the number. 
    }
}
