package appgpkp.kp.gpkp.Academics;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import appgpkp.kp.gpkp.R;

public class Curriculum extends Activity {

	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Curriculum");
		ac.setIcon(R.drawable.academic);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
		setContentView(R.layout.curriculum);
		b1=(Button)findViewById(R.id.btncurr);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://gpkolhapur.org.in//curriculum.asp"));
            	startActivity(intent);
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
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent i3=new Intent("android.intent.action.ACADEMICS");
		startActivity(i3);
		super.onBackPressed();
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.action_home:
			Intent i=new Intent("android.intent.action.HOMEPAGE");
			startActivity(i);
		case R.id.action_menu:
			Intent i1=new Intent("android.intent.action.NEWMENU");
			startActivity(i1);
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
