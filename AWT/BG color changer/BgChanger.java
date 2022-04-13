import java.awt.*;
import java.awt.event.*;

public class BgChanger extends Frame implements MouseMotionListener{
	String msg = "";
	int mouseX = 0, mouseY = 0;

	public BgChanger() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		addMouseMotionListener(this);
	}

	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse Pressed";
		repaint();
		//g.setColor(c1);
	}

	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse released";
		repaint();
		//g.setColor(c2);
	}

	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*" + " mouse at " + mouseX + ", " + mouseY;
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		msg = "Moving mouse at " + me.getX() + ", " + me.getY();
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
		Color c1 = new Color(255, 255, 000);
		Color c2 = new Color(255, 000, 000);
		g.getColor(c1);
		g.getColor(c2);
	}

	public static void main(String args[]) {
		BgChanger appwin = new BgChanger();
		
		appwin.setSize(new Dimension(600, 600));
		appwin.setTitle("Smiley");
		appwin.setVisible(true);
	}
}

	
	
