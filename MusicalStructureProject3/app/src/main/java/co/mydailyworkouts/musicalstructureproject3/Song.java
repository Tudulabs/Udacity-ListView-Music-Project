package co.mydailyworkouts.musicalstructureproject3;

public class Song {

    //Song name
    private String mSongName;

    //Artist name
    private String mArtistName;

    //album art for the current artist

    private String mAlbumName;
    private int mAlbumArt;

    public Song(String artistName, String songName, int albumArt, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
        mAlbumName = albumName;

    }

    //get the default translation of the word
    public String getmSongName() {
        return mSongName;
    }

    //get the miwok translation of the word
    public String getmArtistName() {
        return mArtistName;
    }

    //get the album art for the song artist
    public int getmAlbumArt() {
        return mAlbumArt;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }
}



