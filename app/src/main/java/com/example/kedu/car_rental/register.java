package com.example.kedu.car_rental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by saike on 22-10-2018.
 */

public class register extends AppCompatActivity {
    EditText fn, ln, mm, dd, yy, phno, email, address, city, st, zip, uname, pwd, dl, id, aaa, utype;
    Button b;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
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
        b = (Button) findViewById(R.id.editbutton);
        b.setOnClickListener(new View.OnClickListener() {

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
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "fill all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}

