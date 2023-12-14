package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Coily extends AppCompatActivity {
    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coily);
        Button tips = (Button)findViewById(R.id.btTipsCoily);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Coily.this, CoilyTips.class));
            }
        });
        Button styles = (Button)findViewById(R.id.btStylesCoily);
        styles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Coily.this, CoilyStyles.class));
            }
        });
        Button products = (Button)findViewById(R.id.btProductsCoily);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Coily.this, CoilyProducts.class));
            }
        });
        final Spinner coilyGroup = (Spinner)findViewById(R.id.tvCoilyGroup);
        Button go = (Button)findViewById(R.id.btGoCoily);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = coilyGroup.getSelectedItem().toString();
                if(selected.equals("4A Hair")){
                    startActivity(new Intent(Coily.this, Type4a.class));
                } else if (selected.equals("4B Hair")){
                    startActivity(new Intent(Coily.this, Type4b.class));
                } else if (selected.equals("4C Hair")){
                    startActivity(new Intent(Coily.this, Type4c.class));
                }
            }
        });
    }
}