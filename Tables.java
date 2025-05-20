import java.util.*;
public class Tables
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Table : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int m=n*i;
            System.out.println(n+"X"+i+"="+m);
        }

        sc.close();
    }
}