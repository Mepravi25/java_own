class A{
    int one = 1;
}
class B extends A{
    int two=2;
}
class C extends B{
    int three=3;
}


public class Tyinheri {
    public static void main(String[] args) {
        C ob=new C();
        System.out.println(ob.three);
        System.out.println(ob.two);
        System.out.println(ob.one);
    }
}
