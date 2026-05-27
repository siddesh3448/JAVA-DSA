import java.util.*;
public class OctalToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Octal Number: ");
        int num = sc.nextInt();

        int Octal = num;

        int count = 0;
        // int base = 2;
        int decimal = 0;

        while(num>0){
            int ld = num%10;
            decimal += ld * (int)Math.pow(8, count);
            count++;
            num/=10;

        }
        System.out.println("Octal : "+Octal +" <--> Decimal: "+decimal);
    }
}