import java.util.*;

public class InputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1)+": ");
            arry[i] = sc.nextInt();
        }

        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }

    }
}