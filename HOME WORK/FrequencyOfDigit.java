import java.util.*;

public class FrequencyOfDigit {

    public static int digit(int num, int digi) {

        int count = 0;

        while (num != 0) {
            int ld = num % 10;
            if (ld == digi) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        System.out.println("Enter the number for which you want to check frequency: ");
        int dig = sc.nextInt();

        System.out.println(digit(n, dig));
    }
}
