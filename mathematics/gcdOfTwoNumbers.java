import java.util.*;

class gcdOfTwoNumbers {

    public static int gcd(int num1, int num2) {
        int a;
        a = num1 % num2;
        if (a == 0)
            return num2;
        else
            return gcd(num2, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find HCF/GCD : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcdResult = gcd(num1, num2);
        System.out.println("HCF/GCD of numbers " + num1 + " and " + num2 + " = " + gcdResult);

        int lcm = (num1 * num2)/ gcdResult;
        System.out.println(" Lcm = " + lcm);
        sc.close();
    }
}