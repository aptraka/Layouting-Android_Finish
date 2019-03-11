package com.example.muzayyinul.layouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btRelative, btConstraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRelative=findViewById(R.id.btnRelative);
        btConstraint=findViewById(R.id.btnConstraint);

        btRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(pindah);
            }
        });

        btConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keConstraint =new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(keConstraint);
            }
        });
    }
}
