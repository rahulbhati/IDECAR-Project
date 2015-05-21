package com.idecar.desing.navigationslider;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.unity3d.player.UnityPlayerNativeActivity;

public class AugmentedActivity extends UnityPlayerNativeActivity {
	final long delay = 5000;
	View mainHomeView;
	ViewGroup leafParent;

	Camera camera;
	SurfaceView surfaceView;
	SurfaceHolder surfaceHolder;

	boolean previewing = false;
	LayoutInflater controlInflater = null;

	Button buttonTakePicture;

	final int RESULT_SAVEIMAGE = 0;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		// Handler handler = new Handler();
		// handler.postDelayed(handleARView(), delay);
	}

	/*
	 * private View getLeafView(View view) { if (view instanceof ViewGroup) {
	 * ViewGroup vg = (ViewGroup) view; for (int i = 0; i < vg.getChildCount();
	 * ++i) { View chview = vg.getChildAt(i); View result = getLeafView(chview);
	 * if (result != null) return result; } return null; } else {
	 * 
	 * return view; }
	 * 
	 * } public Runnable handleARView() { Runnable runnable = new Runnable() {
	 * public void run() { ViewGroup rootView = (ViewGroup)
	 * AugmentedActivity.this .findViewById(android.R.id.content);
	 * 
	 * 
	 * View topMostView = getLeafView(rootView);
	 * 
	 * 
	 * 
	 * leafParent = (ViewGroup) topMostView.getParent();
	 * 
	 * 
	 * mainHomeView = getLayoutInflater().inflate( R.layout.activity_scan,
	 * null);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * leafParent.addView(mainHomeView, new LayoutParams(
	 * LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	 * 
	 * 
	 * } }; return runnable; }
	 */
	@Override
	public void onBackPressed() {

		onDestroy();
		super.onBackPressed();

	}

	/*
	 * public OnClickListener clickEvent(Context context) { OnClickListener
	 * onClickListener = new OnClickListener() {
	 * 
	 * @Override public void onClick(View v1) {
	 * 
	 * // onDestroy();
	 * 
	 * } }; return onClickListener; }
	 */
}
