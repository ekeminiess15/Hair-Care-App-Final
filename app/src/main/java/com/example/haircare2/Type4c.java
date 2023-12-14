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

public class Type4c extends AppCompatActivity {
    Integer[] Images4C = {R.drawable.type4c_1, R.drawable.type4c_2, R.drawable.type4c_3};
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type4c);
        final ImageView pic = findViewById(R.id.ivLarge4C);
        GridView grid4C = findViewById(R.id.gvType4C);
        grid4C.setAdapter(new ImageAdapter(this));
        grid4C.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected Image " + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Images4C[position]);
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
            return Images4C.length;
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
            pic.setImageResource(Images4C[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(350, 350));
            return pic;
        }
    }
}