import java.util.Scanner;

public class ex2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter min:");

            int minutes = sc.nextInt();
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(hours + ":" +remainingMinutes);
        }
}
