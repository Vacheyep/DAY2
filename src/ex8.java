import java.util.Scanner;

public class ex8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s =3 * n * n - 12 * n;
          if (n == 10) {
              System.out.println(s);
          }
              else if (n == 15) {
              System.out.println(s);
              }
              else
              System.out.println("wrong n");


    }
}
