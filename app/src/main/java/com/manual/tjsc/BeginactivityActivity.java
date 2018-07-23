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
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class BeginactivityActivity extends Activity {
	
	
	private ScrollView vscroll2;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private TextView secoes;
	private TextView saj;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	
	private AlertDialog.Builder welcome;
	private AlertDialog.Builder sairdoapp;
	private Intent go = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.beginactivity);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		secoes = (TextView) findViewById(R.id.secoes);
		saj = (TextView) findViewById(R.id.saj);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		welcome = new AlertDialog.Builder(this);
		sairdoapp = new AlertDialog.Builder(this);
		
		secoes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), SecoesactivityActivity.class);
				startActivity(go);
			}
		});
		
		saj.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), SajactivityActivity.class);
				startActivity(go);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), LoginactivityActivity.class);
				startActivity(go);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), MapaactivityActivity.class);
				startActivity(go);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), InformacoesactivityActivity.class);
				startActivity(go);
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				go.setClass(getApplicationContext(), SobreactivityActivity.class);
				startActivity(go);
			}
		});
	}
	private void initializeLogic() {
		welcome.setTitle("Seja Bem Vindo!");
		welcome.setMessage("Olá estagiário(a)!\nSeja bem vindo ao Tribunal de Justiça de Santa Catarina e principalmente à nossa seção.\nTemos conhecimento que o primeiro dia sempre pode ser assustador, mas este aplicativo serve para tentar lhe ajudar de início.\nPressione o botão para continuar.");
		welcome.setNegativeButton("Pular", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		welcome.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				welcome.setTitle("Primeiros passos!");
				welcome.setMessage("Há algumas divisões por classes que podem lhe interessar, elas são:\n- Seções\n- SAJ\n- Login\n- Mapa da divisão\n- Informações úteis adicionais");
				welcome.create().show();
				welcome.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						welcome.setMessage("Para selecionar um deles basta pressionar em cima e informações mais detalhadas devem aparecer.\nNa classe de Seções você aprenderá a função de cada seção da DRI e o nome de seus funcionários.\nNa classe SAJ você aprenderá funções básicas do SAJ como: \n- Cancelamento de Carga\n- Códigos\n- Consulta de Processos\n- Emissão de Etiqueta\n- Localização de Processos\n- Recebimento de Carga\n- Remessa\nNa classe Login você aprenderá instruções sobre onde usar seu login e a importância dele e da segurança dele.\nNa classe Mapa da divisão você terá acesso a um mapa que facilitará a localização das mesas da divisão e o nome dos funcionários em cada mesa.\nNa classe de informações úteis você literalmente aprenderá alguns macetes muito úteis para ter uma melhor experiência durante seu período trabalhando conosco.\nAcredito que isso é tudo por agora.\nAté a próxima e boa sorte estagiário(a)!");
						welcome.create().show();
						welcome.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
					}
				});
			}
		});
		welcome.create().show();
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
