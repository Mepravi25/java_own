import java.util.*;
public class pali {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Are u going to enter Number or String , if number put N or S");
        String str=sc.nextLine();
        if(str.equals("Y")){
            int n=sc.nextInt();
        StringBuilder rev=new StringBuilder(String.valueOf(n));
        int f=Integer.parseInt(rev.reverse().toString());
        System.out.println(f);
        if(f==n){
            System.out.println("It is palindrome !");
        }else{
            System.out.println("It is not a palindrome@$%$ ");
        }
    }else if(str.equals("S")){
        String n=sc.nextLine();
        StringBuilder rev=new StringBuilder(n);
        String f=rev.reverse().toString();
        System.out.println(f);
        if(f.equals(n)){
            System.out.println("It is palindrome !");
        }else{
            System.out.println("It is not a palindrome@$%$ ");
        }
    }
    }
}
