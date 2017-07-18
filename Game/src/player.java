import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class player {

    private Image image;
    private int x;
    private int y;
    private int dx;
    private int dy;
    
    
    public player(){
	
	startplayer();
    }
    
    public void startplayer(){
	ImageIcon img = new ImageIcon("player.png");
	image = img.getImage();
	x = 50;
	y = 50;
    }
    
    public Image getImage(){
	return image;
    }
    
    public int getX(){
   	return x;
       } 
    
    public int getY(){
   	return y;
       } 
    
    public void move(){
	x+=dx;
	y+=dy;
	
    }
    
    public void keyPressed(KeyEvent e){
	
	int key = e.getKeyCode();
	
	if(key == KeyEvent.VK_LEFT) dx = -5;
	if(key == KeyEvent.VK_RIGHT) dx = 5;
	if(key == KeyEvent.VK_UP) dy = -5;
	if(key == KeyEvent.VK_DOWN) dy = 5;
    }

    public void keyReleased(KeyEvent e){
	
	int key = e.getKeyCode();
	
	if(key == KeyEvent.VK_LEFT) dx = 0;
	if(key == KeyEvent.VK_RIGHT) dx = 0;
	if(key == KeyEvent.VK_UP) dy = 0;
	if(key == KeyEvent.VK_DOWN) dy = 0;
}
    
}
