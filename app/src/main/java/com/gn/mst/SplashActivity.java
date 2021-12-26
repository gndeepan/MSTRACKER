package com.gn.mst;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;




public class SplashActivity extends AppCompatActivity {






    // After completion of 2000 ms, the next activity will get started.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity
        //can cover the entire screen.

        setContentView(R.layout.activity_splash);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);






        //this will bind your MainActivity.class file with activity_main.



        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String main = sh.getString("intent", "");
        String main1 = sh.getString("start", "");



        if(main.equals("done")){
            Intent i=new Intent(SplashActivity.this,
                    MainActivity.class);

            i.setPackage(null);
            //Intent is used to switch from one activity to another.

            startActivity(i);
            //invoke the SecondActivity.

            finish();

        }
        else{

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(main1.equals("done")){
                        Intent i=new Intent(SplashActivity.this,
                                MainActivity.class);

                        i.setPackage(null);
                        //Intent is used to switch from one activity to another.

                        startActivity(i);
                        //invoke the SecondActivity.

                        finish();

                    }
                    else {
                        Intent i=new Intent(SplashActivity.this,
                                HomeActivity.class);
                        //Intent is used to switch from one activity to another.

                        startActivity(i);
                        //invoke the SecondActivity.

                        finish();
                        //the current activity will get finished.

                    }


                }
            }, 5000);



        }











    }

}