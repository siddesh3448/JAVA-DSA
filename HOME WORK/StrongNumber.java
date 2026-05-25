import java.util.*;
public class StrongNumber{

    public static int factorial(int num){
        int facto = 1;
        for(int i=num;i>=1;i--){
            facto = facto*i;
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int og = num;
        int sum = 0;

        while(num!=0){
            int ld = num%10;
            int digit = factorial(ld);
            sum += digit;
            num/=10;
        }
        System.out.println(sum);
        if(sum==og){
            System.out.println("Strong");
        }else{
            System.out.println("Not Strong");
        }
    }
}