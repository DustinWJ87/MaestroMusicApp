package com.example.android.maestro;

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

        data.add(new Information("Album A", "Artist A", R.drawable.ic_library_music));
        data.add(new Information("Album B", "Artist B", R.drawable.ic_library_music));
        data.add(new Information("Album C", "Artist C", R.drawable.ic_library_music));
        data.add(new Information("Album D", "Artist D", R.drawable.ic_library_music));
        data.add(new Information("Album E", "Artist E", R.drawable.ic_library_music));
        data.add(new Information("Album F", "Artist F", R.drawable.ic_library_music));
        data.add(new Information("Album G", "Artist G", R.drawable.ic_library_music));
        data.add(new Information("Album H", "Artist H", R.drawable.ic_library_music));
        data.add(new Information("Album I", "Artist I", R.drawable.ic_library_music));
        data.add(new Information("Album J", "Artist J", R.drawable.ic_library_music));

        // Create an InformationAdapter, whose data source is a list of Information
        // The adapter knows how to create list items for each item in the list
        InformationAdapter adapter = new InformationAdapter(this, data, R.color.category_albums);

        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called activity panel
        // which is declared in the activity_main.xml layout file
        ListView listView = (ListView) findViewById(R.id.activity_panel);

        // Make the ListView use the InformationAdapter we created above, so that the
        // ListView will display list items for each piece of Information in the list
        listView.setAdapter(adapter);
    }
}