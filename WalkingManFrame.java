import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JComponent; 
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class WalkingManFrame extends JFrame implements KeyListener{
	// private int dx = 10, dy = 10;
	private boolean pressed;
	public WalkingManFrame()
	{
		WalkingMan myMan = new WalkingMan(0, 0);
		JFrame walkingFrame = new JFrame();
		
		this.setSize(1000, 500);
		this.add(myMan);
		
		

		
		
		
		this.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				pressed = true;
				
				// upper left
				//if(e.getKeyCode()==87 && ((myMan.getY()) - myMan.getDy()) >= 0)
				//{
					
			//	}
				
				// w
				if(e.getKeyCode()==87 && ((myMan.getY()) - myMan.getDy()) >= 0)
				{
						myMan.setDy(-5);

					
				}
			
				// s
				if(e.getKeyCode() == 83 && ((myMan.getY()) + myMan.getDy()) <= 500)
				{
					myMan.setDy(5);
					
				}
				
				// a
				if(e.getKeyCode()== 65 && ((myMan.getX()) - myMan.getDx()) >=0) 
				{
					myMan.setDx(-5);
			
				}
				
				// d
				if(e.getKeyCode()== 68 && ((myMan.getX()) + myMan.getDx()) <= 1000)
				{
					myMan.setDx(5);
						
				}
			
			}


			@Override
			public void keyReleased(KeyEvent e) {
				
				pressed = false;
				if(e.getKeyCode()==87)
				{
						myMan.setDy(0);

					
				}
			
				// s
				if(e.getKeyCode() == 83)
				{
					myMan.setDy(0);
					
				}
				
				// a
				if(e.getKeyCode()== 65) 
				{
					myMan.setDx(0);
			
				}
				
				// d
				if(e.getKeyCode()== 68)
				{
					myMan.setDx(0);
						
				}
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			//public void modDx(int xR)
			//{
				//dx = xR;
				//myMan.setDx(xR);
			//}
			
			//public void modDy(int yR)
			//{
				//dy = yR;
				//myMan.setDy(yR);
			//}
			
		}
		
		);
	
				Timer t1 = new Timer((1000/60), new ActionListener()
				 {

					@Override
					public void actionPerformed(ActionEvent h) 
					{	
						myMan.update();	
						
					}
					
					
		}
		);
		
		t1.start();
	}
	
	
	
	
	public static void main(String[] args)
	{
		WalkingManFrame walkFrame = new WalkingManFrame();
		walkFrame.setVisible(true);
		walkFrame.setLayout(null);
		walkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}




	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
