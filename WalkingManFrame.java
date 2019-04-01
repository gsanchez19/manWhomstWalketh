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
	private int dx = 10, dy = 10;
	private int xV = 0, yV = 0;
	private boolean pressed;
	public WalkingManFrame()
	{
		WalkingMan myMan = new WalkingMan(0, 0);
		JFrame walkingFrame = new JFrame();
		
		this.setSize(1000, 500);
		this.add(myMan);
		
		
		Timer t1 = new Timer((1000/90), new ActionListener()
				 {

					@Override
					public void actionPerformed(ActionEvent h) 
					{
					
						if(pressed = false)
						{
							modDx(0);
							modDy(0);
							myMan.update();
							myMan.repaint();	
						}
						
						myMan.update();
						myMan.repaint();	
						//myMan.setDx(dx);
						//myMan.setDy(dy);
					}
					
					public void modDx(int xR)
					{
						dx = xR;
						//myMan.setDx(xR);
					}
					
					public void modDy(int yR)
					{
						dy = yR;
						//myMan.setDy(yR);
					}
		}
		);
		
		t1.start();
		
		
		
		this.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				pressed = true;
				// w
				if(e.getKeyCode()==87 && (yV-dy) >= 0)
				{
						myMan.setY(yV-=dy);
						yV-=dy;
					
				}
			
				// s
				if(e.getKeyCode() == 83 && (yV + dy) <= 500)
				{
						myMan.setY(yV+=dy);
						yV+=dy;
				}
				
				// a
				if(e.getKeyCode()== 65 && (xV - dx) >=0) 
				{
						myMan.setX(xV -= dy);
						xV-=dy;
			
				}
				
				// d
				if(e.getKeyCode()== 68 && (xV + dx) <= 1000)
				{
						myMan.setX(xV += dx);
						xV += dx;
						
				}
				myMan.manLocation(xV, yV);
			}


			@Override
			public void keyReleased(KeyEvent arg0) {
				
				pressed = false;
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
