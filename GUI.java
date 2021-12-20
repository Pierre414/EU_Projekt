
package euro_wettbewerb;

import java.awt.Toolkit; 
import javax.swing.JFrame;


public class GUI {
    
    public GUI(){
        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.jf_breite, Var.jf_hoehe);
        Var.jf1.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/6,Toolkit.getDefaultToolkit().getScreenSize().height/6 );
        Var.jf1.setLayout(null);
        Var.jf1.setTitle("Klimaspiel");
        Var.jf1.setResizable(false);
        Var.jf1.requestFocus();
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.setVisible(true);
        Var.jf1.setDefaultCloseOperation(Var.jf1.EXIT_ON_CLOSE);
        
        Var.lbl1 = new Label();
        Var.lbl1.setBounds(0,0,Var.jf_breite,Var.jf_hoehe);
        Var.lbl1.setVisible(true);
        Var.jf1.add(Var.lbl1);
    }
  
}
