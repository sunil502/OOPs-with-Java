package Interitance;

class TV{
    public void switchOn(){
        System.out.println("Tv is swithch on");
    }
    public void changeChannel(){
        System.out.println("Tv channel changed");
    }
}

class smartTV extends TV{
    public void switchOn(){
        System.out.println("smartTv is swithch on");
    }
    public void changeChannel(){
        System.out.println("smartTv channel changed");
    }
    public  void browser(){
        System.out.println("smartTv browsing");
    }
}

public class overridingTV {
    public static void  main(String[] args){
//        TV t=new TV();
//        t.switchOn();
//        t.changeChannel();

//        smartTV st=new smartTV();
//        st.switchOn();
//        st.changeChannel();
//        st.switchOn();

        TV t=new smartTV();
        t.switchOn();
        t.changeChannel();
    }
}
