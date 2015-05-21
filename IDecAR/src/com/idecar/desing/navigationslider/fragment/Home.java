package com.idecar.desing.navigationslider.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.idecar.desing.navigationslider.AugmentedActivity;
import com.idecar.desing.navigationslider.R;

public class Home extends Fragment {
Button btnAR;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 View rootView = inflater.inflate(R.layout.home_fragment, container, false);
		 btnAR=(Button)rootView.findViewById(R.id.btnAR);
		 btnAR.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent=new Intent(getActivity(),com.qualcomm.QCARUnityPlayer.QCARPlayerNativeActivity.class);
			getActivity().startActivity(intent);
			}
		});
		
			return rootView;
			}

}
