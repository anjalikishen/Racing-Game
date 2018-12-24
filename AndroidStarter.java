package com.theinvader360.racegame;

import android.os.Bundle;
import android.view.WindowManager;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.theinvader360.racegame.RaceGame;

public class AndroidStarter extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // prevent the screen from dimming/sleeping (no permission required)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON );
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        
        initialize(new RaceGame(), cfg);
    }
}
