package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String job="j1";


       String[] tab= getResources().getStringArray(R.array.jobs);
       sp.setSelection(Arrays.asList(tab).indexOf(job));


    }
}