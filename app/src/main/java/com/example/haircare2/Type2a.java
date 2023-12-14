package com.example.haircare2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Type2a extends AppCompatActivity {
    Integer[] Images2A = {R.drawable.type2a_1, R.drawable.type2a_2, R.drawable.type2a_3};
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2a);
        final ImageView pic = findViewById(R.id.ivLarge2A);
        GridView grid2A = findViewById(R.id.gvType2A);
        grid2A.setAdapter(new ImageAdapter(this));
        grid2A.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected Image " + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Images2A[position]);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter (Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Images2A.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Images2A[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(350, 350));
            return pic;
        }
    }
}