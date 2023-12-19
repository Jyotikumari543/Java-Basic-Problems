import java.util.Scanner;

public class evenodd {
      public static void main(String[] args) {
                System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                int num= obj.nextInt();
                for(int i=1;i<=num;i++){
                 if(i%2==0){
                     System.out.print(" "+i);    
                }
                }
                 
        }  
}
