/*
 * �{�^���̃N���b�N�C�x���g
 * �����_��
 * 
 */
package com.example.test2;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    
    }

    /*
     * �{�^�����N���b�N���邽�т�0,1,2�̂ǂꂩ�̐��l��\�����܂�
     * 
     * 
     */
    public void button1_onClick(View view) {
    	
    	TextView textView1 = (TextView)findViewById(R.id.textView1);
    	
    	Random rnd = new Random();
        int a = rnd.nextInt(3); // 0,1,2�̒l���Ƃ�܂�
        
        textView1.setText(String.valueOf(a));
    	
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
