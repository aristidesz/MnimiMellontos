package com.example.aristidesz.mnimimellontos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread() {
            public void run() {
                try {


                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent(Splash.this,MainScreen.class);
                    startActivity(openStartingPoint);
                }
            }
        };
    timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
