public class Cons {

    int marks;
    String name;

    Cons(int a,String b)
    {
        marks=a;
        name = b;
        System.out.printf("%d %s",a,b);
    }

    public static void main(String args[]){
        Cons ob1=new Cons(10,"Praveen");
        Cons ob2=new Cons(12,"Raghul");
        System.out.println(ob1.name);
    }
}
