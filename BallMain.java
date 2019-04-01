import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BallMain {

	public static void main(String[] args) 
	{

		JFrame myFrame = new JFrame();
		myFrame.setBounds(100, 100, 600, 600);
		myFrame.setLayout(null);
		
		Ball myBall = new Ball();
		myBall.setBounds(20, 40, 60, 60);

		myFrame.add(myBall);

		Timer t1 = new Timer(1, new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						myBall.setLocation((int)(Math.random()*4), (int)(Math.random()*4)); 
						
					}
				
				}
				);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1.start();
		
	}

}
