package Oop;

record Bike(String brand,int speed){}

public class Record {
    public static void main(String[] args) {
        Bike bike=new Bike("bullet",120);
        System.out.println("Brand is:"+bike.brand());
        System.out.println("Speedis:"+bike.speed());

    }
}
