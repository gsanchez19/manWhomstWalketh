import java.awt.geom.Ellipse2D;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
public class Ball extends JComponent
{

	private Ellipse2D.Double ball;
	
	public Ball()
	{
		ball = new Ellipse2D.Double(10, 10, 10, 10);
		this.setSize(11, 11);
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(ball);
	}
	
	
	
}
