package com.example.niraj.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Songs> songList = new ArrayList<>();
        songList.add(new Songs("Love Yourself: Tear","BTS"));
        songList.add(new Songs("beerbongs & bentleys","Post Malone"));
        songList.add(new Songs("Harder Than Ever","Lil Baby"));
        songList.add(new Songs("KOD","J. Cole"));
        songList.add(new Songs("reputation","Taylor Swift"));
        songList.add(new Songs("÷ (Divide)","Ed Sheeran"));
        songList.add(new Songs("Deadpool 2","Soundtrack"));
        songList.add(new Songs("The World Is Yours","Rich The Kid"));
        songList.add(new Songs("13 Reasons Why, Season 2","Soundtrack"));
        songList.add(new Songs("Simi","BlocBoy JB"));

        SongAdapter adapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AlbumActivity.this ,PlayingActivity.class);
                i.putExtra("song", songList.get(position).getFirstItem());
                i.putExtra("other", songList.get(position).getSecondItem());
                startActivity(i);
            }
        });
    }
}
