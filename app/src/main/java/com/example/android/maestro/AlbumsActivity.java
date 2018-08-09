package com.example.android.maestro;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a list of information
        ArrayList<Information> data = new ArrayList<Information>();

        data.add(new Information(getString(R.string.album_a), getString(R.string.artist_a), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_b), getString(R.string.artist_b), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_c), getString(R.string.artist_c), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_d), getString(R.string.artist_d), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_e), getString(R.string.artist_e), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_f), getString(R.string.artist_f), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_g), getString(R.string.artist_g), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_h), getString(R.string.artist_h), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_i), getString(R.string.artist_i), R.drawable.ic_library_music));
        data.add(new Information(getString(R.string.album_j), getString(R.string.artist_j), R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_albums);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);
    }
}