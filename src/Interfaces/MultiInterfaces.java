package Interfaces;

class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sending message");
    }
}
interface  Icamera{
    void click();
    void record();
}
interface ImusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements Icamera,ImusicPlayer{

    public void videoCall(){
        System.out.println("Smart phone video call");
    }
    @Override
    public void click(){
        System.out.println("SmartPhone clicking photo");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone record video");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone playing music");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone Stopped music");
    }
}


public class MultiInterfaces {
    public static  void  main(String[] args){
        SmartPhone sp=new SmartPhone();
        sp.videoCall();
        sp.click();
        sp.record();
        sp.call();
        sp.play();
        sp.stop();
        sp.sms();

        Phone p=new SmartPhone();
        p.call();
        p.sms();

        Icamera ic=new SmartPhone();
        ic.click();
        ic.record();

        ImusicPlayer ip=new SmartPhone();
        ip.play();
        ip.stop();
    }
}
