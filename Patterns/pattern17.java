import java.util.Scanner;

public class pattern17 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int n2= n-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i ==0 ||  j== 0 || i == n2 || j==n2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}