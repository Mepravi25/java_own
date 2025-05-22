import java.util.*;
public class replace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains(" ")){
            System.out.println(str.replace(" ",""));
        }else{
            System.out.println(str);
        }
    }
}