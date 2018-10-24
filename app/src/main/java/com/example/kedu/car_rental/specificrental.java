package com.example.kedu.car_rental;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by saike on 24-10-2018.
 */

public class specificrental extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6, e7, e8,e9,name;
    Button edit,save,cancel;

    // Context mContext;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificrental);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        e5 = (EditText) findViewById(R.id.e5);
        e6 = (EditText) findViewById(R.id.e6);
        e8 = (EditText) findViewById(R.id.e8);
        e7 = (EditText) findViewById(R.id.e7);
        e9 = (EditText) findViewById(R.id.e9);
        name = (EditText) findViewById(R.id.carname);
        edit = (Button) findViewById(R.id.b1);
        save = (Button) findViewById(R.id.b2);
        cancel = (Button) findViewById(R.id.b3);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);
        e4.setEnabled(false);
        e5.setEnabled(false);
        e6.setEnabled(false);
        e7.setEnabled(false);
        e8.setEnabled(false);
        e9.setEnabled(false);
        name.setEnabled(false);
        save.setVisibility(View.INVISIBLE);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save.setVisibility(View.VISIBLE);
                cancel.setVisibility(View.INVISIBLE);
                e1.setEnabled(true);
                name.setEnabled(true);
                e2.setEnabled(true);
                e9.setEnabled(true);
                e3.setEnabled(true);
                e4.setEnabled(true);
                e5.setEnabled(true);
                e6.setEnabled(true);
                e7.setEnabled(true);
                e8.setEnabled(true);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(), "Successfully edited the rental", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), searchrental.class);
                startActivity(i);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(specificrental.this);

                builder.setTitle("Confirmation");
                builder.setMessage("Do u want to delete this reservation?");


                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Deleted Successfully", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(),managerhome.class);
                        startActivity(i);


                        dialog.dismiss();
                    }

                });


                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Code that is executed when clicking NO

                        Intent i = new Intent(getApplicationContext(),specificrental.class);
                        startActivity(i);

                        dialog.dismiss();
                    }

                });


                AlertDialog alert = builder.create();
                alert.show();
            }
        });
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