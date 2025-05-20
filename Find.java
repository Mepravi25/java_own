import java.util.*;
public class Find {
    void oodoreve(int x)
    {
        if(x%2==0)
            System.out.println("It is even");
        else
            System.out.println("It is odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Find obj=new Find();
        obj.oodoreve(n);
    }
}
