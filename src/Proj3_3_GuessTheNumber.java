import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int randomNumber;
        int input;
        int guessCount = 0;


        randomNumber = random.nextInt(100) + 1;

        System.out.println("Guess the number!");
        input = keyboard.nextInt();
        guessCount++;

        while (input != randomNumber) {
            if (input >= 100 || input <= 0) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            } else if (input > randomNumber) {
                System.out.println("Your guess was too high!");
            }
            else {
                System.out.println("Your guess was too low!");

            }
            System.out.println("guess again!");
            input = keyboard.nextInt();
            guessCount++;


        } // end while
        System.out.println("congrats, you guessed in " + guessCount + " guesses! Thanks for playing!");

    }
}
