import java.util.Scanner;

public class pattern8 {
    public static void nBinaryTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                System.out.print(1+" ");
                } else {
                System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        nBinaryTriangle(n);
    }
}