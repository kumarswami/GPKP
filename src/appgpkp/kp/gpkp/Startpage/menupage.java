package appgpkp.kp.gpkp.Startpage;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import appgpkp.kp.gpkp.R;

public class menupage extends ListActivity {

	String classes[]={"History","Introduction","Academics","Registration","Infrastructure","ExamResult","Photos","Facilities","AboutUs","CreatedBy"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Choose Menu");
		ac.setIcon(R.drawable.gpkplogo);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
		setListAdapter(new ArrayAdapter<String>(menupage.this, android.R.layout.simple_list_item_1 ,classes));	

		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String listitem= classes[position];
		switch(position){
		case 0 :
			try{
				Class history=Class.forName("appgpkp.kp.gpkp.History."+listitem);
				Intent i=new Intent(menupage.this,history);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 1 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Introduction."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 2 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Academics."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 3 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Registration."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;	
		case 4 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Infrastructure."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
			
		case 5 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.ExamResult."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 6 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Photos."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 7 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.Facilities."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 8 :
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.AboutUs."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;
		case 9:
			try{
				Class intro=Class.forName("appgpkp.kp.gpkp.CreatedBy."+listitem);
				Intent i=new Intent(menupage.this,intro);
				startActivity(i);
				break;
				}
				catch(ClassNotFoundException e){
					
				}
			break;	
		
	
	}
	
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
