package com.task.customeimageviewwithtextview.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.customeimageviewwithtextview.R;

/**
 * Created by SAFACS on 5/7/2018.
 */

public class Fragone extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View v =inflater.inflate(R.layout.fragone,container,false);
        return v;
    }
}
