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

        /**
         * now release1.0 has tested, and pass all testcase.
         */

        /**
         * after release1.0 add new logic for next release.
         */

        /**
         * after merge featurA, now it's time to release.
         */
    }

    @Override
    protected void onResume() {
        super.onResume();

        /**
         * add logic on develop branch
         */
    }

    @Override
    protected void onPause() {
        super.onPause();

        /**
         * add logic on develop branch
         */
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