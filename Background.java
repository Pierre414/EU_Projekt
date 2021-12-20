
package euro_wettbewerb;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
    Timer back;
    public Background(){
        back = new Timer();
        back.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                
               if (Var.backgroundY1 == -720){
                   Var.backgroundY1 = 0;
               }else {
                   Var.backgroundY1 = -720;
               }
               if (Var.backgroundY2 == -720){
                   Var.backgroundY2 = 0;
               } else {
                   Var.backgroundY2 = -720;
               }
                
            }
            
        }, 0, Var.backroundspeed);
    }
}
