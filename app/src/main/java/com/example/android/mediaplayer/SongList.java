package com.example.android.mediaplayer;

public class SongList {
    /*Song title*/
    private String mSongTitle;
    /*Artist name*/
    private String mArtistName;
    //play button icon
    private int mPlayButton;

    public SongList(String songTitle, String artistName, int playButton) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mPlayButton = playButton;
    }

    //gets the title of a song
    public String getsongTitle() {
        return mSongTitle;
    }

    //gets the name of the artist
    public String getArtistName() {
        return mArtistName;
    }

    public int getplayButton(){
        return mPlayButton;
    }

}
