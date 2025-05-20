// public class Func {
//     void greeting()
//     {
//         System.out.println("Welcome");
//     }
//     void dummy()
//     {
//         System.out.println("Iam dummy");
//     }
//     public static void main(String args[])
//     {
//         Func obj=new Func();
//         obj.greeting();
//         obj.dummy(); 
//     }
// }
/*public class Func {
    static void greeting()         // it is an static function .
    {
        System.out.println("Welcome");
    }
    void dummy()                  // it is an non static function .
    {
        System.out.println("Iam dummy");
    }
    public static void main(String args[])     //A static function cannot able to call Non static function .
    {                                          // But a static function can call another staic function.
        Func obj=new Func();
        greeting();
        obj.dummy(); 
    }
}*/


public class Func {
    void greeting()
    {
        System.out.println("Welcome");
        dummy();
    }
    void dummy()
    {
        System.out.println("Iam dummy");
    }
    public static void main(String args[])
    {
        Func obj=new Func();
        obj.greeting();
    }
}
