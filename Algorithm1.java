import java.util.*;

public class Algorithm1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int flag=1;
         int half_of_the_number=n/2;

        for(int i=2;n<=half_of_the_number;i++){
            if(n%i==0){
                flag=0;
            }
        }

        if(flag==0){
            System.out.println("N is not Prime");
        }
        else{
            System.out.println("N is prime");
        }
    }

}


    

