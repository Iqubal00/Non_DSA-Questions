import java.util.*;

public class sumrecur {
    public static int rem, sum =0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = sumdigits(num);
        System.out.println(" Sum = " + result);

    }

    public static int sumdigits( int num){
        if(num>0){
            rem =num%10;
            sum = sum + rem;
            sumdigits(num/10);
        }
        return sum;
    }
}
