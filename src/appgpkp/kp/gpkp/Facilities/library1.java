package appgpkp.kp.gpkp.Facilities;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import appgpkp.kp.gpkp.R;

public class library1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lib1);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Library");
		ac.setIcon(R.drawable.library1);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent i=new Intent("android.intent.action.LIBRARY");
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
			Intent i=new Intent("android.intent.action.LIBRARY");
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
