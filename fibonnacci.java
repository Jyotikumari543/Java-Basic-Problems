import java.util.Scanner;

public class fibonnacci {
     public static void main(String[] args) {
        int i,n1=0,n2=1,n3,num;
         System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
               num= obj.nextInt();
               System.out.print(n1+" "+n2);
               for(i=2;i<=num;i++){
                 n3=n1+n2;
                  System.out.print(" "+n3+" ");
                  n1=n2;
                  n2=n3;
               }
     }   
}
