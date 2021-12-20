
package euro_wettbewerb;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerAnimation {
Timer player_ani;
private int temp = 0;

    public PlayerAnimation(){
        player_ani = new Timer();
        player_ani.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                if(Var.moveup == true || Var.movedown == true || Var.moveleft == true || Var.moveright == true){
                    if (temp == 0){
                        Var.player_animation =0;
                        temp++;
                    } else if (temp == 1){
                        Var.player_animation = 1;
                        temp--;
                    }
                } else {
                    Var.player_animation = 0;
                }
            }
            
        }, 0, 100);
    }
}
