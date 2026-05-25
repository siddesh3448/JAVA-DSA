import java.util.*;
public class NumberOfDigit {
    public static int CountNumberOfDigit(int num){

        int ld = 0;
        int count = 0;
        while(num !=0 ){
            ld = num%10;
            count++;
            num/=10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int  num1 = sc.nextInt();

        System.out.println("Number of digits are: "+CountNumberOfDigit(num1));

        
        sc.close();
    }
}
