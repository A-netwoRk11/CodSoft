package Java;

import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int min = 1;
        int max = 100;
        int playTime = 10;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to my number game..!!\nThis is the game of mind and guessing");

        while(playAgain)
        {
            int randomNum = r.nextInt(max - min + 1) + min;
            System.out.println("I'm picked a number between 1 to 100, can you gess what the number is??");
            int attempt = 0;
            boolean CorrectGuess = false;
            for(attempt = 0 ; attempt < playTime  ; attempt++)
            {
                System.out.print("Enter your guessed number: ");
                int guessNum = sc.nextInt();

                if (guessNum == randomNum)
                {
                    System.out.println("Yeah! You guessed the correct number in " + attempt + " attempts.");
                    score++;
                    CorrectGuess = true;
                    break;
                } 
                else if (guessNum > randomNum) 
                {
                    System.out.println("Too high! Please input next number.");
                } 
                else
                {
                    System.out.println("Too low! Please input next number.");
                }
            }

            if (!CorrectGuess) {
                System.out.println("Sorry, Your attempts are complete. You're fail to guess right number.! \nYour Score is "+ score + " \nThe correct number was " + randomNum + ".");
            }

            System.out.print("Do you want to play again? (1/0): ");
            String playAgainResponse = sc.next().toLowerCase();
            if (!playAgainResponse.equals("1"))
            {
                playAgain = false;
            }
        }
        sc.close();
    }
}
