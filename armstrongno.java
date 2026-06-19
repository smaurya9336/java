import java.util.*;
public class armstrongno {

     public static void main(String[] args) {
         int num,rem,sum=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("please enter element:\n");
         num=sc.nextInt();
         int temp=num;
         while(num!=0){
             rem=num%10;
             sum=sum+(rem*rem*rem);
             num=num/10;
         }
         if(temp==sum){
             System.out.println("Number is Armstrong");
         }
         else{
             System.out.println("Number is not Armstrong");
         }
        
    }
}
