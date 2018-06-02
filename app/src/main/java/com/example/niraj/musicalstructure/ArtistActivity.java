package com.example.niraj.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list);
        final ArrayList<Songs> songList = new ArrayList<>();
        songList.add(new Songs("Selena Gomez","Bad Liar"));
        songList.add(new Songs("Cardi B","Bodak Yellow"));
        songList.add(new Songs("Maroon 5","Wait"));
        songList.add(new Songs("Calvin Harris","Frank Ocean & Migos"));
        songList.add(new Songs("Daddy Yankee","Despacito"));
        songList.add(new Songs("Harry Styles","Sign of the Times"));
        songList.add(new Songs("The Weeknd"," feat. Daft Punk"));
        songList.add(new Songs("Portugal","Feel It Still"));

        SongAdapter adapter = new SongAdapter(this, songList);
        GridView listView = findViewById(R.id.gridview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ArtistActivity.this ,PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });
    }
}
