package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;


public abstract class GameObject extends GameWorld {
	private Point2D size;
	private int color;
	private float locationX;
	private float locationY;
	
	private void size() {
		
	}
	private float getLocationX(float x){
		return x;
	}
	private float getLocationY(float y){
		return y;
	}
	private int getColor(int color){
		return color;
	}
	private void setLocationX(float x){
		this.locationX = x;
	}
	private void setLocationY(float y){
		this.locationY = y;
	}
	private void setColor(int color){
		this.color = color;
	}
}
