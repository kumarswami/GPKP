package appgpkp.kp.gpkp.Introduction;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import appgpkp.kp.gpkp.R;

public class introduction1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro1);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Introduction");
		ac.setIcon(R.drawable.introduction);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent i=new Intent("android.intent.action.INTRODUCTION");
		startActivity(i);
		super.onBackPressed();
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
