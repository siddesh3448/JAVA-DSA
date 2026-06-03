// 1. Two Sum :- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " elemnt: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==arr[i]+arr[j]){
                    System.out.println(arr[i]+" "+arr[j]+" are the sum: "+target);
                }
            }
        }

    }
}
