package com.example.uitest;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	ProgressBar progressBar1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		progressBar1 = (ProgressBar)findViewById(R.id.progressBar1);
		//progressBar1.setMax(100); // 水平プログレスバーの最大値を設定
		//progressBar1.setProgress(20); // 水平プログレスバーの値を設定
		//progressBar1.setSecondaryProgress(60); // 水平プログレスバーのセカンダリ値を設定
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	public void button1_onClick(View view) {
		Log.d("LOG","CLICK(1)");
		progressBar1.setVisibility(View.VISIBLE);
	}

	/*
	 * 
	 * 
	 * 
	 */
	public void button2_onClick(View view) {
		Log.d("LOG","CLICK(2)");
		progressBar1.setVisibility(View.GONE);
	}
	

}
