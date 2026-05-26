import java.util.*;

public class NumberGame {

    public static void Game(int target){
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while(guess != target){
            System.out.print("Enter guessed number: ");
            guess = sc.nextInt();

            if(guess < target){
                System.out.println("Too low");
            } else if(guess > target){
                System.out.println("Too high");
            } else {
                System.out.println("Correct Guess!!!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number between 1-100: ");
        int n = sc.nextInt();

        Game(n);

        sc.close();
    }
}