package com.example.animation1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	AnimationDrawable _animation;
	boolean _repeat = true;
	ImageView _imageViewBeacon; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		_imageViewBeacon = (ImageView) this.findViewById(R.id.imageViewBeacon);
		//_imageViewBeacon.setVisibility(View.INVISIBLE);
		_imageViewBeacon.setBackgroundResource(R.anim.animation);
		_animation = (AnimationDrawable) _imageViewBeacon.getBackground();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void button1_onClick(View view) {
		// _animetion.stop();
		//_image.setVisibility(View.VISIBLE);
		_animation.start();
	}

	public void button2_onClick(View view) {
		_animation.stop();
	}

}
