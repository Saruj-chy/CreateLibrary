package com.sd.saruj.createlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.sd.saruj.mymath.OwnMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int value = OwnMath.plus(5,10);
        Log.d("TAG","value: "+value) ;
    }
}
