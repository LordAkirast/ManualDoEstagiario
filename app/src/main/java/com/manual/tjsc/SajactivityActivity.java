package com.manual.tjsc;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class SajactivityActivity extends Activity {
	
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private ImageView imageview2;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout linear3;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private LinearLayout linear4;
	private TextView textview16;
	private TextView textview17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview21;
	private TextView textview22;
	private LinearLayout linear5;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private TextView textview36;
	private TextView textview29;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
	private TextView textview35;
	private LinearLayout linear6;
	private TextView textview34;
	private TextView textview37;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private LinearLayout linear7;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	private LinearLayout linear8;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	
	private Intent go = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.sajactivity);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview35 = (TextView) findViewById(R.id.textview35);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview41 = (TextView) findViewById(R.id.textview41);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview45 = (TextView) findViewById(R.id.textview45);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		
		textview41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), CodigoscoActivity.class);
				startActivity(go);
			}
		});
		
		textview52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), CodremessaActivity.class);
				startActivity(go);
			}
		});
	}
	private void initializeLogic() {
		setTitle("SAJ");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
