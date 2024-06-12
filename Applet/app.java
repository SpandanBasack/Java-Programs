package Applet;
import java.awt.*;
import java.applet.*;
/*<applet code="Sample" width=300 height=50></applet>*/
public class app extends Applet {
        String msg;
        public void init(){
            setBackground(Color.cyan);
            setForeground(Color.red);
            msg = "This is an applet example";
        }
        public void start(){
            System.out.println("...Starting of applet");
        }
        public void stop(){
            System.out.println("...Stopping of applet");
        }
        public void destroy(){
            System.out.println("...Exiting applet");
        }
        public void paint(Graphics g){
            g.drawString(msg, 10, 30);  
        }
}
