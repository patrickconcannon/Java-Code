import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class GridComponent extends JComponent {

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
			
		Grid grid = new Grid();
		grid.draw(g2);
		
		PlotCannonBall pcb = new PlotCannonBall(100,100, 60);
		pcb.draw(g2);		
		for(int t = 1; t<=10;t++){
			for(int t1 = 1; t1<=100;t1++){
				pcb.getPosition();
				}
			pcb.draw(g2);
		}
		
		
		
		
		//Drunk drunk = new Drunk(310, 310); // increase by 30
		//drunk.draw(g2);
		//for(int i = 0; i< 100;i++){
		//	drunk.update();
		//	drunk.draw(g2);
		//}
	}
}
