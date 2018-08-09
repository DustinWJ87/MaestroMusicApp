package com.example.android.maestro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArtistsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a list of information
        ArrayList<Information> data = new ArrayList<Information>();

        data.add(new Information(getString(R.string.artist_a), getString(R.string.song_a), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_b), getString(R.string.song_b), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_c), getString(R.string.song_c), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_d), getString(R.string.song_d), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_e), getString(R.string.song_e), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_f), getString(R.string.song_f), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_g), getString(R.string.song_g), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_h), getString(R.string.song_h), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_i), getString(R.string.song_i), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.artist_j), getString(R.string.song_j), R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_artists);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);
    }
}