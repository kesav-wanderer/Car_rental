package com.example.kedu.car_rental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText et1,et2;
    TextView tv;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        et1=(EditText)findViewById(R.id.email);
        et2=(EditText)findViewById(R.id.pwd);
        tv=(TextView)findViewById(R.id.textView6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("admin") &&
                        et2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "welcome Admin", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),adminhome.class);
                    startActivity(i);
                }
                else if(et1.getText().toString().equals("user") &&
                        et2.getText().toString().equals("user")) {
                    Toast.makeText(getApplicationContext(), "welcome user", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),userhome.class);
                    startActivity(i);

                }
                else if(et1.getText().toString().equals("manager") &&
                        et2.getText().toString().equals("manager")) {
                    Toast.makeText(getApplicationContext(), "welcome Manager", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), managerhome.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials, Pls try again!!", Toast.LENGTH_SHORT).show();


                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), register.class);
                startActivity(i);
            }
        });
    }
}
