import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;
import javax.swing.JFrame;


public class DisplayApplet extends JApplet
{
	public void paint(Graphics g)
	{
	
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		box.translate(15, 25);
		
		g2.draw(box);
	}
	
	public void openAppletWindow()
	{
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DisplayComponent dc = new DisplayComponent();
		frame.add(dc);

		frame.setVisible(true);
		System.out.println("Hello World");
	}
	
	public static void main(String[] args)
	{
		DisplayApplet da = new DisplayApplet();
		da.openAppletWindow();
	}
	
}
