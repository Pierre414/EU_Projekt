
package euro_wettbewerb;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup=true;
            Var.blickrichtung = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown=true;
            Var.blickrichtung = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft=true;
            Var.blickrichtung = 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright=true;
            Var.blickrichtung = 4; 
        }       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup=false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown=false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft=false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright=false;
        }  
    }
    
    
    
}
