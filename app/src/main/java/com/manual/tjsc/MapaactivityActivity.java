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
import android.view.View;

public class MapaactivityActivity extends Activity {
	
	
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private ImageView imageview2;
	private LinearLayout linear3;
	private TextView textview1;
	private TextView textview32;
	private TextView textview37;
	private TextView textview36;
	private TextView textview35;
	private TextView textview34;
	private TextView textview33;
	private TextView textview31;
	private TextView textview21;
	private TextView textview30;
	private TextView textview29;
	private TextView textview28;
	private TextView textview27;
	private TextView textview26;
	private TextView textview25;
	private TextView textview24;
	private TextView textview23;
	private TextView textview22;
	private TextView textview17;
	private TextView textview20;
	private TextView textview19;
	private TextView textview18;
	private TextView textview15;
	private TextView textview16;
	private TextView textview14;
	private TextView textview10;
	private TextView textview13;
	private TextView textview12;
	private TextView textview11;
	private TextView textview8;
	private TextView textview9;
	private TextView textview2;
	private TextView textview7;
	private TextView textview6;
	private TextView textview3;
	private TextView textview5;
	private TextView textview4;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mapaactivity);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview32 = (TextView) findViewById(R.id.textview32);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview26 = (TextView) findViewById(R.id.textview26);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview4 = (TextView) findViewById(R.id.textview4);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "O chefe");
			}
		});
		
		textview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "O jogador");
			}
		});
		
		textview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Não tem mais trabalho? Fale com ele.");
			}
		});
		
		textview35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Problemas no computador? Fale com ele.");
			}
		});
		
		textview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "O determinado");
			}
		});
		
		textview33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Super gentil!");
			}
		});
		
		textview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Costuma furar em campeonato de futebol");
			}
		});
		
		textview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Yuri Silveira Yukimura Lopez esteve aqui");
			}
		});
		
		textview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Não gosta de tomate mas come molho de tomate");
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Evite debates perto dela");
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Evite falar muito alto perto dela");
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Um ótimo amigo!");
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Pessoa mais calma da divisão");
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "O Sensei");
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "O estagiário Jack Daniels");
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Aquele que faz o trabalho pesado");
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Aquele que adora academia");
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Aquele que ama os processos");
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Aquele que sempre te ajuda");
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Chefe mais calmo");
			}
		});
	}
	private void initializeLogic() {
		setTitle("Mapa da Divisão");
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
