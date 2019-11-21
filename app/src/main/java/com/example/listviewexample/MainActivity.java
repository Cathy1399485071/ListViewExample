package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    String name, main_sport;
    int age;
    double worth;
    MyAdapter myArrayAdapter;
    ImageView a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
        ListView listView = (ListView) findViewById(R.id.listview1);
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        myArrayAdapter= new MyAdapter(getApplicationContext(), R.id.listview1, getPlayers());
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArrayAdapter);
        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                String url=myArrayAdapter.getItem(position).getUrl();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    public ArrayList<Player> getPlayers(){


        ArrayList<Player> player = new ArrayList<Player>();

        player.add(new Player("Aron Baynes", 33, 7, "NBA Basketball", "https://www.foxsports.com/nba/aron-baynes-player-stats",R.drawable.aron));
        player.add(new Player("Reggie Bullock",28, 0,"NBA Basketball", "https://www.foxsports.com/nba/reggie-bullock-player-stats",R.drawable.reggie));
        player.add(new Player("Robert Covington",29, 6, "NBA Basketball", "https://www.foxsports.com/nba/robert-covington-player-stats",R.drawable.robert));
        player.add(new Player("Derrick Favors",28,9, "NBA Basketball", "https://www.foxsports.com/nba/derrick-favors-player-stats",R.drawable.derrick));
        player.add(new Player("Patty Mills", 31, 10, "NBA Basketball", "https://www.foxsports.com/nba/patty-mills-player-stats",R.drawable.patty));
        //player.add(new Player(""))

        return player;
    }
    // choose successful sportsmen from different sports, make sure to fill Player class before starting

}
