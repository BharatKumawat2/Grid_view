package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
  GridView gridView;

int icons[]={
        R.drawable.image,
        R.drawable.image2
};
 String name[]={"andrd","android"};

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridView Demo");

        gridView=(GridView)findViewById(R.id.grid);

        adapter obj=new adapter(this,name,icons);
        gridView.setAdapter(obj);
    }
}