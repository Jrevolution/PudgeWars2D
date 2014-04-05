package com.main.pudgewars2d;
import com.kilobolt.framework.Screen;
import com.kilobolt.framework.implementation.AndroidGame;


public class PWMain extends AndroidGame{

	@Override
	public Screen getInitScreen() {
		return new LoadingScreen(this);
	}
	
	@Override
	public void onBackPressed() {
		getCurrentScreen().backButton();
	}
}
