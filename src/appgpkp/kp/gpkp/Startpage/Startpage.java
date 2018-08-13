package appgpkp.kp.gpkp.Startpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import appgpkp.kp.gpkp.R;

public class Startpage extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		new Thread(){
			public void run(){
				try{
					sleep(4500);
					Intent i=new Intent("android.intent.action.HOMEPAGE");
					startActivity(i);
				}
				catch(InterruptedException e){
					System.out.println("Error" +e);
				}
				
			}
			
		}.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	

}
