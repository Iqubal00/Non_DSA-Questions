import  java.util.*;

public class divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int i, count=0;
        for( i=1; i<=num; i++){
            if( num % i == 0)
            count++;
        }
        System.out.println(" No. of divisor of " + num + " = " + count );
        sc.close();
    }
}
