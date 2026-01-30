package Interitance;

class Car{
    public void start(){
        System.out.println("car started");
    }
    public void acclerated(){
        System.out.println("Car is accelerated");
    }
    public void chageGear(){
        System.out.println("Car gear changed");
    }
}

class LuxuryCar extends Car{
    @Override
    public void chageGear(){
        System.out.println("Automatic gear changed");
    }
    public void openRoof(){
        System.out.println("Sun roof is opened");
    }
}

public class overridingCar {
    public static void main(String[] args){
//        Car c=new Car();
//        c.start();
//        c.acclerated();
//        c.chageGear();

//        LuxuryCar lc=new LuxuryCar();
//        lc.start();
//        lc.acclerated();
//        lc.chageGear();
//        lc.openRoof();

        Car c=new LuxuryCar();
        c.start();
        c.acclerated();
        c.chageGear();

    }
}
