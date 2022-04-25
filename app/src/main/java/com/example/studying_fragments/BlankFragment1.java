package com.example.studying_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment1 extends Fragment implements Observer{
TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank1, container, false);
        textView = view.findViewById(R.id.textView1);
        return view;
    }
    public void updateText(String text){
        textView.setText(text);
    }
}