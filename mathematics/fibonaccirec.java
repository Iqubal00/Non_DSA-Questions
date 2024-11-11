import java.util.*;


public class fibonaccirec {
    static int n1=0,n2=1,n3=0;
    public static void main(String[] args) {
        System.out.print("Enter the length of the fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        fibonacci(len-2);
    }

    public static void fibonacci(int len){
        if(len>0){
            n3=n1+n2;
            System.out.print(n3+ " ");
            n1=n2;
            n2=n3;
            fibonacci(len-1);
        }
    }
}
