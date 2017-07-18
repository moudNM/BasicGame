import java.awt.EventQueue;

import javax.swing.JFrame;

public class app extends JFrame {

    public app() {
	    
	    something();
	    
	}
    
    
    private void something(){
	    	Board b = new Board();
		add(b);
		
		setResizable(false);
		pack();
		setSize(500, 500);
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	    
	}
    
    
    
    
    
    
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable(){

	    @Override
	    public void run() {
		
		    app test = new app();
	
	    }
		
		
	    
 
	});
    

    }

}
