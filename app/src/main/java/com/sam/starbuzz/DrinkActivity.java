package com.sam.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

     public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent intent = getIntent();
        int drinkId = intent.getIntExtra(EXTRA_DRINKID,0);

        Drink drink = Drink.drinks[drinkId];

        ImageView photoImageView = findViewById(R.id.photo);
        TextView nameTextView = findViewById(R.id.name);
        TextView descriptionTextView = findViewById(R.id.description);

        photoImageView.setImageResource(drink.getImageResourceId());
        photoImageView.setContentDescription(drink.getName());
        nameTextView.setText(drink.getName());
        descriptionTextView.setText(drink.getDescription());
    }
}