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

        data.add(new Information("Artist A", "Song A", R.drawable.ic_library_music));
        data.add(new Information("Artist B", "Song B", R.drawable.ic_library_music));
        data.add(new Information("Artist C", "Song C", R.drawable.ic_library_music));
        data.add(new Information("Artist D", "Song D", R.drawable.ic_library_music));
        data.add(new Information("Artist E", "Song E", R.drawable.ic_library_music));
        data.add(new Information("Artist F", "Song F", R.drawable.ic_library_music));
        data.add(new Information("Artist G", "Song G", R.drawable.ic_library_music));
        data.add(new Information("Artist H", "Song H", R.drawable.ic_library_music));
        data.add(new Information("Artist I", "Song I", R.drawable.ic_library_music));
        data.add(new Information("Artist J", "Song J", R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_artists);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = (ListView) findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);
    }
}