import java.util.*;

public class second_last {
    public static int lastNum(int num) {
        int ld = 0;
        int count = 0;

        while (num != 0) {
            ld = num % 10;
            count++;
            
            num /= 10;
            if (count == 2) {
                
                if (ld % 2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        System.out.println(lastNum(num));
    }
}
