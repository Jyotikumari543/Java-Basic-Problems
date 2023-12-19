import java.util.Scanner;

public class sumofnum {
        public static void main(String[] args) {
                int sum=0,num,i;
                 System.out.print("Enter num: ");
                Scanner obj= new Scanner(System.in);
                 num= obj.nextInt();
                 for(i=1;i<=num;i++){
                        sum=sum+i;
                 }
                 System.out.print("sum of number is "+sum);
        }
}
