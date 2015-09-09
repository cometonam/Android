package com.example.hoang.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Nam Hoang on 9/5/2015.
 */
public class ListMenu extends ListActivity {
    String classes[] ={"startingPoint","example1","example2","example3","example4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(ListMenu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent startingPoint= new Intent(ListMenu.this, StartingPoint.class);
        startActivity(startingPoint );
    }
}
