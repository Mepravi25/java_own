class Vehical {
    String brand;
    int year;
    void SrtEn(){
        System.out.println("!!!..THE VEHICAL GET STARTED..!!!");
    }
}

class Car extends Vehical{
    String fuelty;
    void SrtEn(){
        System.out.println("Car engine starts....");
    }
    void driver(){
        System.out.println("Car is driving !");
    }
}


class Truck extends Vehical{
    int locap;
    void SrtEn(){
        System.out.println("Truck engine start  ");

    }
    void haul(){
        System.out.println("Truck is hauling ");
    }
}
public class newinheri {
    public static void main(String[] args) {
        Car c=new Car();
        Truck t=new Truck();

        c.brand="Benz";
        c.year=2020;
        c.fuelty="Deisel";
        c.SrtEn();
        c.driver();

        t.brand="Mahendra";
        t.year=2011;
        t.locap=50;
        t.SrtEn();
        t.haul();
    }
}
