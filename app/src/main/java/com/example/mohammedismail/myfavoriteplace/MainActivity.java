package com.example.mohammedismail.myfavoriteplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsaintmartin,btniiuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsaintmartin=(Button)findViewById(R.id.saintmartin);
        btniiuc=(Button)findViewById(R.id.iiuc);
        btnsaintmartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlaceDetailActivity.class);
                intent.putExtra("placename","Saintmartin");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Saintmartin", Toast.LENGTH_SHORT).show();
            }
        });
        btniiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlaceDetailActivity.class);
                intent.putExtra("placename","IIUC");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "IIUC", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
