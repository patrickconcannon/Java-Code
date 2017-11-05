import javax.swing.JFrame;


public class GridViewer {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(630, 650);
		frame.setTitle("A feckin' drunk");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridComponent grid = new GridComponent();
		frame.add(grid);
		
		frame.setVisible(true);
	}

}
