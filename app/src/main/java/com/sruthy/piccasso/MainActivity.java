package com.sruthy.piccasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
public class MainActivity extends AppCompatActivity {
ImageView im;
Button bt;//werty
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=findViewById(R.id.imageView);
        bt=findViewById(R.id.button);
       // Picasso.get().load("https://images.pexels.com/photos/257360/pexels-photo-257360.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(im);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setVisibility(View.VISIBLE);
            Picasso.get().load("https://images.pexels.com/photos/257360/pexels-photo-257360.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(im);
            }
        });
    }
}
