import java.util.*;
public class Arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i<arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0 ; i<arr.length;i++){
            sum=sum+arr[i];   
        }
        System.out.println(sum);

        sc.close();
    }
}