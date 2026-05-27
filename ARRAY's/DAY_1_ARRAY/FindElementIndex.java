import java.util.*;
public class FindElementIndex {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    
    System.out.println("Enter Index Number: ");
    int index = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

    System.out.println(arr[index]);

    }
}
