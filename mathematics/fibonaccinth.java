import java.util.*;

public class fibonaccinth {
    public static void main(String[] args) {
        int num, a=0, b=1, c=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find nth fibonacci series : ");
        num = sc.nextInt();
      

        for(i=0; i<num-2; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(num+ "th number is = " + c);
    }
}
