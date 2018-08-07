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

        data.add(new Information("Playlist A", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist B", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist C", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist D", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist E", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist F", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist G", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist H", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist I", "# of Songs", R.drawable.ic_library_music));
        data.add(new Information("Playlist J", "# of Songs", R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_playlists);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = (ListView) findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);

    }

}