package com.example.kedu.car_rental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.KeyListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by saike on 23-10-2018.
 */

public class specificuser extends AppCompatActivity {
    EditText fn, ln, mm, dd, yy, phno, email, address, city, st, zip, uname, pwd, dl, id, aaa, utype;
    Button b1,b2,b3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificuser);
        fn = (EditText) findViewById(R.id.fn);
        ln = (EditText) findViewById(R.id.ln);
        mm = (EditText) findViewById(R.id.month);
        dd = (EditText) findViewById(R.id.date);
        yy = (EditText) findViewById(R.id.year);
        phno = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        city = (EditText) findViewById(R.id.city);
        st = (EditText) findViewById(R.id.state);
        zip = (EditText) findViewById(R.id.zipcode);
        uname = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        dl = (EditText) findViewById(R.id.dl);
        id = (EditText) findViewById(R.id.utaid);
        aaa = (EditText) findViewById(R.id.aaa);
        utype = (EditText) findViewById(R.id.utype);
        b1 = (Button) findViewById(R.id.editbutton);
        b2 = (Button) findViewById(R.id.savebutton);
        b3 = (Button) findViewById(R.id.deletebutton);
        fn.setEnabled(false);
        ln.setEnabled(false);
        mm.setEnabled(false);
        dd.setEnabled(false);
        yy.setEnabled(false);
        phno.setEnabled(false);
        email.setEnabled(false);
        address.setEnabled(false);
        city.setEnabled(false);
        st.setEnabled(false);zip.setEnabled(false);

        uname.setEnabled(false);
        pwd.setEnabled(false);
        dl.setEnabled(false);
        id.setEnabled(false);
        utype.setEnabled(false);aaa.setEnabled(false);


        b2.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setVisibility(View.VISIBLE);
                fn.setEnabled(true);
                ln.setEnabled(true);
                mm.setEnabled(true);
                dd.setEnabled(true);
                yy.setEnabled(true);
                phno.setEnabled(true);
                email.setEnabled(true);
                address.setEnabled(true);
                city.setEnabled(true);
                st.setEnabled(true);zip.setEnabled(true);

                uname.setEnabled(true);
                pwd.setEnabled(true);
                dl.setEnabled(true);
                id.setEnabled(true);
                utype.setEnabled(true);aaa.setEnabled(true);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Deleted successfully", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), adminhome.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public boolean validate(EditText[] fields) {
                for (int i = 0; i < fields.length; i++) {
                    EditText currentField = fields[i];
                    if (currentField.getText().toString().length() <= 0) {
                        return false;
                    }
                }
                return true;
            }

            public void onClick(View v) {
                boolean fieldsOK = validate(new EditText[]{fn, ln, mm, dd, yy, phno, email, address, city, st, zip, uname, pwd, dl, id, aaa, utype});
                if (fieldsOK) {
                    Toast.makeText(getApplicationContext(), "Data Updated", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), adminhome.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "fill all fields", Toast.LENGTH_SHORT).show();
                }
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
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
