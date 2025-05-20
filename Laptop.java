public class Laptop {
    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String args[])
    {
        Laptop lap1=new Laptop();
        lap1.name="hpp";
        lap1.proc="i5";
        lap1.ram=8;
        lap1.price=50000;
        System.out.println(lap1.price);

        Laptop lap2=new Laptop();
        lap2.name="LEnoVo";
        System.out.printf("%s %n%d" ,lap2.name,lap2.price);
    }
}