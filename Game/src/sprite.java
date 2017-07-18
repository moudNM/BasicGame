import java.awt.Image;

import javax.swing.ImageIcon;

public class sprite {

    
    public Image image;
    public boolean vis;
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    public sprite(int x, int y){
	this.x = x;
	this.y = y;
	vis = true;
    }
    
    public void loadImg(String importImg){
	ImageIcon img = new ImageIcon(importImg);
	image = img.getImage();
	
    }
    
    public Image getImg(){
	return image;
    }
    
    public int getX(){
   	return x;
       } 
    
    public int getY(){
   	return y;
       }
    
    public boolean isVisible() {
        return vis;
    }
}
