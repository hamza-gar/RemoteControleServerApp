package threadServices;


import java.awt.*;
import java.awt.event.InputEvent;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MouseThread extends Thread{

    static Socket s;
    static ServerSocket ss;
    static InputStreamReader isr;
    static BufferedReader br;
    static String message;
    static DataOutputStream osr;
    static int x;
    static int y;
    static String h;
    static String w;

    private int port;

    public MouseThread(int p){
        this.port = p;
    }

    @Override
    public void run() {

        try{
            ss = new ServerSocket(this.port);
            System.out.println("Test");
            Robot robot = new Robot();


            while(true){

                s= ss.accept();

                isr = new InputStreamReader(s.getInputStream());
                osr = new DataOutputStream(s.getOutputStream());
                br = new BufferedReader(isr);

                message = br.readLine();

                if(message.equals("1")){
                    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                }
                else if(message.equals("2")){
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                else{
                    String[] array = message.split("/");
                    for (String a : array) {
                        x=Integer.valueOf(array[0]);
                        y=Integer.valueOf(array[1]);
                    }
                    robot.mouseMove((int)x,(int)y);
                }
            }
        }
        catch(AWTException | IOException e){e.printStackTrace();
        }

    }
}