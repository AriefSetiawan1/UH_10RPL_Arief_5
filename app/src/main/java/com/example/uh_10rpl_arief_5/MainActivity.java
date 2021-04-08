package com.example.uh_10rpl_arief_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[] ;
    int images[] = {R.drawable.c,R.drawable.script,R.drawable.ruby,R.drawable.phyton,R.drawable.kotlin,R.drawable.sharp,R.drawable.java} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.progamming_languages) ;
        s2 = getResources().getStringArray(R.array.description) ;

        Adapter adapter = new Adapter(this, s1,s2,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
    }
}