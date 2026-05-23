import java.util.Scanner;

public class AddThree {
    
    static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int result = add(x, y, z);

        System.out.println("Sum = " + result);

        sc.close();
    }
}