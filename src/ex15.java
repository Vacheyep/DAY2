import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean isOdd;
        isOdd = (num % 2) == 1;
        System.out.println(isOdd);
    }
}