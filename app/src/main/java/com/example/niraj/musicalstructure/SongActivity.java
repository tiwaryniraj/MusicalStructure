package com.example.niraj.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Songs> songList = new ArrayList<>();
        songList.add(new Songs("Bad Liar", "Selena Gomez"));
        songList.add(new Songs("Bodak Yellow","Cardi B"));
        songList.add(new Songs("Wait","Maroon 5"));
        songList.add(new Songs("Slide","Calvin Harris feat. Frank Ocean & Migos"));
        songList.add(new Songs("Despacito","Luis Fonsi & Daddy Yankee feat. Justin Bieber"));
        songList.add(new Songs("Sign of the Times","Harry Styles"));
        songList.add(new Songs("I Feel It Coming","The Weeknd feat. Daft Punk"));
        songList.add(new Songs("Feel It Still","Portugal. The Man"));

        SongAdapter adapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(SongActivity.this ,PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });
    }
}
