package edu.pacificu.cs.cs260.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE", "onCreate");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d("LIFECYCLE", "onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("LIFECYCLE", "onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("LIFECYCLE", "onPause");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("LIFECYCLE", "onStop");

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("LIFECYCLE", "onDestroy");

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart");
    }

}