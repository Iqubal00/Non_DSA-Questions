import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i, fact=1;
    
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        for( i= 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " = " + fact );
        sc.close();
    }
}
