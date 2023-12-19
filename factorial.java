import java.util.Scanner;

public class factorial {
        public static void main(String[] args) {
                int i, fact=1,num;
                 System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                 num= obj.nextInt();
                 for(i=1;i<=num;i++){
                        fact=fact*i;
                 }
                  System.out.print("the factorial of num is "+fact);

        }
}
