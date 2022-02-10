import java.util.Scanner;

public class GuessingGameApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess a number!");
        System.out.println("Enter 0 if you need help");
        int rightNum =(int)(Math.random() * 10) +1;
        int tries = 0;
        while (tries != 3) {
            int guess = userInput.nextInt();
            if (guess == rightNum) {
                System.out.println("You have won the game!!!");
                System.exit(0);
            }
            else if (guess == 0) {
                System.out.println("Choose a number between 1 - 10");
            }
            else if (guess != rightNum && guess != 0 && guess != -1) {
                tries++;
                if (guess < rightNum && tries < 3) {
                    System.out.println("The number is higher than that. Try again");
                    }
                else if (guess > rightNum && tries < 3) {
                    System.out.println("The number is lower than that. Try again");
                }
            }
            else if (guess == -1) {
                break;
            }
        }
        System.out.println("You have lost the game");
        userInput.close();
    }
}