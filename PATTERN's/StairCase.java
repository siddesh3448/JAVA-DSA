import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int stars = 2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i%2==0){
                stars += 2;
            }
        }
    }
}