public class Short_Circuit {
    public static void main(String[] args) {
        int a = 5;

        if (a < 10 || a++ > 20) {
            System.out.println("Condition 1 is True");
        } else {
            System.out.println("Condition 1 is False");
        }
        System.out.println("Value of a after || : " + a);

        if (a < 10 | a++ > 20) {
            System.out.println("Condition 2 is True");
        } else {
            System.out.println("Condition 2 is False");
        }
        System.out.println("Value of a after | : " + a);
    }
}