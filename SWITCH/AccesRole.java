import java.util.Scanner;

public class AccesRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        switch (role) {
            case "admin":
                System.out.println("You have admin access");
                break;
            case "Teacher":
                System.out.println("You have Teacher access");
                break;
            case "Student":
                System.out.println("You have Student access");
                break;
            case "guest":
                System.out.println("You have guest access");
                break;
            default:
                System.out.println("Invalid Input: ");
                
        }
    }
}