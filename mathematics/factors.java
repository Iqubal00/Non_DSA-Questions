import java.util.*;

public class factors {

    public static void factor(int num) {
        int i;
        for (i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num = num / i;
            }
        }
        if (num > 2)
            System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        factor(num);
    }
}
