package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEcho extends Thread{

    Socket stk;
    public MultiEcho(Socket st){
        stk=st;
    }

    public void run(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());


            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            } while (!msg.equals("dne"));
            stk.close();
        }catch(Exception e){}

    }


    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(2000);
        Socket stk ;
        MultiEcho me;
        int count=1;

        do{
           stk=ss.accept();
            System.out.println("Client connected:"+count++);
           me=new MultiEcho(stk);
           me.start();
        }while (true);
    }
}

class Client1 {
    public static void main(String[] args) throws Exception{
        Socket stk=new Socket("192.168.0.103",2000);

        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do{
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("from server \n"+msg);

        }while (!msg.equals("dne"));
        stk.close();
    }
}