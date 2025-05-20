class Animal{
    String name;
    int age;
    void mksound()
    {
        System.out.println("Animal makes sound !");
    }
}
class Dog extends Animal{
    String breed;
    void mksound(){
        System.out.println("Dog Barks..!!");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animal{
    String color;
    void mksound(){
        System.out.println("Cat meow");
    }
    void climb(){
        System.out.println("Cat climbs ");
    }
}


public class Prinheri {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Ben";
        d1.age=3;
        d1.breed="Golden";
        d1.mksound();
        d1.fetch();

        Cat c=new Cat();
        c.name="Tom";
        c.age=5;
        c.color="Black";
        c.mksound();
        c.climb();
    }
}
