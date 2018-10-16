package com.ruby.bmi;

import android.util.Log;
import android.view.View;

public class MyListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.d("MainActivity", "onClick: help");
    }
}
