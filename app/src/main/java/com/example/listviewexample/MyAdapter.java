package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Player> {
    Player player;
    List<Player> listOfPlayers;
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        listOfPlayers = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View single_item_view = convertView;
        //Using this inflated view, we can get the access to the various UI widgets present in the row item XML file.
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (single_item_view == null)
            single_item_view = inflater.inflate(R.layout.single_item, null);
        player=listOfPlayers.get(position);
        //Todo get single player using position and listOfPlayers
        TextView name = single_item_view.findViewById(R.id.name);
        name.setText(player.getName());
        TextView age = single_item_view.findViewById(R.id.age);
        age.setText(player.getAge()+"");
        TextView worth = single_item_view.findViewById(R.id.worth);
        worth.setText(player.getWorth()+"");
        TextView sport = single_item_view.findViewById(R.id.main_sport);
        sport.setText(player.getMain_sport());
        return  single_item_view;
    }
}
