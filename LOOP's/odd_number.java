import java.util.*;

public class odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println(n + " is an Odd Number");
        } else {
            System.out.println(n + " is an Even Number");
        }
    }
}
