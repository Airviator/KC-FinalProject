package com.example.knifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView NamePreview;
    TextView NumberPreview;
    TextView DatePreview;
    TextView TimePreview;
    TextView AddressPreview;
    String string;
    String string1;
    String string2;
    String string3;
    String string4;
    Button mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);

        NamePreview = findViewById(R.id.NamePreview);
        NumberPreview = findViewById(R.id.NumberPreview);
        DatePreview = findViewById(R.id.DatePreview);
        TimePreview = findViewById(R.id.TimePreview);
        AddressPreview = findViewById(R.id.AddressPreview);

        string = getIntent().getExtras().getString("NameInfo");
        string1 = getIntent().getExtras().getString("NumberInfo");
        string2 = getIntent().getExtras().getString("DateInfo");
        string3 = getIntent().getExtras().getString("TimeInfo");
        string4 = getIntent().getExtras().getString("AddressInfo");

        NamePreview.setText(string);
        NumberPreview.setText(string1);
        DatePreview.setText(string2);
        TimePreview.setText(string3);
        AddressPreview.setText(string4);

        mainmenu = findViewById(R.id.mainmenu);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
}