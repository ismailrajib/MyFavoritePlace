package com.example.mohammedismail.myfavoriteplace;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaceDetailActivity extends AppCompatActivity {
    TextView txtplace, txtdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        txtplace = (TextView) findViewById(R.id.txtplace);
        txtdetail = (TextView) findViewById(R.id.txtdetail);

        String getPlaceName = getIntent().getExtras().getString("placename");
        if (getPlaceName.equals("Saintmartin")) {
            txtplace.setText("Saintmartin");
            txtdetail.setText("ভাই আর যাই বল সেন্টমার্টিনে ডাবের দাম নাকি বেশি");
        }
        if (getPlaceName.equals("IIUC")) {
        txtplace.setText("IIUC");
            txtdetail.setText("আমাদের দাবি মানতে হবে অনিক ভাইকে দিয়ে আইয়াইইউসিতে পড়াতে হবে...");

        }
    }


        }
