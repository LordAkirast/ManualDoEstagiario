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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class SecoesactivityActivity extends Activity {
	
	
	private String Funcionarios = "";
	
	private ArrayList<String> funcionariosjunt = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	private ArrayList<String> funcjun = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> ma0 = new ArrayList<>();
	
	private ScrollView vscroll3;
	private LinearLayout linear6;
	private TextView textview3;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear34;
	private TextView textview8;
	private TextView textview9;
	private TextView textview21;
	private LinearLayout linear25;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview10;
	private TextView textview13;
	private TextView textview22;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private TextView textview18;
	private TextView textview11;
	private TextView textview23;
	private LinearLayout linear42;
	private LinearLayout linear41;
	private LinearLayout linear40;
	private LinearLayout linear39;
	private LinearLayout linear38;
	private LinearLayout linear37;
	private LinearLayout linear36;
	private LinearLayout linear43;
	private TextView textview19;
	private TextView textview15;
	private TextView textview24;
	private LinearLayout linear52;
	private LinearLayout linear51;
	private LinearLayout linear50;
	private LinearLayout linear49;
	private LinearLayout linear48;
	private LinearLayout linear47;
	private LinearLayout linear46;
	private TextView textview25;
	private TextView textview30;
	private TextView textview26;
	private TextView textview31;
	private TextView textview27;
	private TextView textview29;
	private TextView textview28;
	private TextView textview51;
	private TextView textview35;
	private TextView textview38;
	private TextView textview39;
	private TextView textview36;
	private TextView textview32;
	private TextView textview43;
	private TextView textview33;
	private TextView textview37;
	private TextView textview34;
	private TextView textview40;
	private TextView textview41;
	private TextView textview48;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private TextView textview44;
	private TextView textview50;
	private TextView textview49;
	private TextView textview59;
	private TextView textview58;
	private TextView textview57;
	private TextView textview56;
	private TextView textview55;
	private TextView textview54;
	private TextView textview53;
	private TextView textview52;
	private TextView textview61;
	private TextView textview62;
	private TextView textview63;
	private TextView textview64;
	private TextView textview65;
	private TextView textview66;
	private TextView textview68;
	
	private Intent title = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.secoesactivity);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview21 = (TextView) findViewById(R.id.textview21);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview23 = (TextView) findViewById(R.id.textview23);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview26 = (TextView) findViewById(R.id.textview26);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview32 = (TextView) findViewById(R.id.textview32);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview52 = (TextView) findViewById(R.id.textview52);
		textview61 = (TextView) findViewById(R.id.textview61);
		textview62 = (TextView) findViewById(R.id.textview62);
		textview63 = (TextView) findViewById(R.id.textview63);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview65 = (TextView) findViewById(R.id.textview65);
		textview66 = (TextView) findViewById(R.id.textview66);
		textview68 = (TextView) findViewById(R.id.textview68);
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ramal: 1594");
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ramal: 1609");
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ramal: 1619");
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ramal: 1629");
			}
		});
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ramal: 1642");
			}
		});
	}
	private void initializeLogic() {
		setTitle("Seções");
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Clélia Maria Bernardini Schaffner");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Daniela Arrua Estevão");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Claudia Regina Cesa");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Khaled Muhamad Abed Suleman");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Nicoli Barth Silveira");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Guilherme Trautmann Vieira");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Bianca Aline Vargas da Rosa");
			ma0.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("item", "Renata Sogari da Silva");
			ma0.add(_item);
		}
		
		
		
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
