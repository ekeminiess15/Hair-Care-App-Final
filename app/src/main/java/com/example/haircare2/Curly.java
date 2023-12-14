package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Curly extends AppCompatActivity {
    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curly);
        Button tips = (Button)findViewById(R.id.btTipsCurly);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Curly.this, CurlyTips.class));
            }
        });
        Button styles = (Button)findViewById(R.id.btStylesCurly);
        styles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Curly.this, CurlyStyles.class));
            }
        });
        Button products = (Button)findViewById(R.id.btProductsCurly);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Curly.this, CurlyProducts.class));
            }
        });
        final Spinner curlyGroup = (Spinner)findViewById(R.id.tvCurlyGroup);
        Button go = (Button)findViewById(R.id.btGoCurly);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = curlyGroup.getSelectedItem().toString();
                if(selected.equals("3A Hair")){
                    startActivity(new Intent(Curly.this, Type3a.class));
                } else if (selected.equals("3B Hair")){
                    startActivity(new Intent(Curly.this, Type3b.class));
                } else if (selected.equals("3C Hair")){
                    startActivity(new Intent(Curly.this, Type3c.class));
                }
            }
        });
    }
}