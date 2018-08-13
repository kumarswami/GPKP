package appgpkp.kp.gpkp.Academics;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import appgpkp.kp.gpkp.R;

public class Academics extends ListActivity {

	String classes[]={"Curriculum","AcademicsCalender"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Academics");
		ac.setIcon(R.drawable.ac);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
		setListAdapter(new ArrayAdapter<String>(Academics.this, android.R.layout.simple_list_item_1 ,classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String listitem= classes[position];
		switch(position){
		case 0 :
			try{
				Class history=Class.forName("appgpkp.kp.gpkp.Academics."+listitem);
				Intent i=new Intent(Academics.this,history);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 1 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Academics."+listitem);
				Intent i=new Intent(Academics.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
	
	}
	
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent i3=new Intent("android.intent.action.HOMEPAGE");
		startActivity(i3);
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
	
