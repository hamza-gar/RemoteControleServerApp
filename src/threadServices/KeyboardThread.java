package threadServices;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class KeyboardThread extends Thread{

    private int port;

    static Socket s;
    static ServerSocket ss;
    static InputStreamReader isr;
    static BufferedReader br;
    static String message;
    static DataOutputStream osr;
    static float x;
    static float y;
    static String h;
    static String w;
    static int k;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public KeyboardThread(int port){
        this.port = port;
    }

    @Override
    public void run() {



        try{
            Robot robot = new Robot();
            ss = new ServerSocket(this.port);


            while(true){
                s= ss.accept();
                isr = new InputStreamReader(s.getInputStream());

                br = new BufferedReader(isr);

                message = br.readLine();

                k=Integer.parseInt(message);
                switch (k) {
                    //NUMBERS
                    case 0:
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_0);
                        break;
                    case 1:
                        robot.keyPress(KeyEvent.VK_1);
                        robot.keyRelease(KeyEvent.VK_1);
                        break;
                    case 2:
                        robot.keyPress(KeyEvent.VK_2);
                        robot.keyRelease(KeyEvent.VK_2);
                        break;
                    case 3:
                        robot.keyPress(KeyEvent.VK_3);
                        robot.keyRelease(KeyEvent.VK_3);
                        break;
                    case 4:
                        robot.keyPress(KeyEvent.VK_4);
                        robot.keyRelease(KeyEvent.VK_4);
                        break;
                    case 5:
                        robot.keyPress(KeyEvent.VK_5);
                        robot.keyRelease(KeyEvent.VK_5);
                        break;
                    case 6:
                        robot.keyPress(KeyEvent.VK_6);
                        robot.keyRelease(KeyEvent.VK_6);
                        break;
                    case 7:
                        robot.keyPress(KeyEvent.VK_7);
                        robot.keyRelease(KeyEvent.VK_7);
                        break;
                    case 8:
                        robot.keyPress(KeyEvent.VK_8);
                        robot.keyRelease(KeyEvent.VK_8);
                        break;
                    case 9:
                        // CHARACTERS
                        robot.keyPress(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_9);
                        break;
                    case 97:
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_A);
                        break;
                    case 98:
                        robot.keyPress(KeyEvent.VK_B);
                        robot.keyRelease(KeyEvent.VK_B);
                        break;
                    case 99:
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_C);
                        break;
                    case 100:
                        robot.keyPress(KeyEvent.VK_D);
                        robot.keyRelease(KeyEvent.VK_D);
                        break;
                    case 101:
                        robot.keyPress(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_E);
                        break;
                    case 102:
                        robot.keyPress(KeyEvent.VK_F);
                        robot.keyRelease(KeyEvent.VK_F);
                        break;
                    case 103:
                        robot.keyPress(KeyEvent.VK_G);
                        robot.keyRelease(KeyEvent.VK_G);
                        break;
                    case 104:
                        robot.keyPress(KeyEvent.VK_H);
                        robot.keyRelease(KeyEvent.VK_H);
                        break;
                    case 105:
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_I);
                        break;
                    case 106:
                        robot.keyPress(KeyEvent.VK_J);
                        robot.keyRelease(KeyEvent.VK_J);
                        break;
                    case 107:
                        robot.keyPress(KeyEvent.VK_K);
                        robot.keyRelease(KeyEvent.VK_K);
                        break;
                    case 108:
                        robot.keyPress(KeyEvent.VK_L);
                        robot.keyRelease(KeyEvent.VK_L);
                        break;
                    case 109:
                        robot.keyPress(KeyEvent.VK_M);
                        robot.keyRelease(KeyEvent.VK_M);
                        break;
                    case 110:
                        robot.keyPress(KeyEvent.VK_N);
                        robot.keyRelease(KeyEvent.VK_N);
                        break;
                    case 111:
                        robot.keyPress(KeyEvent.VK_O);
                        robot.keyRelease(KeyEvent.VK_O);
                        break;
                    case 112:
                        robot.keyPress(KeyEvent.VK_P);
                        robot.keyRelease(KeyEvent.VK_P);
                        break;
                    case 113:
                        robot.keyPress(KeyEvent.VK_Q);
                        robot.keyRelease(KeyEvent.VK_Q);
                        break;
                    case 114:
                        robot.keyPress(KeyEvent.VK_R);
                        robot.keyRelease(KeyEvent.VK_R);
                        break;
                    case 115:
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_S);
                        break;
                    case 116:
                        robot.keyPress(KeyEvent.VK_T);
                        robot.keyRelease(KeyEvent.VK_T);
                        break;
                    case 117:
                        robot.keyPress(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_U);
                        break;
                    case 118:
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_V);
                        break;
                    case 119:
                        robot.keyPress(KeyEvent.VK_W);
                        robot.keyRelease(KeyEvent.VK_W);
                        break;
                    case 120:
                        robot.keyPress(KeyEvent.VK_X);
                        robot.keyRelease(KeyEvent.VK_X);
                        break;
                    case 121:
                        robot.keyPress(KeyEvent.VK_Y);
                        robot.keyRelease(KeyEvent.VK_Y);
                        break;
                    case 122:
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_Z);
                        break;
                    //ACTIONS
                    case 10:
                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                        break;
                    case 13:
                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);
                        break;
                    case 32:
                        robot.keyPress(KeyEvent.VK_SPACE);
                        robot.keyRelease(KeyEvent.VK_SPACE);
                        break;
                    case 16:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    //characters
                    case 93:

                        robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                    case 45:
                        robot.keyPress(KeyEvent.VK_MINUS);
                        robot.keyRelease(KeyEvent.VK_MINUS);
                        break;
                    case 43:
                        robot.keyPress(KeyEvent.VK_ADD);
                        robot.keyRelease(KeyEvent.VK_ADD);
                        break;
                    case 42:
                        robot.keyPress(KeyEvent.VK_MULTIPLY);
                        robot.keyRelease(KeyEvent.VK_MULTIPLY);
                        break;
                    case 58:
                        robot.keyPress(KeyEvent.VK_COLON);
                        robot.keyRelease(KeyEvent.VK_COLON);
                        break;
                    case 46:
                        robot.keyPress(KeyEvent.VK_PERIOD);
                        robot.keyRelease(KeyEvent.VK_PERIOD);
                        break;
                    case 44:
                        robot.keyPress(KeyEvent.VK_COMMA);
                        robot.keyRelease(KeyEvent.VK_COMMA);
                        break;
                    case 59:
                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                        robot.keyRelease(KeyEvent.VK_SEMICOLON);
                        break;
                    case 61:
                        robot.keyPress(KeyEvent.VK_EQUALS);
                        robot.keyRelease(KeyEvent.VK_EQUALS);
                        break;
                    case 39:
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        robot.keyRelease(KeyEvent.VK_QUOTE);
                        break;
                    case 34:
                        robot.keyPress(KeyEvent.VK_QUOTEDBL);
                        robot.keyRelease(KeyEvent.VK_QUOTEDBL);
                        break;
                    case 47:
                        robot.keyPress(KeyEvent.VK_SLASH);
                        robot.keyRelease(KeyEvent.VK_SLASH);
                        break;
                    case 91:
                        robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        break;
                    case 62:
                        robot.keyPress(KeyEvent.VK_GREATER);
                        robot.keyRelease(KeyEvent.VK_GREATER);
                        break;
                    case 60:
                        robot.keyPress(KeyEvent.VK_LESS);
                        robot.keyRelease(KeyEvent.VK_LESS);
                        break;
                }
            }

        }
        catch(IOException | AWTException e){
            e.printStackTrace();
        }
    }
}
