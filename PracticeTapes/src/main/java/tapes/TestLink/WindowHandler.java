package TestLink;

import java.awt.event.*;

public class WindowHandler implements WindowListener{
    public void windowClosed(WindowEvent W1) {
        
    }
    public void windowClosing(WindowEvent W1) {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent W1) {
        System.out.println("hello 2");
    }
    public void windowActivated(WindowEvent W1) {
        System.out.println("hello 1");
    }
    public void windowOpen(WindowEvent W1) {}
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("minimize");
        // TODO Auto-generated method stub
        
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("maximized 2");
        
    }
    

}
