package com.example.adtest2;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

	PopupWindow popupWindow;
	Handler mHandler = new Handler();
	View view;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// LayoutInflaterインスタンスを取得
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 
		// ポップアップ用のView用のレイアウトファイル(xxxxxxxx.xml)を読み込む
		View popupView = (View)inflater.inflate(R.layout.popup1, null);
		
		ImageView iv = (ImageView)popupView.findViewById(R.id.imageView1);
		
		iv.setOnClickListener(new ImageView.OnClickListener(){

			@Override
			public void onClick(View v) {
				popupWindow.dismiss();
			}});
		 
		// レイアウトパラメータをセット
		popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		// popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
		 
		// PopupWindowを紐づけるViewのインスタンスを取得
		view = findViewById(R.id.button1);
		 
		// viewに紐づけたPopupWindowインスタンスを生成
		popupWindow = new PopupWindow(view);
		 
		// ポップアップ用のViewをpopupWindowにセットする
		popupWindow.setContentView(popupView);
		 
		// サイズ(幅)を設定
		popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// サイズ(高さ)を設定
		popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// 切替ボタンにリスナーを設定
		//Button btn = (Button) findViewById(R.id.button);
		//btn.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void button1_onClick(View view) {
		
		Log.d("LOG","CLICK!!");
		
		// 切替ボタン押下時にポップアップウィンドウの表示、非表示を切り替える
		if(popupWindow.isShowing()){
			popupWindow.dismiss();
		}else{
			// popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
			popupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 200);
		}

	}

}
