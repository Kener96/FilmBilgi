package com.kener.dell.filmbilgi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 =(TextView) findViewById(R.id.textView);



        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gecisYap = new Intent(MainActivity.this, SecondMainActivity.class);
                startActivity(gecisYap);

            }
        });


    }
}
