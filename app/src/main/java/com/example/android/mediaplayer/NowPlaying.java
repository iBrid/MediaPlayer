package com.example.android.mediaplayer;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    Context context = this;
    //Declare the variables
    private Button mPlay;
    private Button mPause;
    private ImageView playButton;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        playButton = findViewById(R.id.play_icon);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                Toast.makeText(context, "Playing Music", Toast.LENGTH_SHORT).show();
            }
        });

        //Link the variables to the respective buttons
        mPlay = findViewById(R.id.play);
        mPause = findViewById(R.id.pause);

        //Plays the music
        player = MediaPlayer.create(context, R.raw.feelings);

        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                Toast.makeText(context, "Playing Music", Toast.LENGTH_SHORT).show();
                mPlay.setEnabled(false);
                (mPlay).setTextColor(Color.parseColor("#8A9280"));
                mPause.setEnabled(true);
                mPause.setTextColor(Color.parseColor("#000000"));
            }
        });

        //pauses the music
        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                Toast.makeText(context, "Music Paused", Toast.LENGTH_SHORT).show();
                mPlay.setEnabled(true);
                mPlay.setTextColor(Color.parseColor("#000000"));
                mPause.setEnabled(false);
                (mPause).setTextColor(Color.parseColor("#8A9280"));
            }
        });

        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(context,"Playback completed!",Toast.LENGTH_SHORT).show();
                mPlay.setEnabled(true);
                (mPlay).setTextColor(Color.parseColor("#ffffff"));
                mPause.setEnabled(false);
                (mPause).setTextColor(Color.parseColor("#8A9280"));
            }
        });

    }
}
