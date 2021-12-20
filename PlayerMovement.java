
package euro_wettbewerb;

import java.util.Timer;
import java.util.TimerTask;


public class PlayerMovement {
    Timer movement;
    public PlayerMovement(){
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                
                if(Var.moveup == true){
                    if(Var.p_position_y>0){
                        Var.p_position_y -= Var.speedup;
                        System.out.println("Y: "+Var.p_position_y);
                    }
                } else if(Var.movedown == true){
                    if(Var.p_position_y<624){
                        Var.p_position_y += Var.speeddown;
                        System.out.println("Y: "+Var.p_position_y);
                    }
                }
                
                if(Var.moveleft == true){
                    if(Var.p_position_x>0){
                        Var.p_position_x -= Var.speedleft;
                        System.out.println("X: "+Var.p_position_x);
                    }
                } else if(Var.moveright == true){
                    if(Var.p_position_x<1235){
                        Var.p_position_x += Var.speedright;
                        System.out.println("X: "+Var.p_position_x);
                    }
                }
                
            }
    
        }, 0, 5);
    }
    
}
