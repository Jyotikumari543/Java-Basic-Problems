import java.util.Scanner;

public class palindrome {
         
        public static void main(String[] args) {
                int r,sum=0;
                System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                int num= obj.nextInt();
                int temp=num;
                while(num>0){
                        r=num%10;
                        sum=(sum*10)+r;
                        num=num/10;


                }
                if(temp==sum){
               System.out.print(" palindrome number ");

              
                }else{
                        System.out.print( " not palindrome number");
                }

        }
}
