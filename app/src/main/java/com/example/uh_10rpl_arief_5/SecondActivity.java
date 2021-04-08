package com.example.uh_10rpl_arief_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView mainImageView;
    TextView title, description;

    String data1, data2;
    int myimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.MainImageView);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("myimage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myimage = getIntent().getIntExtra("myimage", 1);

        }else {
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData() {
        title.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myimage);
    }
}