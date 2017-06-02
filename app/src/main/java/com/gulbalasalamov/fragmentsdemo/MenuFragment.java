package com.gulbalasalamov.fragmentsdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends ListFragment {

    List<String> AndroidOs;
    List<String> AndroidVersion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        AndroidOs = new ArrayList<String>();
        AndroidOs.add("Cupcake");
        AndroidOs.add("Donut");
        AndroidOs.add("Eclair");
        AndroidOs.add("Froyo");
        AndroidOs.add("Ginderbeard");
        AndroidOs.add("Honeycomb");
        AndroidOs.add("Ice Cream Sandwich");
        AndroidOs.add("Jelly Bean");
        AndroidOs.add("Kit Kat");
        AndroidOs.add("Lollipop");
        AndroidOs.add("Marshmallow");
        AndroidOs.add("Nougat");

        AndroidVersion = new ArrayList<String>();
        AndroidVersion.add("1.5");
        AndroidVersion.add("1.6");
        AndroidVersion.add("2.0-2.1");
        AndroidVersion.add("2.2");
        AndroidVersion.add("2.3");
        AndroidVersion.add("3.0-3.2");
        AndroidVersion.add("4.0");
        AndroidVersion.add("4.1-4.3");
        AndroidVersion.add("4.4");
        AndroidVersion.add("5.0");
        AndroidVersion.add("6.0");
        AndroidVersion.add("7.0");

        inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidOs);
        setListAdapter(adapter);
        return view;
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        TextFragment text = (TextFragment) getFragmentManager().findFragmentById(R.id.fragmenttext);
        text.change(AndroidOs.get(position), AndroidVersion.get(position));
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}
