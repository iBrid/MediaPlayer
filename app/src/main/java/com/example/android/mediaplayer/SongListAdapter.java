package com.example.android.mediaplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<SongList> {

    public SongListAdapter(Activity context, ArrayList<SongList> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }

        SongList currentSong = getItem(position);

        TextView songTitle = listItemView.findViewById(R.id.songtitle);
        songTitle.setText(currentSong.getsongTitle());

        TextView artistName = listItemView.findViewById((R.id.artistName));
        artistName.setText(currentSong.getArtistName());

        ImageView playButton = listItemView.findViewById(R.id.play_image);
        playButton.setImageResource(currentSong.getplayButton());

        return listItemView;
    }
}
