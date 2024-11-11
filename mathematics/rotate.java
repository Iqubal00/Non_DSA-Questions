import java.util.*;

public class rotate {

    public static int rotate1(int num, int rotate){
        int digits=0;
        int number=num;

        while(number!=0){
            number = number/10;
            digits++;
        }

        rotate = rotate %  digits;
        if( rotate < 0 ){
            rotate = rotate + digits;
        }

        int div=1;
        int mult=1;

        for(int i=1; i<=digits; i++){
            if( i<=rotate){
                div=div*10;
            } else {
                mult = mult *10;
            }
        }

        int quo = num / div;
        int rem = num % div;
            
        int result = rem * mult + quo; 
        return result;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Enter no.of rotation : ");
        int rotate=sc.nextInt();

        int result = rotate1(num, rotate);
        System.out.println(result);
    }
}
