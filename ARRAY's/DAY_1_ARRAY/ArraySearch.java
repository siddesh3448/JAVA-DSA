import java.util.*;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter number for search: ");
        int index = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(index==arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println();
            System.out.println("-1");

    }
}
