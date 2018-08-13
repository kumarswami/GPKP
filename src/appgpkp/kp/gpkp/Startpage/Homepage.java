package appgpkp.kp.gpkp.Startpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;
import appgpkp.kp.gpkp.R;

public class Homepage extends Activity {

	private ProgressDialog pd;
	
	private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle="GPKP";
    private String[] moperationTitles;
	ImageButton b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
				
		 moperationTitles = getResources().getStringArray(R.array.operation_array);
	        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	        mDrawerList = (ListView) findViewById(R.id.left_drawer);

	     // set a custom shadow that overlays the main content when the drawer opens
	        //mDrawerLayout.setDrawerShadow(GravityCompat.START);
	        // set up the drawer's list view with items and click listener
	        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
	                R.layout.drawer_list_item, moperationTitles));
	        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

	        // enable ActionBar app icon to behave as action to toggle nav drawer
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	        
	     // ActionBarDrawerToggle ties together the the proper interactions
	        // between the sliding drawer and the action bar app icon
	        mDrawerToggle = new ActionBarDrawerToggle(
	                this,                  /* host Activity */
	                mDrawerLayout,         /* DrawerLayout object */
	                R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
	                R.string.drawer_open,  /* "open drawer" description for accessibility */
	                R.string.drawer_close  /* "close drawer" description for accessibility */
	                ) {
	        	
	        	public void onDrawerClosed(View view) {
	                getActionBar().setTitle(mTitle);
	                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
	            }

	            public void onDrawerOpened(View drawerView) {
	                getActionBar().setTitle(mDrawerTitle);
	                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
	            }
	        	
	        };
	        mDrawerLayout.setDrawerListener(mDrawerToggle);
		b1=(ImageButton)findViewById(R.id.menuopbtn);
		b1.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View arg0) {
				
				// TODO Auto-generated method stub
				Intent i=new Intent("android.intent.action.NEWMENU");
				startActivity(i);
			}
		});
		
	}
		@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		 boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
	       // menu.findItem(R.id.action_home).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}
	
    
	@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
		if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
			return super.onOptionsItemSelected(item);
		}


	private class DrawerItemClickListener implements ListView.OnItemClickListener {
		
		
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        	//flag=true;
            Intent i;
        	switch(position){
        	         
        	case 0:
        		i=new Intent("android.intent.action.HISTORY");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 1:
        		i=new Intent("android.intent.action.INTRODUCTION");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 2:
        		i=new Intent("android.intent.action.ACADEMICS");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 3:
        		i=new Intent("android.intent.action.INFRASTRUCTURE");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 4:
        		i=new Intent("android.intent.action.REGISTRATION");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 5:
        		i=new Intent("android.intent.action.EXAMRESULT");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 6:
        		i=new Intent("android.intent.action.PHOTOS");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 7:
        		i=new Intent("android.intent.action.FACILITIES");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 8:
        		i=new Intent("android.intent.action.ABOUTUS");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        	case 9:
        		i=new Intent("android.intent.action.CREATEDBY");
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;    		
                default:
                	break;
        	}
        }
    }

	@Override
	public void setTitle(CharSequence title) {
		// TODO Auto-generated method stub
		mTitle = title;
        getActionBar().setTitle(mTitle);
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
		  mDrawerToggle.syncState();
	}
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int i) {
		// TODO Auto-generated method stub
		
		pd=new ProgressDialog(this);
		pd.setIcon(R.drawable.gpkplogo);
		pd.setTitle("GPKP");
		pd.setProgressStyle(pd.STYLE_HORIZONTAL);
		pd.setButton(DialogInterface.BUTTON_POSITIVE,"Yes" ,new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		
		pd.setButton(DialogInterface.BUTTON_NEGATIVE,"No",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent i=new Intent("android.intent.action.HOMEPAGE");
				startActivity(i);
			}
		});
		
		return pd;
		
		
	}
	
	}
	

	
    
	


	
	
	

