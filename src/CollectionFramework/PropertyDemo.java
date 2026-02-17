package CollectionFramework;

import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args)throws Exception {
        Properties p=new Properties();
        p.setProperty("Brand","Delhi");
        p.setProperty("processor","i7");
        p.setProperty("model","latitude");

        System.out.println(p);


    }
}
