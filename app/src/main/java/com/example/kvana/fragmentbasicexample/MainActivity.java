package com.example.kvana.fragmentbasicexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_one,btn_two,btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_one = (Button) findViewById(R.id.button_one);
        btn_two = (Button) findViewById(R.id.button_two);
        btn_back= (Button) findViewById(R.id.btn_back);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragmentOne f1 = new FragmentOne();
                ft.add(R.id.fragment_one,f1);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             FragmentManager FM = getFragmentManager();
                FragmentTransaction FT =FM.beginTransaction();
                FragmentTwo F2 = new FragmentTwo();
                FT.add(R.id.fragment_two,F2);
                FT.addToBackStack(null);
                FT.commit();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_back:
                        onBackPressed();
                        break;
                }

            }
        });
    }
}
