package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;

public abstract class Opponents extends GameObject implements Imove {
	private Point2D size;
	private int speed;
	private int direction;
	
	private void guided() {
		//Mute since Opponents do not use this.
	}
	private void move() {
		//moves the aliens and the astronauts
	}
}
