package com.example.user.first_aid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fever = findViewById(R.id.feverId);
        Button burns = findViewById(R.id.burnsId);
        Button splinters = findViewById(R.id.splintersId);
        Button sprains = findViewById(R.id.sprainsId);
        Button nosebleeds = findViewById(R.id.nosebleedsId);
        Button cuts = findViewById(R.id.cutsId);
        Button bites = findViewById(R.id.bitesId);
        Button poison = findViewById(R.id.foodPoisonId);
        Button stroke = findViewById(R.id.strokeId);
        Button kit = findViewById(R.id.firstAidKitId);
        FloatingActionButton sos = findViewById(R.id.sosbutton);
        FloatingActionButton map = findViewById(R.id.mapbutton);
        fever.setOnClickListener(this);
        burns.setOnClickListener(this);
        splinters.setOnClickListener(this);
        sprains.setOnClickListener(this);
        nosebleeds.setOnClickListener(this);
        cuts.setOnClickListener(this);
        bites.setOnClickListener(this);
        poison.setOnClickListener(this);
        stroke.setOnClickListener(this);
        kit.setOnClickListener(this);
        sos.setOnClickListener(this);
        map.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent;
        if (v.getId() == R.id.feverId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Fever");
            startActivity(intent);

        }
        if (v.getId() == R.id.burnsId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Burns");
            startActivity(intent);

        }
        if (v.getId() == R.id.splintersId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Splinters");
            startActivity(intent);

        }
        if (v.getId() == R.id.sprainsId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Sprains");
            startActivity(intent);

        }
        if (v.getId() == R.id.nosebleedsId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Nosebleeds");
            startActivity(intent);

        }
        if (v.getId() == R.id.cutsId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Cuts");
            startActivity(intent);

        }
        if (v.getId() == R.id.bitesId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Bites");
            startActivity(intent);

        }
        if (v.getId() == R.id.foodPoisonId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Poisoning");
            startActivity(intent);

        }
        if (v.getId() == R.id.strokeId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "Stroke");
            startActivity(intent);

        }
        if (v.getId() == R.id.firstAidKitId) {

            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name", "First");
            startActivity(intent);

        }
        if (v.getId() == R.id.sosbutton) {

            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:108"));
            startActivity(intent);

        }
        if (v.getId() == R.id.mapbutton) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=hospital");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }


    }


}

