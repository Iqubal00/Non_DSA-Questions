import java.util.*;

public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0,remainder;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        while(num!=0){
            remainder= num%10;
            sum= sum + remainder;
            num = num/10; 
        }
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
