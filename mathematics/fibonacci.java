import java.util.*;

public class fibonacci {

    public static void printfibonacci(int length) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b);

        for (int i = 0; i < length - 2; i++) {
            c = a + b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series : ");
        int len = sc.nextInt();
        printfibonacci(len);
    }
}