import java.awt.*;
import java.awt.geom.*;
import java.applet.*;

public class Map2D extends Applet {
	public void paint(Graphics screen) {
		resize(350, 350);
		// screen 2D-Objekt erzeugen
		Graphics2D screen2D = (Graphics2D) screen;
		setBackground(Color.blue);
		// Draw waves
		screen2D.setColor(Color.white);
		BasicStroke pen = new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
		// Wellen über das gesamte Applet-Fenster erzeugen
		for (int ax = 10; ax < 340; ax += 10)
			for (int ay = 30; ay < 340; ay += 10) {
				Arc2D.Float wave = new Arc2D.Float(ax, ay, 10, 10, 0, 180, Arc2D.OPEN);
				screen2D.draw(wave);

			}
		GradientPaint gp = new GradientPaint(0F, 0f, Color.green, 50f, 50f, Color.orange, true);
		screen2D.setPaint(gp);
		GeneralPath fl = new GeneralPath();
		fl.moveTo(10F, 12F);
		fl.lineTo(234f, 15f);
		fl.lineTo(253f, 25f);
		fl.lineTo(261f, 71f);
		fl.lineTo(344f, 209f);
		fl.lineTo(336f, 278f);
		fl.lineTo(295f, 310f);
		fl.lineTo(259f, 274f);
		fl.lineTo(205f, 188f);
		fl.lineTo(211f, 171f);
		fl.lineTo(195f, 174f);
		fl.lineTo(191f, 118f);
		fl.lineTo(120f, 56f);
		fl.lineTo(94f, 68f);
		fl.lineTo(81f, 49f);
		fl.lineTo(12f, 37f);
		fl.closePath();
		screen2D.fill(fl);
		// Draw ovals
		screen2D.setColor(Color.black);
		BasicStroke pen2 = new BasicStroke();
		screen2D.setStroke(pen2);
		Ellipse2D.Float e1 = new Ellipse2D.Float(235, 140, 15, 15);
		Ellipse2D.Float e2 = new Ellipse2D.Float(225, 130, 15, 15);
		Ellipse2D.Float e3 = new Ellipse2D.Float(245, 130, 15, 15);
		screen2D.fill(e1);
		screen2D.fill(e2);
		screen2D.fill(e3);
		
		
	}
}
