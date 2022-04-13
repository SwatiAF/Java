import java.awt.*;
import java.awt.event.*;

public class Smiley extends Frame {
	public Smiley() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
	Color c1 = new Color(255, 255, 000);
	Color c2 = new Color(0, 0, 0);

	//Draw a yello circle
	g.setColor(c1);
	g.fillOval(50, 50, 400, 400);

	//Draw filled oval
	g.setColor(c2);
	g.fillOval(150, 150, 30, 40);

	//Draw filled oval
	g.setColor(c2);
	g.fillOval(300, 150, 30, 40);

	//Outlined Triangle (top, left, right)
	int xpoints[] = {250, 200, 300};
	int ypoints[] = {210, 260, 260};
	int num = 3;
	g.drawPolygon(xpoints, ypoints, num);

	//Smile arc
	g.setColor(c2);
	g.drawArc(100, 180, 300, 200, 0, -180);

	//Smile lines have to be drawn yet
	/*g.setColor(c2);
	g.drawLine();*/

	}

	public static void main(String args[]) {
		Smiley appwin = new Smiley();
		
		appwin.setSize(new Dimension(500, 500));
		appwin.setTitle("Smiley");
		appwin.setVisible(true);
	}
}
