package com.example.cricket_team_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    public static final String DETAIL_CHOICE = "chosen Detailed object-Food in this case";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();

        ArrayList<CricketPlayer> dataToDisplay = intent.getParcelableArrayListExtra(MainActivity.ARRAYLIST_VALUES);

        ArrayAdapter<CricketPlayer> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, dataToDisplay);

        CricketAdapter cricketAdapter = new CricketAdapter(this, dataToDisplay);

        ListView listView = (ListView) findViewById(R.id.categoryOptions);

        listView.setAdapter(cricketAdapter);

    }
}
