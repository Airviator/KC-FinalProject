package com.example.knifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    Button Back;
    Button Book;
    EditText Name;
    EditText Number;
    EditText Date;
    EditText Time;
    EditText Address;
    String string;
    String string1;
    String string2;
    String string3;
    String string4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        Back = findViewById(R.id.Back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        Book = findViewById(R.id.Book);


        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameinfo = Name.getText().toString();

                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                string = Name.getText().toString();
                string1 = Number.getText().toString();
                string2 = Date.getText().toString();
                string3 = Time.getText().toString();
                string4 = Address.getText().toString();
                i.putExtra("NameInfo" , string );
                i.putExtra("NumberInfo" , string1 );
                i.putExtra("DateInfo" , string2 );
                i.putExtra("TimeInfo" , string3 );
                i.putExtra("AddressInfo" , string4 );
                startActivity(i);
                finish();



            }
        });

        Name = findViewById(R.id.Name);
        Number = findViewById(R.id.Number);
        Date = findViewById(R.id.Date);
        Time = findViewById(R.id.Time);
        Address = findViewById(R.id.Address);
        Book = findViewById(R.id.Book);

        Name.addTextChangedListener(loginTextWatcher);
        Number.addTextChangedListener(loginTextWatcher);
        Date.addTextChangedListener(loginTextWatcher);
        Time.addTextChangedListener(loginTextWatcher);
        Address.addTextChangedListener(loginTextWatcher);

    }

    public TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String NameInput = Name.getText().toString().trim();
            String NumberInput = Number.getText().toString().trim();
            String DateInput = Date.getText().toString().trim();
            String TimeInput = Time.getText().toString().trim();
            String AddressInput = Address.getText().toString().trim();

            Book.setEnabled(!NameInput.isEmpty() && !NumberInput.isEmpty() && !DateInput.isEmpty() && !TimeInput.isEmpty() && !AddressInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}