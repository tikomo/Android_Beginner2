package com.example.adtest3;

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

	// ポップアップウインドウの表示
	// ボタンを３つ用意して、別々のポップアップウインドウを表示する
	// ポップアップウインドウはそれそれ作成する
	// ポップアップウインドウの切替もテスト
	
	PopupWindow popupWindow1 = null;
	PopupWindow popupWindow2 = null;
	PopupWindow popupWindow3 = null;
	
	Handler mHandler = new Handler();
	// View view;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CreatePopupWindow1();
		CreatePopupWindow2();
		CreatePopupWindow3();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void CreatePopupWindow1() {
		
		// LayoutInflaterインスタンスを取得
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 
		// ポップアップ用のView用のレイアウトファイル(xxxxxxxx.xml)を読み込む
		View popupView = (View)inflater.inflate(R.layout.popup1, null);
		
		ImageView mPopupWindowImageView = (ImageView)popupView.findViewById(R.id.imageView1);
		
		mPopupWindowImageView.setOnClickListener(new ImageView.OnClickListener(){

			@Override
			public void onClick(View v) {
				popupWindow1.dismiss();
			}});
		 
		// レイアウトパラメータをセット
		popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		// popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
		 
		// PopupWindowを紐づけるViewのインスタンスを取得
		View view = findViewById(R.id.button1);
		 
		// viewに紐づけたPopupWindowインスタンスを生成
		popupWindow1 = new PopupWindow(view);
		 
		// ポップアップ用のViewをpopupWindowにセットする
		popupWindow1.setContentView(popupView);
		 
		// サイズ(幅)を設定
		popupWindow1.setWidth(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// サイズ(高さ)を設定
		popupWindow1.setHeight(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// 切替ボタンにリスナーを設定
		//Button btn = (Button) findViewById(R.id.button);
		//btn.setOnClickListener(this);
	}
	
	private void CreatePopupWindow2() {
		
		// int layoutFile = R.layout.popup2;
		
		// LayoutInflaterインスタンスを取得
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 
		// ポップアップ用のView用のレイアウトファイル(xxxxxxxx.xml)を読み込む
		View popupView = (View)inflater.inflate(R.layout.popup2, null);
		
		// レイアウトファイル内のImageViewパーツ
		ImageView mPopupWindowImageView = (ImageView)popupView.findViewById(R.id.imageView1);
		
		mPopupWindowImageView.setOnClickListener(new ImageView.OnClickListener(){
			@Override
			public void onClick(View v) {
				popupWindow2.dismiss();
			}});
		 
		// レイアウトパラメータをセット
		popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		// popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
		 
		// PopupWindowを紐づけるViewのインスタンスを取得
		View view = findViewById(R.id.button2);
		 
		// viewに紐づけたPopupWindowインスタンスを生成
		popupWindow2 = new PopupWindow(view);
		 
		// ポップアップ用のViewをpopupWindowにセットする
		popupWindow2.setContentView(popupView);
		 
		// サイズ(幅)を設定
		popupWindow2.setWidth(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// サイズ(高さ)を設定
		popupWindow2.setHeight(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// 切替ボタンにリスナーを設定
		//Button btn = (Button) findViewById(R.id.button);
		//btn.setOnClickListener(this);

	}

	private void CreatePopupWindow3() {
		
		// LayoutInflaterインスタンスを取得
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 
		// ポップアップ用のView用のレイアウトファイル(xxxxxxxx.xml)を読み込む
		View popupView = (View)inflater.inflate(R.layout.popup3, null);
		
		// レイアウトファイル内のImageViewパーツ
		ImageView mPopupWindowImageView = (ImageView)popupView.findViewById(R.id.imageView1);
		
		mPopupWindowImageView.setOnClickListener(new ImageView.OnClickListener(){
			@Override
			public void onClick(View v) {
				popupWindow3.dismiss();
			}});
		 
		// レイアウトパラメータをセット
		popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		// popupView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
		 
		// PopupWindowを紐づけるViewのインスタンスを取得
		View view = findViewById(R.id.button3);
		 
		// viewに紐づけたPopupWindowインスタンスを生成
		popupWindow3 = new PopupWindow(view);
		 
		// ポップアップ用のViewをpopupWindowにセットする
		popupWindow3.setContentView(popupView);
		 
		// サイズ(幅)を設定
		popupWindow3.setWidth(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// サイズ(高さ)を設定
		popupWindow3.setHeight(WindowManager.LayoutParams.WRAP_CONTENT); // 実際のサイズ
		//popupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT); // 画面いっぱい　当然グラビティとか効かない
		 
		// 切替ボタンにリスナーを設定
		//Button btn = (Button) findViewById(R.id.button);
		//btn.setOnClickListener(this);

	}

	public void button1_onClick(View view) {
		
		Log.d("LOG","CLICK!!");
		
		// 切替ボタン押下時にポップアップウィンドウの表示、非表示を切り替える
		if(popupWindow1.isShowing()){
			popupWindow1.dismiss();
		}else{
			// popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
			popupWindow1.showAtLocation(view, Gravity.BOTTOM, 0, 0);
		}
	}
	
	public void button2_onClick(View view) {
		Log.d("LOG","CLICK!!");

		// 切替ボタン押下時にポップアップウィンドウの表示、非表示を切り替える
		if(popupWindow2.isShowing()){
			popupWindow2.dismiss();
		}else{
			// popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
			popupWindow2.showAtLocation(view, Gravity.BOTTOM, 0, 0);
		}
	}

	public void button3_onClick(View view) {
		Log.d("LOG","CLICK!!");

		// 切替ボタン押下時にポップアップウィンドウの表示、非表示を切り替える
		if(popupWindow3.isShowing()){
			popupWindow3.dismiss();
		}else{
			// popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
			popupWindow3.showAtLocation(view, Gravity.BOTTOM, 0, 0);
		}
	}
}


