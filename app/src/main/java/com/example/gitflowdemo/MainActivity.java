package com.example.gitflowdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();

        /**
         * add logic on develop branch
         */

        /**
         * add logic on release1.0 branch
         */

        /**
         * add more logic on release1.0 branch
         */
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

        /**
         * add logic on develop branch
         */

        /**
         * add logic on release1.0 branch
         */

        /**
         * add more logic on release1.0 branch
         */
    }
}