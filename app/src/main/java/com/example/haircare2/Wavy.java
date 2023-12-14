package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Wavy extends AppCompatActivity {
    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wavy);
        Button tips = (Button)findViewById(R.id.btTipsWavy);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wavy.this, WavyTips.class));
            }
        });
        Button styles = (Button)findViewById(R.id.btStylesWavy);
        styles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wavy.this, WavyStyles.class));
            }
        });
        Button products = (Button)findViewById(R.id.btProductsWavy);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wavy.this, WavyProducts.class));
            }
        });
        final Spinner wavyGroup = (Spinner)findViewById(R.id.tvWavyGroup);
        Button go = (Button)findViewById(R.id.btGoWavy);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = wavyGroup.getSelectedItem().toString();
                if(selected.equals("2A Hair")){
                    startActivity(new Intent(Wavy.this, Type2a.class));
                } else if (selected.equals("2B Hair")){
                    startActivity(new Intent(Wavy.this, Type2b.class));
                } else if (selected.equals("2C Hair")){
                    startActivity(new Intent(Wavy.this, Type2c.class));
                }
            }
        });
    }
}