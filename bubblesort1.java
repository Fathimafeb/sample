import java.util.*;

public class bubblesort1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]<arr[j+1]){
                int c=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=c;

            }
        }
    }
}