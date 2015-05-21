package com.idecar.desing.navigationslider.fragment;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idecar.desing.navigationslider.R;

public class About extends Fragment {
	TextView txt;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 View rootView = inflater.inflate(R.layout.about_fragment, container, false);
	     txt=(TextView)rootView.findViewById(R.id.txt);
	//	 Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "font.ttf");
	//	 txt.setTypeface(tf);
			return rootView;
			}
}
