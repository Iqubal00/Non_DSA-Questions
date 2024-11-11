import java.util.*;

public class armstrongNumber {

    public static int power(int base, int exponent){
        int result=1,i;
        for(i=0 ; i<exponent; i++){
            result = base * result;
        }
        return result;
    }
        
    public static void armstrong(int num){
        int count=0,rem,sum=0;
        int temp1=num;
        int temp2 = num;


        while(num!=0){
            num=num/10;
            count++;
        }

        while(temp1!=0){
            rem=temp1%10;
            sum= sum + power(rem,count);
            temp1=temp1/10;
        }

        if( temp2 == sum)
        System.out.println("Armstrong number ");
        else
        System.out.println("Not a armstrong number");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        armstrong(num);
        sc.close();
    }
}
