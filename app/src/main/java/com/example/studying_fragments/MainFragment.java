package com.example.studying_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainFragment extends Fragment {

private Publisher publisher;// Обработчик подписок

public void onAttach(Context context){
    super.onAttach(context);
    publisher = ((PublisherGetter)context).getPublisher();//получим обработчика подписок


}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main, container, false);
        final EditText textwv =view.findViewById(R.id.editText);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textwv.getText().toString();
                publisher.notifu(text);

            }
        });
        return view;
    }
}