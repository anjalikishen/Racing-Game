package com.theinvader360.racegame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.math.Rectangle;
 
public class RaceGame extends Game {
	public static final int VIRTUAL_WIDTH = 240;
	public static final int VIRTUAL_HEIGHT = 320;
	public static final float ASPECT_RATIO = (float)VIRTUAL_WIDTH/(float)VIRTUAL_HEIGHT;
	public static Rectangle viewport;
	
	MenuScreen menuScreen;
	GameScreen gameScreen;

	@Override
	public void create() {
		menuScreen = new MenuScreen(this);
		gameScreen = new GameScreen(this);
		setScreen(menuScreen);
	}
}
