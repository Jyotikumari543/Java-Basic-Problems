import java.util.Scanner;

public class reversenum {
        public static void main(String[] args) {
                int n,reverse=0,rem;
        System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                 n= obj.nextInt();
                while(n!=0){
                        rem=n%10;
                        reverse=reverse*10+rem;
                        n=n/10;
                }
                System.out.println("the reverse number is "+reverse);
        }
}
