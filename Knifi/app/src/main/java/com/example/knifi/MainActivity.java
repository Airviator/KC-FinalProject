package com.example.knifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    ImageView Home;
    ImageView sharpguide;
    ImageView contact;
    ImageView store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Home = findViewById(R.id.Home);
        sharpguide = findViewById(R.id.sharpguide);
        contact = findViewById(R.id.contact);
        store = findViewById(R.id.store);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                finish();

            }
        });

        sharpguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i);
                finish();

            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(i);
                finish();

            }
        });

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent = new Intent(Intent.ACTION_VIEW);
                browserintent.setData(Uri.parse("https://www.chefknivestogo.com/"));
                startActivity(browserintent);
            }
        });

    }
}