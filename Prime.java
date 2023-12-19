import java.util.Scanner;

public class Prime {
         public static void main(String args[])
         {
                int i,n,flag=0;
                 System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                 n= obj.nextInt();
                 for(i=2;i<=n/2;i++){
                        if(n%i==0){
                             System.out.print("it is not prime number ");  
                             flag=1;
                             break;

                        }
                         
                 }
                 if(flag==0){
                         System.out.print("it is  prime number ");         
                        }
         }
}
