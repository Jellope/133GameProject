package com.mycompany.a3;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Point;
import com.codename1.ui.geom.Point2D;

public class Alien extends Opponents {
	private GameWorld gw;
	public Alien(int color, int screenHeight, int screenWidth, int speed,
			int speedMultiplier, GameWorld gw) {
		super(gw);
		setName("Alien");
		Random r = new Random();
		setColor(color);
		setScreenHeight(screenHeight);
		setScreenWidth(screenWidth);
		setSpeedMultiplier(speedMultiplier);
		setDirection(r.nextInt(360));
		setLocation(new Point2D(r.nextDouble() * screenWidth, r.nextDouble()
				* screenHeight));
		super.setSize(r.nextInt(31) + 20);
		setSpeed(speed);
	}

	@Override
	public void setColor(int color) {
		// Aliens don't change color;
	}

	@Override
	public void setSize(int size) {

	}

	public void draw(Graphics g, Point pCmpRelPrnt) {
		// g.setColor(this.getColor());
		g.setColor(ColorUtil.BLUE);
		int xLoc = pCmpRelPrnt.getX() + (int) getLocation().getX();
		int yLoc = pCmpRelPrnt.getY() + (int) getLocation().getY();
		int r = 20;
		g.fillArc(xLoc - ((2 * r) / 2), yLoc - ((2 * r) / 2), 2 * r, 2 * r, 0,
				360);

	}
	public void run(){
		
	}
}
