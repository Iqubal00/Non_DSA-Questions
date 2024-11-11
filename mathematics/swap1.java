import java.util.*;

public class swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;
        System.out.println("Enter num1 : ");
        num1= sc.nextInt();
        System.out.println("Enter num2 : ");
        num2= sc.nextInt();

        temp=num1;
        num1=num2;
        num2=temp;
        System.out.print("num1 = " + num1 + " num1 = " + num2);
    }
}
