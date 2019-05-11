package com.kener.dell.filmbilgi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirthMainActivity extends AppCompatActivity {

   /* int[] images={R.drawable.babamveoglum,R.drawable.dedemininsanlari,R.drawable.issizadam,R.drawable.unutursam};
    String[] Names={"Babam ve Oğlum","Dedemin İnsanları","Issız Adam","Unutursam Fısılda"};*/

   ImageView imgv;
   TextView txtyil,txtimdb,txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirth_main);

        String name=getIntent().getExtras().getString("name");
        TextView textView=(TextView)findViewById(R.id.txtname);
        textView.setText(name);

        String year=getIntent().getExtras().getString("year");
        TextView textView1=(TextView) findViewById(R.id.txtyil);
        textView1.setText(year);

        String imdb=getIntent().getExtras().getString("imdb");
        TextView textView2=(TextView) findViewById(R.id.txtimdb);
        textView2.setText(imdb);

        Integer images=getIntent().getExtras().getInt("images");
        ImageView imgv=(ImageView) findViewById(R.id.imgv);
        imgv.setImageResource(images);


    }

}
