import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int sum = 0;
        int place = 1;

        while(num!=0){
            int rem = num%2;
            sum = sum + rem * place;
            place *= 10;
            num/=2;
            
        }
        System.out.print(sum);

        
    }
}
