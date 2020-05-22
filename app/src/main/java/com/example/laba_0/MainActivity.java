package com.example.laba_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b;
    TextView t;
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.text);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(this);
        t.setText("Да");
    }

    @Override
    public void onClick(View v) {
        a = a + 1;
        if (a%2 == 0)
        {
            t.setText("Да");
        }
        else
            {
            t.setText("Нет");
        }
    }
}
