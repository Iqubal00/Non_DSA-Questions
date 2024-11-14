
import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            //stars
            for(int j=n; j>i; j--){
                System.out.print("*");
            }

            //space
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<2*n-(2*i+2); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
