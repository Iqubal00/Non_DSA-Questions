
import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
