
public class bullet extends sprite{
 
// inherited variables:
//  public Image image;
//  public boolean vis;
//  public int x;
//  public int y;
//  public int dx;
//  public int dy;
//
    public int speedX;
    public int speedY;
    
    public bullet(int x,int y,int bx, int by){
	super(x,y);
	loadImg("bullet.png");
	speedX = bx;
	speedY = by;
    }
    
    public void move(){
	x+=speedX;
	y+=speedY;
	
	if(x > 500 || y > 500){
	    vis = false;
	    
	}
    }
    
    
    
    
}
