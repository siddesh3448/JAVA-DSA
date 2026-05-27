import java.util.*;

public class LinearSearch {

    public static int Array(int n, int target) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int num = sc.nextInt();

        System.out.println("Enter target element: ");
        int tar = sc.nextInt();

        System.out.println(Array(num, tar));


    }
}
