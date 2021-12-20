
package euro_wettbewerb;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Var {
    
    static JFrame jf1;
    static int jf_breite =1280, jf_hoehe =720;
    static int backgroundY1 = 0, backgroundY2 = -720;
    static int backroundspeed =500; // ms
    static int  p_position_x = 640, p_position_y = 360;
    static int player_b = 40, player_h = 70;
    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static int speedup = 1, speeddown = 1, speedleft = 1, speedright = 1;
    static int player_animation = 0;
    static Label lbl1;
    static int blickrichtung = 1;
    static int[] kunde_x = {700, 800, 900};
    static int[] kunde_y = {50, 50, 50};
    static boolean[] kunde_wait = {false, false, false};
    static int game_on = 1;
    static int kunden_zaehler;
    
    static BufferedImage ib1, ib2;
    static BufferedImage player1_unten, player1_oben, player1_rechts, player1_links;
    static BufferedImage player2_unten, player2_oben, player2_rechts, player2_links;
    static BufferedImage kunde1, kunde2;
    
    public Var() throws IOException{
        try{
            //Hintergrund
            ib1 = ImageIO.read(new File("rsc/Test_Level.png"));
            ib2 = ImageIO.read(new File("rsc/Test_Level_1.png"));
            //Spieler stehend
            player1_unten = ImageIO.read(new File("rsc/player1_unten.png"));
            player1_oben = ImageIO.read(new File("rsc/player1_oben.png"));
            player1_links = ImageIO.read(new File("rsc/player1_links.png"));
            player1_rechts = ImageIO.read(new File("rsc/player1_rechts.png"));            
            // Spieler bewegend
            player2_unten = ImageIO.read(new File("rsc/player2_unten.png"));
            player2_oben = ImageIO.read(new File("rsc/player2_oben.png"));
            player2_links = ImageIO.read(new File("rsc/player2_links.png"));
            player2_rechts = ImageIO.read(new File("rsc/player2_rechts.png"));
            // Kunden
            kunde1 = ImageIO.read(new File("rsc/kunde1.png"));
            kunde2 = ImageIO.read(new File("rsc/kunde2.png"));
            
        }catch (IOException e) {
        e.printStackTrace();
        System.out.println("Bild konnte nicht geladen werden.");
        }
    }
}
