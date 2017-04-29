package com.example.kvana.fragmentbasicexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b_one,b_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_one = (Button) findViewById(R.id.button_one);
        b_two = (Button) findViewById(R.id.button_two);

        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragmentOne f1 = new FragmentOne();
                ft.add(R.id.fragment_one,f1);
                ft.commit();
            }
        });


        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             FragmentManager FM = getFragmentManager();
                FragmentTransaction FT =FM.beginTransaction();
                FragmentTwo F2 = new FragmentTwo();
                FT.add(R.id.fragment_two,F2);
                FT.commit();
            }
        });
    }
}
