package com.idecar.desing.navigationslider;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends Activity {
	private static int splashTime = 3000;
TextView txtWelcome;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		txtWelcome=(TextView)findViewById(R.id.txtWelcom);
		 Typeface tf = Typeface.createFromAsset(getAssets(), "font.ttf");
		 txtWelcome.setTypeface(tf);
		splashTime();

	}

	public void splashTime() {
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
                 Intent intentMain=new Intent(SplashActivity.this,MainActivity.class);
                 startActivity(intentMain);
                 finish();
			}
		}, splashTime);
	}
}
