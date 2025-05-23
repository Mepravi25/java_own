import java.util.*;
public class rev{
    public static void main(String argss[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder o=new StringBuilder(str);
        String rev=o.reverse().toString();
        System.out.println(rev);
    }
}