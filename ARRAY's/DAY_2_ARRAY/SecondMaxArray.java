import java.util.*;

public class SecondMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Is the largest: "+max);
        System.out.println("Is the second largest: "+sec_max);
    }
}