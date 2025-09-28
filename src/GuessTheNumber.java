import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

/* Generate a random number between 1 and 10.
 Ask user to guess until they get it right.
 */

public static void guessTheNumber() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int randomNum;
    int guessNum;
        
        randomNum = random.nextInt(10) +1;

    do {
        System.out.println("Guess a number between 1 and 10: ");
        guessNum = scanner.nextInt();

        if (guessNum == randomNum) {
               System.out.println("Correct! The Number was " + randomNum);
        }
        else {
               System.out.println("Too low! Try again.");
        }
    }
    while (guessNum != randomNum);

    scanner.close();
}

public static void main (String[] arg) {
    guessTheNumber();
   }

}
