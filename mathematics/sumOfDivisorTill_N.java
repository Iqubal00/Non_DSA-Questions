import  java.util.*;

public class sumOfDivisorTill_N {

        public static long sumOfDivisors(int n) {
            long sum = 0;
            
            
            for (int i = 1; i <= n; i++) {
                sum += (n / i) * i;
            }
            
            return sum;
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        long result = sumOfDivisors(num);

        System.out.println("Sum of Divisors till " + num + " =  : " + result);
        sc.close();
    }
}


