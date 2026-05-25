import java.util.*;
public class NumberGame {
    public static void Game(int num, int guessed){
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        while(guess==guessed){
            System.out.println("Enter guessed number: ");
            guess = sc.nextInt();
            if(guess>=50){
                System.out.println("Too low");
            }else if(guess<=100){
                System.out.println("Too High");
            }else if(guess==guessed){
                System.out.println("Correct Guess!!!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number btw 1-100");
        int n = sc.nextInt();

       
        int g = sc.nextInt();

        Game(n, g);
        
    }
}
