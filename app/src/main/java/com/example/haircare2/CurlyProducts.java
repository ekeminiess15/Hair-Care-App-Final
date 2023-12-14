package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CurlyProducts extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curly_products);
        String[] products = new String[]{"Shampoo: Carol’s Daughter Wash Day Delight Micellar Shampoo",
                "Conditioner: Shea Moisture Coconut and Hibiscus Curl and Shine Conditioner", "Deep Conditioner: Mielle Organics Babassu Oil and Mint Deep Conditioner",
                "Leave-in Conditioner: tgin Honey Miracle Hair Mask", "Styler: Miss Jessie’s Pillow Soft Curls"};
        listView = findViewById(R.id.lvCurlyProducts);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, products);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.carolsdaughter.com/wash-day-delight-sulfate-free-shampoo-for-curly-hair/820645006966.html")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sheamoisture.com/coconut-and-hibiscus-curl-and-shine-conditioner/764302290629/")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mielleorganics.com/products/babassu-oil-and-mint-deep-conditioning-protein-moisture-replenisher")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tginatural.com/product/honey-miracle-deep-conditioner-for-natural-hair-12oz/")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://missjessies.com/products/jelly-soft-curls")));
                        break;
                }
            }
        });
    }
}