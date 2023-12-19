import java.util.Scanner;

public class leapyear {
     public static void main(String[] args) {
                System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                int num= obj.nextInt();
                if(num%4==0&&num%400==0){
                     System.out.print(num+ " is leap number ");    
                }else{
                         System.out.print(num+ " is not leap number ");
                }
        }   
}
