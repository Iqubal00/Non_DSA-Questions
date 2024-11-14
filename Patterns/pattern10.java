import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        for(int i=n; i>0; i--){
            for(char ch ='A'; ch < 'A'+i ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
