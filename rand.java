import java.util.Random;
public class rand{
    public static void main(String args[])
    {
        Random r=new Random();
        System.out.printf("%.2f%n",r.nextFloat()*20);
        System.out.println(r.nextInt(10));
        
    }
}


