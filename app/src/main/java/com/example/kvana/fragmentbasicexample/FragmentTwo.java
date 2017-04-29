package com.example.kvana.fragmentbasicexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kvana on 4/28/17.
 */

public class FragmentTwo extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two_layout,container,false);
        return v;

    }
}
