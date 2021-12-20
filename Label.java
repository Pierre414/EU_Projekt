
package euro_wettbewerb;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;
    
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        //Antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.drawImage(Var.ib1, 0, Var.backgroundY1, null);
        g.drawImage(Var.ib2, 0, -Var.backgroundY2, null);
        
        g.drawImage(Var.kunde1, Var.kunde_x[0], Var.kunde_y[0], Var.player_b, Var.player_h, null);
        g.drawImage(Var.kunde1, Var.kunde_x[1], Var.kunde_y[1], Var.player_b, Var.player_h, null);
        g.drawImage(Var.kunde1, Var.kunde_x[2], Var.kunde_y[1], Var.player_b, Var.player_h, null);
        
        if(Var.player_animation == 0){
            switch (Var.blickrichtung) {
                case 1:
                    g.drawImage(Var.player1_oben, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 2:
                    g.drawImage(Var.player1_unten, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 3:
                    g.drawImage(Var.player1_links, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 4:
                    g.drawImage(Var.player1_rechts, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                default:
                    break;
            }
        }else if (Var.player_animation == 1){
            switch (Var.blickrichtung) {
                case 1:
                    g.drawImage(Var.player2_oben, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 2:
                    g.drawImage(Var.player2_unten, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 3:
                    g.drawImage(Var.player2_links, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                case 4:
                    g.drawImage(Var.player2_rechts, Var.p_position_x, Var.p_position_y, Var.player_b, Var.player_h, null);
                    break;
                default:
                    break;
            }
        }
        

        
        repaint();

    }
}
