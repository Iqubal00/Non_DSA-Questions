import java.util.Scanner;

public class benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of bulbs/ fluctuations: ");
        int n = sc.nextInt();
        
        for( int i=1; i*i<=n; i++){
            System.out.println(i*i);
        }
        sc.close();
    }
}