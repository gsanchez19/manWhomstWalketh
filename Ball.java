import java.awt.geom.Ellipse2D;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
public class Ball extends JComponent
{

	private Ellipse2D.Double ball;
	private int x = 0, y = 0;
	private int dx = 4;
	
	public Ball(int xv, int yv)
	{
		ball = new Ellipse2D.Double(10, 10, 10, 10);
		this.setSize(11, 11);
		x = xv;
		y = yv;
		
		
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY());
		if(getX()== 1000)
		{
			
		}
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(ball);
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int xh)
	{
		x=xh;
	}
	
	public void setY(int yh)
	{
		y = yh;
	}
	
	
	
}
