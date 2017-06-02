package com.gulbalasalamov.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

    TextView tv_androidos,tv_androidversion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text,container,false);
        tv_androidos = (TextView)view.findViewById(R.id.androidos);
        tv_androidversion = (TextView)view.findViewById(R.id.androidversion);
        return view;
    }

    public void change(String text1, String text2){
        tv_androidos.setText(text1);
        tv_androidversion.setText(text2);
    }
}
