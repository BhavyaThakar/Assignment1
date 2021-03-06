package com.example.assignment1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Screen3 extends AppCompatActivity {

    TextView bottom_right, bottom_left, top_right, top_left;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.screen_3);
    }

    public void top(View view) {
        bottom_left.setVisibility(View.INVISIBLE);
        bottom_right.setVisibility(View.INVISIBLE);
        top_left.setVisibility(View.VISIBLE);
        top_right.setVisibility(View.VISIBLE);




    }

    public  void center(View view){
        top_left.setVisibility(View.VISIBLE);
        top_right.setVisibility(View.VISIBLE);
        bottom_left.setVisibility(View.VISIBLE);
        bottom_right.setVisibility(View.VISIBLE);
    }

    public void bottom(View view){
        bottom_left.setVisibility(View.VISIBLE);
        bottom_right.setVisibility(View.VISIBLE);
        top_left.setVisibility(View.INVISIBLE);
        top_right.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_3);

        bottom_left = findViewById(R.id.bl2);
        bottom_right = findViewById(R.id.br2);
        top_left = findViewById(R.id.tl1);
        top_right = findViewById(R.id.tr1);



    }

}
