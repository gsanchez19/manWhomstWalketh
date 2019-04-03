
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
	
public class WalkingMan extends JComponent implements updatable {

	private Ellipse2D.Double head;
	private Rectangle body, armL, armR, legL, legR;
	private int dx = 0, dy = 0;
	private int x=50, y = 50;
	
	public WalkingMan(int xc, int yc)
	{
		x = xc;
		y = yc;
		
		this.setLocation(x, y);
		this.setSize(31, 56);
		head = new Ellipse2D.Double(13, 0, 10, 10);
		body = new Rectangle(12, 10, 12, 21);
		armL = new Rectangle(0, 10, 13, 4);
		armR = new Rectangle(25, 10, 13, 4);
		legL = new Rectangle(12, 21, 4, 25);
		legR = new Rectangle(20, 21, 4, 25);
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.RED);
		g2.draw(head);
		g2.fill(head);
		
		g2.draw(body);
		g2.fill(body);
		
		g2.draw(armL);
		g2.fill(armL);
		
		g2.draw(armR);
		g2.fill(armR);
		
		g2.draw(legL);
		g2.fill(legL);
		
		g2.draw(legR);
		g2.fill(legR);
	}
	
	
	public void update()
	{
		
		//setLocation(getX() + dx, getY() + dy);
		if ((getY()+dy) != 500 && (getY()+dy) != 0 && (getX()+dx) != 0 && (getX()+dx) != 1000)
		{
		setLocation(getX() + dx, getY() + dy);
		repaint();
		}
	}
	public void setDx(int xG)
	{
		dx = xG;
	}
	
	public void setDy(int yG)
	{
		dy = yG;
	}
	
	public int getDx()
	{
		return dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public void setX(int xh)
	{
		x = xh;
	}
	
	public void setY(int yh)
	{
		y = yh;
		this.setLocation(x, y);
	}

	public void manLocation(int xL, int yL)
	{
		x = xL;
		y = yL;
		setLocation(x, y);
	}
}
