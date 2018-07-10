package co.mydailyworkouts.musicalstructureproject3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SelenaGomezProfile extends AppCompatActivity {

    static boolean selenaActive = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selena_gomez_profile);

        selenaActive = true;

        // **this is the button links to different artists
        Button drakesProfileButton = findViewById(R.id.drake_activity_button);
        Button blinksProfileButton = findViewById(R.id.blink_182_activity_button);
        Button selenasProfileButton = findViewById(R.id.selena_gomez_activity_button);
        Button beyoncesProfileButton = findViewById(R.id.beyonce_activity_button);

        blinksProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blinkActivityLink = new Intent(SelenaGomezProfile.this, Blink182Profile.class);
                startActivity(blinkActivityLink);
            }
        });
        drakesProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drakeActivityLink = new Intent(SelenaGomezProfile.this, DrakesProfile.class);
                startActivity(drakeActivityLink);
            }
        });

        selenasProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selenaActivityLink = new Intent(SelenaGomezProfile.this, SelenaGomezProfile.class);
                startActivity(selenaActivityLink);
            }
        });

        beyoncesProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beyonceActivityLink = new Intent(SelenaGomezProfile.this, BeyonceProfile.class);
                startActivity(beyonceActivityLink);
            }
        });

        //**end button links to artists

        Log.d("tagged", "onCreate: actives currents stats is " + selenaActive);
        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Selena Gomez", "Round & Round", R.drawable.selena_gomez_album_art, "For You"));
        songs.add(new Song("Selena Gomez", "Love You Like a Love Song", R.drawable.selena_gomez_album_art, "For You"));
        songs.add(new Song("Selena Gomez", "Under Cover", R.drawable.selena_gomez_album_art, "Stars Dance"));
        songs.add(new Song("Selena Gomez", "Birthday", R.drawable.selena_gomez_album_art, "Stars Dance"));

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

    }

    @Override
    public void onStop() {
        super.onStop();
        selenaActive = false;
        Log.d("tagged", "onCreate: actives currents stats is " + selenaActive);
    }
}