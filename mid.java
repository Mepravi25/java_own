import java.util.*;
public class mid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid=(arr.length)/2;
        System.out.println(arr[mid]);
    }
}