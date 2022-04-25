package com.example.studying_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        PublisherGetter {

    private Publisher publisher = new Publisher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        BlankFragment1 blankFragment1 = new BlankFragment1();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        publisher.clin( blankFragment1);
        publisher.clin( blankFragment2);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.mainF,mainFragment);
        fragmentTransaction.add(R.id.main1f,blankFragment1);
        fragmentTransaction.add(R.id.main2f,blankFragment2);
        fragmentTransaction.commit();
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

}