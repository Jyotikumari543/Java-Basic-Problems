import java.util.Scanner;

public class armstrong {
        public static void main(String[] args) {
               int r,sum=0;
                System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                int num= obj.nextInt();
                int temp=num;
                while(num>0){
                        r=num%10;
                        sum=sum+(r*r*r);
                        num=num/10;


                }
                if(temp==sum){
               System.out.print(" armstrong number ");

              
                }else{
                        System.out.print( " not armstrong number");
                } 
        }
}
