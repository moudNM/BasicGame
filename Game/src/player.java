import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class player extends sprite {

// inherited variables:
//    public Image image;
//    public boolean vis;
//    public int x;
//    public int y;
//    public int dx;
//    public int dy;
//    
    
    public ArrayList bullets;
    public int bx;
    public int by;
    public boolean shoot = true;
    
    public player(int x, int y){
	super(x,y);
	loadImg("player.png");
	bullets = new ArrayList();
	bx = 5;
	by = 0;
    }
    

    public void move(){
	if(x<0){
		x=0;   
	    }
	
	if(x>400){
		x=400;   
	    }
	    x+=dx;
	    y+=dy;   
	
	
	
    }
    
    public ArrayList getBullets(){
	return bullets;
    }
   
    public void keyPressed(KeyEvent e){
	
	int key = e.getKeyCode();
	
	if(key == KeyEvent.VK_SPACE){
	    
	    if(shoot){
		bullets.add(new bullet(this.x,this.y,this.bx,this.by));
		shoot = false;
	    }
	    
	}
	
	if(key == KeyEvent.VK_LEFT){
	    dx = -5;
	    bx = -10;
	    by = 0;
	}
	if(key == KeyEvent.VK_RIGHT){
	    dx = 5;
	    bx = 10;
	    by = 0;
	}
	if(key == KeyEvent.VK_UP){
	    dy = -5;
	    bx = 0;
	    by = -10;
	}
	if(key == KeyEvent.VK_DOWN){
	    dy = 5;
	    bx = 0;
	    by = 10;
	}
    }

    public void keyReleased(KeyEvent e){
	
	int key = e.getKeyCode();
	if(key == KeyEvent.VK_SPACE) shoot = true;
	if(key == KeyEvent.VK_LEFT) dx = 0;
	if(key == KeyEvent.VK_RIGHT) dx = 0;
	if(key == KeyEvent.VK_UP) dy = 0;
	if(key == KeyEvent.VK_DOWN) dy = 0;
}
    
}
