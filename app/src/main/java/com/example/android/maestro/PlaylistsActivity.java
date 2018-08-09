package com.example.android.maestro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a list of information
        ArrayList<Information> data = new ArrayList<Information>();

        data.add(new Information(getString(R.string.playlist_a), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_b), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_c), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_d), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_e), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_f), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_g), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_h), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_i), getString(R.string.number_of_songs), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.playlist_j), getString(R.string.number_of_songs), R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_playlists);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);

    }

}