import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int Binary = num;

        int count = 0;
        // int base = 2;
        int decimal = 0;

        while(num>0){
            int ld = num%10;
            decimal += ld * (int)Math.pow(2, count);
            count++;
            num/=10;

        }
        System.out.println("Binary: "+Binary+" <--> Decimal: "+decimal);

    }
}
