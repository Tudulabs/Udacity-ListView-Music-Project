package co.mydailyworkouts.musicalstructureproject3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_songs_page);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Drake", "Summer Games", R.drawable.drake_album_art, "Summer Games"));
        songs.add(new Song("Selena Gomez", "Hand to Myself", R.drawable.selena_gomez_album_art, "test"));
        songs.add(new Song("Blink 182", "I Miss You", R.drawable.blink_182, "test"));
        songs.add(new Song("Beyonce", "Ring on it", R.drawable.beyonce_album_cover, "test"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.main_songs_page);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        TextView artistName = findViewById(R.id.artist_name);
        ListView songListing = findViewById(R.id.main_songs_page);

        songListing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String artistSelected = ((TextView) view.findViewById(R.id.artist_name)).getText().toString();

                Log.i("Clicked", "You click: " + artistSelected);

                if (artistSelected.equals("Drake")) {
                    Log.i("Drakes Click", "You just launched Drakes page");
                    Intent drakeActivityPage = new Intent(SongListing.this, DrakesProfile.class);
                    startActivity(drakeActivityPage);
                } else if (artistSelected.equals("Beyonce")) {
                    Log.i("Beyonces Click", "You just launched Beyonces page");

                    Intent beyonceActivityPage = new Intent(SongListing.this, BeyonceProfile.class);
                    startActivity(beyonceActivityPage);

                } else if (artistSelected.equals("Selena Gomez")) {
                    Log.i("Selenas Click", "You just launched Selenas page");
                    Intent selenak182ActivityPage = new Intent(SongListing.this, SelenaGomezProfile.class);
                    startActivity(selenak182ActivityPage);
                } else if (artistSelected.equals("Blink 182")) {

                    Log.i("Blinks Click", "You just launched Blinks page");
                    Intent blink182ActivityPage = new Intent(SongListing.this, Blink182Profile.class);
                    startActivity(blink182ActivityPage);
                }
            }
        });
    }
}


