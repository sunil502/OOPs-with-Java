package Multithreading;

class ATM{
    public void checkBalance(String name) {
        System.out.println(name + "Checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e){}
        System.out.println("Balanced");
    }
    public void withdraw(String name,int amount) {
        System.out.println(name + "withdrawing");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(amount);
    }
}

class Customer extends  Thread{
    String name;
    int amount;
    ATM atm;
    Customer(String n,ATM a,int amt){
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
    public void run(){
        useATM();
    }
}


public class SyncATM {
    public static void main(String[] args){
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,200);
        Customer c2=new Customer("john",atm,100);
        c1.start();
        c2.start();
    }
}
