package appgpkp.kp.gpkp.Photos;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import appgpkp.kp.gpkp.R;

public class Photos extends Activity {

	ImageSwitcher imgswitcher;
    Button nextImageButton;
    int imageSwitcherImages[] = {R.drawable.gpkpmain, R.drawable.gpkpnewim1,R.drawable.gpkpnewim2, R.drawable.gpkpnewim3,
    		R.drawable.gpkpnewimg,R.drawable.gpkpold4,R.drawable.gpkpnewimg4,R.drawable.gpkpnewimg5,R.drawable.workshop11,R.drawable.photo1,R.drawable.photo2,R.drawable.gpkpoldimg,R.drawable.gpkpold3,R.drawable.gpkpold4,R.drawable.libraryimg1,R.drawable.libraryimg2,R.drawable.gpkpstartimg2};
    int switcherImage = imageSwitcherImages.length;
    int counter = -1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo);
		imgswitcher=(ImageSwitcher)findViewById(R.id.imgswitcher1);
		nextImageButton=(Button)findViewById(R.id.nxtimgbtn);
		ActionBar ac=getActionBar();
		ac.show();
		ac.setTitle("GPKP Gallery");
		ac.setIcon(R.drawable.gallery);
		ac.setDisplayShowHomeEnabled(true);
		ac.setDisplayShowTitleEnabled(true);
		
		imgswitcher.setFactory(new ViewFactory() {
			
			@Override
			public View makeView() {
				// TODO Auto-generated method stub
				ImageView switcherImageView = new ImageView(getApplicationContext());
                //switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                  //ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT));
                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.gpkpmain);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
			}
		});
		Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
	     Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

	        imgswitcher.setOutAnimation(animationOut);
	        imgswitcher.setInAnimation(animationIn);
	}

	public void nextImageButton(View view) {
        counter++;
        if (counter == switcherImage)
            counter = 0;
            imgswitcher.setImageResource(imageSwitcherImages[counter]);
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
		Intent i=new Intent("android.intent.action.HOMEPAGE");
		startActivity(i);
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
