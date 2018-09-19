package com.example.android.mediaplayer;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<SongList> songs = new ArrayList<>();
        songs.add(new SongList("Foreign", "Great",R.drawable.ic_play_arrow));
        songs.add(new SongList("Like It", "Cardi B",R.drawable.ic_play_arrow));
        songs.add(new SongList("In My Feelings", "Drake",R.drawable.ic_play_arrow));
        songs.add(new SongList("Nonstop", "Drake",R.drawable.ic_play_arrow));
        songs.add(new SongList("Bodak Yellow", "Cardi B",R.drawable.ic_play_arrow));
        songs.add(new SongList("I Feel It Coming", "The Weekend",R.drawable.ic_play_arrow));
        songs.add(new SongList("Nice For What", "Drake",R.drawable.ic_play_arrow));
        songs.add(new SongList("Hurricane", "Luke Combs",R.drawable.ic_play_arrow));
        songs.add(new SongList("One Number Away", "Luke Combs",R.drawable.ic_play_arrow));
        songs.add(new SongList("Big Green Tractor", "Jason Aldean",R.drawable.ic_play_arrow));
        songs.add(new SongList("God's Plan", "Drake",R.drawable.ic_play_arrow));

        SongListAdapter adapter = new SongListAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(context,"Playback not yet implemented!", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
