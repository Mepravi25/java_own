import java.util.Scanner;

public class School {
    String pf(int m)
    {
        if(m>34){
            return "Pass";
        }
        else
        {
            return "fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        School obj=new School();
        String y=obj.pf(s);
        System.out.println(y);
    }
}
