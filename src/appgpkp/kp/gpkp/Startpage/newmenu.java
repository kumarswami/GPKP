package appgpkp.kp.gpkp.Startpage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import appgpkp.kp.gpkp.R;

public class newmenu extends Activity {

	ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newmenu);
		b1=(ImageButton)findViewById(R.id.ibtnhis);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent("android.intent.action.HISTORY");
				startActivity(i1);
			}
		});
		b2=(ImageButton)findViewById(R.id.ibtnintro);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2=new Intent("android.intent.action.INTRODUCTION");
				startActivity(i2);
			}
		});
		b3=(ImageButton)findViewById(R.id.ibtnac);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i3=new Intent("android.intent.action.ACADEMICS");
				startActivity(i3);
			}
		});
		
		b4=(ImageButton)findViewById(R.id.ibtninfra);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i4=new Intent("android.intent.action.INFRASTRUCTURE");
				startActivity(i4);
			}
		});
		b5=(ImageButton)findViewById(R.id.ibtnreg);
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i5=new Intent("android.intent.action.REGISTRATION");
				startActivity(i5);
			}
		});
    	b6=(ImageButton)findViewById(R.id.ibtnexre);
    	b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i6=new Intent("android.intent.action.EXAMRESULT");
				startActivity(i6);
			}
		});
    	b7=(ImageButton)findViewById(R.id.ibtnphoto);
    	b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i7=new Intent("android.intent.action.PHOTOS");
				startActivity(i7);
			}
		});
    	b8=(ImageButton)findViewById(R.id.ibtnfac);
    	b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i8=new Intent("android.intent.action.FACILITIES");
				startActivity(i8);
			}
		});
    	b9=(ImageButton)findViewById(R.id.ibtncreate);
    	b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i8=new Intent("android.intent.action.CREATEDBY");
				startActivity(i8);
			}
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

       
		return super.onCreateOptionsMenu(menu);
		
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.action_home:
			Intent i=new Intent("android.intent.action.HOMEPAGE");
			startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
}
