import java.util.Scanner;

public class SolidSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                if (i*i + j*j <= r*r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}