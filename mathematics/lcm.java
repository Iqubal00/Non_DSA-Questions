import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int num1, num2, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for( i=1; i< num1 * num2; i++){
            if( (i % num1 == 0) && (i % num2 ==0) )
            break;
        }
        System.out.println(" LCM of numbers " + num1 + " and " + num2 + " = " + i);
        sc.close();
    }
}
