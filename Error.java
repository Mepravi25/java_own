import java.util.*;

public class Error {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
        int c=a/b;
        System.out.println(c);
        }
        catch(Exception e ){
            System.out.println("ArithmeticException");
        }
        


        sc.close();
    }
}
