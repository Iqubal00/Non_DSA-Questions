import java.util.*;

public class inverse {

    public static int inverse1(int num){
        int res=0;
        int pos=1;
        while(num!=0){
            int lastdigit = num % 10;
            res = (int) (res + pos * Math.pow(10,lastdigit-1));
            num = num/10;
            pos++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = inverse1(num);
        System.out.println(result);

    }
}