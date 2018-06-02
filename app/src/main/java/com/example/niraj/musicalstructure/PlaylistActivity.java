package com.example.niraj.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Songs> songList = new ArrayList<>();
        songList.add(new Songs("Happy", "Selena Gomez"));
        songList.add(new Songs("Party","Cardi B"));
        songList.add(new Songs("Mad Dance","Maroon 5"));
        songList.add(new Songs("Fun","Calvin Harris feat. Frank Ocean & Migos"));
        songList.add(new Songs("Playlist 1","Luis Fonsi & Daddy Yankee feat. Justin Bieber"));
        songList.add(new Songs("Awesome","Harry Styles"));

        SongAdapter adapter = new SongAdapter(this, songList);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PlaylistActivity.this ,PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });
    }
}