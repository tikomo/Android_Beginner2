/*
 * �e�L�X�g�̕\��
 * ���ڎw�肷����@��strings.xml���玝���Ă�����@
 * 
 */
package com.example.test1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ���ڋL�q
        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText("Hello World2");
        
        // �����񃊃\�[�X����擾����ꍇ
        String str = getString(R.string.hello_world_a);  
        String str2 = (String) getText(R.string.hello_world_a); 
        textView.setText(str);
       
        
        Log.d("MyApp", str2); 
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
