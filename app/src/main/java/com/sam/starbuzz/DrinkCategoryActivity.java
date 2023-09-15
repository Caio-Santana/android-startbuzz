package com.sam.starbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);

        ListView drinkListView = findViewById(R.id.list_drinks);

        drinkListView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listView, itemView, position, id) -> {
            Intent intent = new Intent(this, DrinkActivity.class);
            intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
            startActivity(intent);

        };

        drinkListView.setOnItemClickListener(itemClickListener);
    }
}
