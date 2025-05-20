class divex{
    void divNum(int a ,int b){
        try{
        int c=a/b;
        System.err.println(c);
    }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by Zero  !");
        }
    }
}


public class Error_2 {
    public static void main(String args[])
    {
        divex res=new divex();
        res.divNum(10,0);
    }
}
