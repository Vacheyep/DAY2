import java.util.Scanner;

public class ex16to18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num / 10 % 10);
        System.out.println(num / 100);
        System.out.println(num / 100 + num / 10 % 10 + num % 10);
    }
}
