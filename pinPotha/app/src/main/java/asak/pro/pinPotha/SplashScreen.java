package asak.pro.pinPotha;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import asak.pro.pinPotha.R;

/**
 * Created by root on 10/16/15.
 */
public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Thread timerThread = new Thread(){
			public void run(){
				try{
					sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent intent = new Intent(SplashScreen.this,SampleActivity.class);
					startActivity(intent);
				}
			}
		};
		timerThread.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
