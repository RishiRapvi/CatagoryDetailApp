package com.example.cricket_team_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CricketAdapter extends ArrayAdapter<CricketPlayer> {
    public CricketAdapter(Context context, ArrayList<CricketPlayer> cricketPlayerArrayList){
        super(context,0,cricketPlayerArrayList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        CricketPlayer cricketPlayer = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_cricket_adapter, parent, false);
        }

        TextView tvName = (TextView)convertView.findViewById(R.id.nameTextView);
        TextView tvPosition = (TextView)convertView.findViewById(R.id.positionTextView);
        TextView tvDesc = (TextView)convertView.findViewById(R.id.infoTextView);

        tvName.setText(cricketPlayer.getName());
        tvPosition.setText(cricketPlayer.getPosition());
        tvDesc.setText(cricketPlayer.getDesc());

        return convertView;

    }


}


