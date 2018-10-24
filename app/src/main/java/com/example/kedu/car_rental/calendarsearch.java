package com.example.kedu.car_rental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by saike on 24-10-2018.
 */

public class calendarsearch extends AppCompatActivity {
    TextView tv;
    ListView lv1,lv2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendarsearch);
        Date d = new Date(getIntent().getLongExtra("DATE",-1));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String selectedDate = sdf.format(new Date(d.getTime()));

        tv=(TextView)findViewById(R.id.date);
        tv.setText(selectedDate);
        final ListView lv1 = (ListView) findViewById(R.id.listView1);
        final ListView lv2 = (ListView) findViewById(R.id.listView2);

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
