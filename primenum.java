import java.util.Scanner;

public class primenum {
        public static void main(String[] args) {
                int i,j,n,flag=0;
                 n=100;
                for(i=2;i<=n;i++){
                        for(j=i;j<=n/2;j++){
                                if(n%j==0){
                                        System.out.println("it is not prime number");
                                        flag=1;
                                        break;
                                }
                        }
                        if(flag==0){
                               System.out.println(i);  
                        }

                }
        }
}
