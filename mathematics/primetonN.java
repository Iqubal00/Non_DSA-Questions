import java.util.Scanner;

public class primetonN {
    public static void main( String[] args){
        int num , i,j ;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        num = sc.nextInt();

        for( i= 1; i<=num ; i++){
            int count =0;
            for(j=1; j<i ; j++){
            if ( i % j == 0)
            count++;
        }
        if( count==1 )
        System.out.println(" prime no. = " + i );
    }
 }

}
