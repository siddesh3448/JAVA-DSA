import java.util.Scanner;

public class Kthpostionroatation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " elemnt: ");
            arr[i] = sc.nextInt();
        }

        int l = arr.length;

        System.out.print("Enter number of Rotation K = ");
        int k = sc.nextInt();
        
        k = k%l;

        while(k>0){
            int temp = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            k--;
        }
        
        System.out.println();

        System.out.println("After Rotation array become: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
