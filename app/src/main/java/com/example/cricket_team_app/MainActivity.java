package com.example.cricket_team_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("RestrictedApi")
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent1 = new Intent(this, CricketPlayer.class);
                this.startActivity(intent1);
                return true;
            case R.id.team:
                Intent intent2 = new Intent(this, CatagoryActivity.class);
                this.startActivity(intent2);
                return true;
            case R.id.info:
                Intent intent3 = new Intent(this, DetailActivity.class);
                this.startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}