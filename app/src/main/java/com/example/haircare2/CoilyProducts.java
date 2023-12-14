package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CoilyProducts extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coily_products);
        String[] products = new String[]{"Shampoo: As I Am Curl Clarity Shampoo",
                "Conditioner: OGX Nourishing + Coconut Milk Moisturizing Hair Conditioner", "Deep Conditioner: Shea Moisture Raw Shea Butter Deep Moisturizing Masque",
                "Leave-in Conditioner: Camille Rose Naturals Curl Love Moisture Milk", "Styler: Mielle Organics Pomegranate & Honey Curl Smoothie"};
        listView = findViewById(R.id.lvCoilyProducts);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, products);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://asiamnaturally.com/products/curl-clarity-shampoo")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/OGX-Conditioner-Nourishing-Coconut-Milk/dp/B000TG850M?source=ps-sl-shoppingads-lpcontext&ref_=fplfs&psc=1&smid=ATVPDKIKX0DER")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sheamoisture.com/raw-shea-butter-deep-moisturizing--masque--115-oz/764302280248/")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.camillerose.com/products/curl-love-moisture-milk")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mielleorganics.com/collections/pomegranate-honey/products/pomegranate-honey-curl-smoothie")));
                        break;
                }
            }
        });
    }
}