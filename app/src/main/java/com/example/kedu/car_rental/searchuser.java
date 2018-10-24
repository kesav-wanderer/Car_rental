package com.example.kedu.car_rental;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by saike on 23-10-2018.
 */

public class searchuser extends Activity implements AdapterView.OnItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        EditText e1;
        Button b1;
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.searchuser);
        e1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.search);

        //* *EDIT* *
        final ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listview.setVisibility(View.VISIBLE);

            }
        });

        listview.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView <?> adapter, View view, int position, long arg) {
        if (position >= 0) {
            Intent appInfo = new Intent(searchuser.this, specificuser.class);
            startActivity(appInfo);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            Toast.makeText(getApplicationContext(), "Logged out", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

