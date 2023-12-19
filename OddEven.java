import java.util.Scanner;

public class OddEven{
        public static void main(String[] args) {
                System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                int num= obj.nextInt();
                if(num%2==0){
                     System.out.print(num+ " is an even number ");    
                }else{
                         System.out.print(num+ " is an odd number ");
                }
        }
}