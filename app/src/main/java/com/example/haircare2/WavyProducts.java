package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WavyProducts extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wavy_products);
        String[] products = new String[]{"Shampoo: Shea Moisture Manuka Honey and Yogurt Hydrate and Repair Shampoo",
                "Conditioner: Carol’s Daughter Hair Milk Cleansing Conditioner", "Deep Conditioner: Mielle Organics Babassu Oil and Mint Deep Conditioner",
                "Leave-in Conditioner: As I Am Leave-In Conditioner", "Styler: Mielle Organics Rosemary Mint Daily Styling Crème"};
        listView = findViewById(R.id.lvWavyProducts);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, products);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sheamoisture.com/manuka-honey-and-yogurt-hydrate-and-repair-shampoo/764302231530/")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.carolsdaughter.com/hair-milk-cleansing-conditioner/820645226104.html")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mielleorganics.com/products/babassu-oil-and-mint-deep-conditioning-protein-moisture-replenisher")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://asiamnaturally.com/products/leave-in-conditioner")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/MIELLE-Mielle-rosemary-multi-vitamin-styling/dp/B07Q8883Q4")));
                        break;
                }
            }
        });
    }
}