import java.util.*;
public class EvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int n = sc.nextInt();

        int[] arry = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1)+": ");
            arry[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < arry.length; i++) {
           if(arry[i]%2==0){
                System.out.print("Even numbers are: "+arry[i]+"\n");
           }
        }

    }
}

