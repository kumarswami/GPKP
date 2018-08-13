package appgpkp.kp.gpkp.Infrastructure;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ViewFlipper;
import appgpkp.kp.gpkp.R;

public class Infrastructure extends Activity {

	private ViewFlipper viewFlipper;
    private float lastX;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infra);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("Infrastructure");
		ac.setIcon(R.drawable.infrastructure);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
		viewFlipper=(ViewFlipper)findViewById(R.id.vf);
	}
	@Override
	public boolean onTouchEvent(MotionEvent touchevent) {
		// TODO Auto-generated method stub
		switch (touchevent.getAction()) {
        
        case MotionEvent.ACTION_DOWN: 
        	lastX = touchevent.getX();
            break;
        case MotionEvent.ACTION_UP: 
            float currentX = touchevent.getX();
            
            // Handling left to right screen swap.
            if (lastX < currentX) {
            	
            	// If there aren't any other children, just break.
                if (viewFlipper.getDisplayedChild() == 0)
                	break;
                
                // Next screen comes in from left.
                viewFlipper.setInAnimation(this, R.anim.slide_in_from_left);
                // Current screen goes out from right. 
                viewFlipper.setOutAnimation(this, R.anim.slide_out_to_right);
                
                // Display next screen.
                viewFlipper.showNext();
             }
                                     
            // Handling right to left screen swap.
             if (lastX > currentX) {
            	 
            	 // If there is a child (to the left), kust break.
            	 if (viewFlipper.getDisplayedChild() == 1)
            		 break;
    
            	 // Next screen comes in from right.
            	 viewFlipper.setInAnimation(this, R.anim.slide_in_from_right);
            	// Current screen goes out from left. 
            	 viewFlipper.setOutAnimation(this, R.anim.slide_out_to_left);
                 
            	// Display previous screen.
                 viewFlipper.showPrevious();
             }
             break;
    	 }
         return false;
    }
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent i=new Intent("android.intent.action.HOMEPAGE");
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
	
