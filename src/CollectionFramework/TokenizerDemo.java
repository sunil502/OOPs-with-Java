package CollectionFramework;

import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String data="name=Sunil\nAddress=Gorakhpur\nCountry=India\ndept=Cse";
        StringTokenizer stk=new StringTokenizer(data,"=");
        String s;
        while (stk.hasMoreElements()){
            s= stk.nextToken();
            System.out.println(s);
        }
    }
}
