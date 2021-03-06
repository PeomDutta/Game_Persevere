//done by peomd

package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.PlayScreen;

public class PersevereGame extends Game {
	public static final int V_WIDTH = 400; //Virtual Width
	public static final int V_HEIGHT = 208; //Virtual Height
	public static final float PPM =100;

	public static final short NOTHING_BIT = 0;
	public static final short GROUND_BIT = 1;
	public static final short PERSE_BIT = 2;
	public static final short BRICK_BIT = 4;
	public static final short COIN_BIT = 8;
	public static final short DESTROYED_BIT = 16;
	public static final short OBJECT_BIT = 32;
	public static final short ENEMY_BIT = 64;
	public static final short ENEMY_HEAD_BIT = 128;
	public static final short ITEM_BIT = 256;
	public static final short PERSE_HEAD_BIT = 512;
	public static final short FIREBALL_BIT = 1024;

	public SpriteBatch batch;
	public static AssetManager manager;
	//Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		manager = new AssetManager();
		manager.load("audio/music/time_music.ogg", Music.class);
		manager.load("audio/sounds/coin.wav", Sound.class);
		manager.load("audio/sounds/bump.wav", Sound.class);
		manager.load("audio/sounds/breakblock.wav", Sound.class);
		manager.load("audio/sounds/powerup_spawn.wav", Sound.class);
		manager.load("audio/sounds/powerup.wav", Sound.class);
		manager.load("audio/sounds/powerdown.wav", Sound.class);
		manager.load("audio/sounds/stomp.wav", Sound.class);
		manager.load("audio/sounds/die.wav", Sound.class);

		manager.finishLoading();
		setScreen(new PlayScreen(this));
	}
	
	@Override   						//Red
	public void dispose () {
		super.dispose();
		manager.dispose();
		batch.dispose();
		//img.dispose();
	}
	@Override
	public void render ()
	{
		super.render();
	}

	/*public static String bitToText(short bit){
		switch(bit){
			case 1:
				return "DEFAULT";
			case 2:
				return "PERSE";
			case 4:
				return "BRICK";
			case 8:
				return "COIN";
			case 16:
				return "DESTROYED";
			case 32:
				return "ENEMY";
			case 64:
				return "GROUND";
			default:
				return "DEFAULT";
		}
	}*/

}
