package com.example.adrest1;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void imageView1_onClick(View view) {
        
        Log.d("LOG", "ImageView OnClick!!");
        Uri uri = Uri.parse("http:/www.google.com/");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

}
