package euro_wettbewerb;

import java.util.Timer;

public class KundenMovement {

    Timer k_movement;

    private int[] k_start = new int[3];

    public KundenMovement() throws InterruptedException {
        
        for (int i = 0; i < k_start.length; i++) {
            k_start[i] = (int) (Math. random()*60+1);
        }
        
        while (Var.game_on == 1) {
        
            for (int g = 0; g < 60; g++) {
                Var.kunden_zaehler = g;
                Thread.sleep(1000);
            }
                
        }
        while ()
        if (k_start[0] == Var.kunden_zaehler){
        
        }
        if (k_start[1] == Var.kunden_zaehler){
        
        }
        if (k_start[2] == Var.kunden_zaehler){
        
        }        
        
    }

}
