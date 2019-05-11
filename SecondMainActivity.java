package com.kener.dell.filmbilgi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ListAdapter;

public class SecondMainActivity extends AppCompatActivity {
//single row structure i.e image,text,description
//create datasource text,image,description
//create custom adapter

    ListView listv;

    int[] images={R.drawable.babamveoglum,R.drawable.dedemininsanlari,R.drawable.issizadam,R.drawable.unutursam};
    String[] Names={"Babam ve Oğlum","Dedemin İnsanları","Issız Adam","Unutursam Fısılda"};
    String[] sene={"2005","2011","2008","2014"};
    String[] imdb={"8,4","8,0","6,8","7,5" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        listv= (ListView) findViewById(R.id.listview);
        final CustomAdaptor customAdaptor=new CustomAdaptor(images,Names);
        listv.setAdapter(customAdaptor);

        //*******************************************

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent gecisYap2 = new Intent(SecondMainActivity.this, ThirthMainActivity.class);
                gecisYap2.putExtra("name",Names[i]);
                gecisYap2.putExtra("year",sene[i]);
                gecisYap2.putExtra("imdb",imdb[i]);
                gecisYap2.putExtra("images",images[i]);
                startActivity(gecisYap2);

            }
        });

        //*********************************************


    }


    class CustomAdaptor extends BaseAdapter{
        String []names;
        int []images;
        public CustomAdaptor(int [] images,String [] names)
        {
            this.images=images;
            this.names=names;
        }
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view =getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView mImageView  =(ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView3);
            mImageView.setImageResource(this.images[position]);
            mTextView.setText(names[position]);
            return view;
        }


    }




}
