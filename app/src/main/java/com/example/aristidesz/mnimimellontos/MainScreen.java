package com.example.aristidesz.mnimimellontos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by AristidesZ on 13/12/2014.
 */
public class MainScreen extends Activity {

    private Button buttonMap, buttonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainScreen.this, ListVillages.class);
                startActivity(i);
            }
        });

    }

    private void setButtons() {
        buttonMap = (Button) findViewById(R.id.btMainMap);
        buttonList = (Button) findViewById(R.id.btMainList);
    }
}
