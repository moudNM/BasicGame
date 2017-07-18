import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.*;

public class Board extends JPanel implements Runnable{
    
    player p;
    private final int delay = 25;
    Thread anim;
    
    private Image catto;
    
	public Board(){
	    
	startboard();	  
	   
	   
	}
	
	private void startboard(){
	    System.out.println("bored");
	    
	    addKeyListener(new k());
	    setFocusable(true);
	    setBackground(Color.BLACK);
	    setDoubleBuffered(true);
	
	    p = new player(0,0);

	    
	

	}

	@Override
	public void addNotify(){
	    super.addNotify();
	    System.out.println("notif");
	    anim = new Thread(this);
	    anim.start();
	}
	

	
	@Override
	public void paint(Graphics g){
	  super.paint(g);
	  Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
	        System.out.println("paint");
		g2d.drawImage(p.getImg(),p.getX(),p.getY(),null);
		
		ArrayList al = p.getBullets();
		
		for(Object b1: al){
		    
		    bullet b = (bullet) b1;
		    
		    g2d.drawImage(b.getImg(),b.getX(),b.getY(),null);
		}
		
		
		
	        Toolkit.getDefaultToolkit().sync();
	    
	    
	}
	
	public void updateBullets(){
	    ArrayList al = p.getBullets();
	    
	    
	    for (int i = 0; i < al.size(); i++) {

	            bullet b = (bullet) al.get(i);

	            if (b.isVisible()) {

	        	((bullet) p.getBullets().get(i)).move();
	            } else {

	                p.getBullets().remove(i);
	            }
	        }
	}

	public void updatePlayer(){
	    p.move();
	}
	
	
	@Override
	public void run() {
	    System.out.println("run");
	    long bef,diff,sleep;
	    
	    bef = System.currentTimeMillis();
	    
	    while(true){
		
		updatePlayer();
		updateBullets();
		repaint();
		
		diff = System.currentTimeMillis() - bef;
		
		
		sleep = delay - diff;
		
		
		if(sleep<0) sleep =2;
		
		try{
		    Thread.sleep(sleep);
		    
		    
		}catch(InterruptedException e){
		    System.out.println(e.getMessage());
		}
		
		bef = System.currentTimeMillis();
		
		
	    }
	    
	}
	
	   
	private class k extends KeyAdapter {
	    
	    
	    @Override
	    public void keyPressed(KeyEvent e){
		p.keyPressed(e);
	    }
	    
	    public void keyReleased(KeyEvent e){
		p.keyReleased(e);
	    }
	}
	
	
    }


