import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int n = sc.nextInt();

        for( int i=1; i<=n; i++){
            for( int j =1; j<=n; j++){
                if(i+j > n){ 
                System.out.print( "*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}