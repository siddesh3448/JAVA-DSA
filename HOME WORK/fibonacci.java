import java.util.*;
public class fibonacci {
    public static void fibo(int num){

        int first = 0;
        int second = 1;

        for(int i=1;i<=num;i++){
            int series = first + second;
            System.out.print(first+" ");
            first = second;
            second = series;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term: ");
        int n = sc.nextInt();

        fibo(n);

    }
}
