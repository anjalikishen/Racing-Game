package com.theinvader360.racegame;

import com.badlogic.gdx.math.Rectangle;

public class GrassyArea {

	private Rectangle bounds;

	public GrassyArea(int x, int y, int width, int height) {
		bounds = new Rectangle(x, y, width, height);
	}

	public Rectangle getBounds() {
		return bounds;
	}
}
