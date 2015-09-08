package com.example.hoang.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AppMenu extends ListActivity {
    String classes[] ={"startingPoint","example1","example2","example3","example4","example5","example6"};
    private List<String> listValues;
    TextView selection;
    String[] items = { "this", "is", "a", "really","silly", "list" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_menu);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,items));
        selection=(TextView)findViewById(R.id.selection);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
//        String cheese = classes[position];
//        try
//        {
//            Class ourClass = Class.forName("com.example.hoang.thenewboston" + cheese);
//            Intent ourIntent = new Intent(AppMenu.this,ourClass);
//            startActivity(ourIntent);
//        }
//        catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }

    }
}
