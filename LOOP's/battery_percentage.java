public class battery_percentage {
     public static void main(String[] args) {
        int battery = 10;
        int count = 0;
        while(battery <100){  
            battery += 10;
            count++;
        }
        System.out.println(count);
    }
}
