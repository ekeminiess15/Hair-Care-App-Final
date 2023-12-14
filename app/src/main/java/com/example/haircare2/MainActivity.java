package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpSong;
    int playing;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this, R.raw.dont_touch);
        playing = 0;
        button1 = (Button)findViewById(R.id.btPlay);
        button1.setOnClickListener(Play);
        ImageView wavy = findViewById(R.id.ivWavy);
        wavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Wavy.class));
            }
        });
        ImageView curly = findViewById(R.id.ivCurly);
        curly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Curly.class));
            }
        });
        ImageView coily = findViewById(R.id.ivCoily);
        coily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Coily.class));
            }
        });
    }
    Button.OnClickListener Play = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpSong.start();
                    playing = 1;
                    button1.setText("Pause Song");
                    break;
                case 1:
                    mpSong.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    break;
            }
        }
    };
}