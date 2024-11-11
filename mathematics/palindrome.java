import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num , rem, sum=0;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int temp = num;
        while(num!=0){
            rem=num%10;
            sum=sum *10 + rem;
            num=num/10;
        }
        if(temp == sum)
        System.out.println(temp + " is a Palindrome No.");
        else
        System.out.println(temp + " is not a Palindrome number");
        sc.close();
    }
    
}
