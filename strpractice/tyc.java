import java.util.*;
public class tyc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        String[] arr=sen.split("\\s+");
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        int str=0;
        int num=0;
        int dou=0;
        for(String i: arr){
            if(i.matches("\\d+")){
                num++;   
            }
            else if(i.matches("\\d+\\.\\d+")){
                dou++;
            }else if(i.matches("[a-zA-z]+")){
                str++;
            }
        }
        System.out.println("String Count "+ str);
        System.out.println("Integer Count "+ num);
        System.out.println("Double Count "+ dou);
        sc.close();
    
}
}