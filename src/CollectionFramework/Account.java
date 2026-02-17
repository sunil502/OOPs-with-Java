package CollectionFramework;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account1 implements Serializable{
    String accout;
    String name;
    double balance;

    Account1(){}

    public Account1(String a, String n, double b) {
        this.accout = a;
        this.name = n;
        this.balance = b;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "accout='" + accout + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Account {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Account1 acc=null;
        HashMap<String,Account1> hm=new HashMap<>();

        try{
            FileInputStream fis=new FileInputStream("Accounts:txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int count=ois.readInt();
            for(int i=0;i<count;i++){
                acc=(Account1) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accout,acc);
            }
            fis.close();
            ois.close();
        }
        catch (Exception e){

        }
        FileOutputStream fos=new FileOutputStream("Account.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        System.out.println("Menu");

        int Choice;
        String accout,name;
        double balance;

        do{
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Account");
            System.out.println("5. Save Account");
            System.out.println("6. Exit Account");
            System.out.println("Enter your choice");
            Choice=sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (Choice){
                case 1:
                    System.out.println("Enter details accno,name,balance");
                    accout =sc.nextLine();
                    name=sc.nextLine();
                    balance=sc.nextDouble();
                    acc=new Account1(accout,name,balance);
                    hm.put(accout,acc);
                    System.out.println("Account Created for "+name);
                    break;

                case 2:
                    System.out.println("Enter accont no.");
                    sc.nextLine();
                    accout =sc.nextLine();
                    hm.remove(accout);
                    break;

                case 3:
                    System.out.println("Enter account no.");
                    accout =sc.nextLine();
                    acc=hm.get(accout);
                    System.out.println(acc);
                    break;

                case 4:
                    for(Account1 a:hm.values())
                        System.out.println(a);
                    break;

                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for(Account1 a: hm.values())
                        oos.writeObject(a);
            }
        }while (Choice!=6);
        oos.flush();
        oos.close();
        fos.close();
    }
}
