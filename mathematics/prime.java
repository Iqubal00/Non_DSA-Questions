import java.util.*;

public class prime {
    public static void main( String[] args){
        int num , i, count=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        num = sc.nextInt();

        for( i= 1; i<num ; i++){
            if ( num % i == 0)
            count++;
        }
        if( count == 1)
        System.out.println(" Prime number");
        else
        System.out.println(" Not a prime number");
    }
}
