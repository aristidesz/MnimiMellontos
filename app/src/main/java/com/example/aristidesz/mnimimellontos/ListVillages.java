package com.example.aristidesz.mnimimellontos;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AristidesZ on 13/12/2014.
 */
public class ListVillages extends ListActivity {

    String villages[] = {"Κερύνεια","Αμμόχωστος"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(ListVillages.this,android.R.layout.simple_expandable_list_item_1,villages));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String pos = villages[position];
        try {
            Class ourClass = Class.forName("com.example.aristidesz.draft." + pos);
            Intent i = new Intent(ListVillages.this, ourClass);
            startActivity(i);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}
