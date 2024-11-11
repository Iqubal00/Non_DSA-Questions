import java.util.*;

public class trailingzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, fact = 1, rem, zeros = 0;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }

        while (fact != 0) {
            rem = fact % 10;
            if (rem == 0)
                zeros++;
            else
                break;
            fact = fact / 10;
        }
        if (zeros > 0)
            System.out.println(" trailing zeros = " + zeros);
    }
}
