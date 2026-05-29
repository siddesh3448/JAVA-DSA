import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                third_max = sec_max;
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                third_max = sec_max;
                sec_max = arr[i];
            } else if (arr[i] > third_max && arr[i] != max && arr[i] != sec_max) {
                third_max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max element of array is: " + max);
        System.out.println("Second Max element of array is: " + sec_max);
        System.out.println("Third Max element of array is: " + third_max);
    }
}
