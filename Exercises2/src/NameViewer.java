
import javax.swing.JComponent;
import javax.swing.JFrame;

public class NameViewer extends JComponent {

	public void openWindow(){
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setTitle("Paddy Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NameComponent nc = new NameComponent();
		
		frame.add(nc);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args){
		 new NameViewer().openWindow();

	}
	
}
