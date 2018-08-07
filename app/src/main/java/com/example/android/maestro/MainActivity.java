package com.example.android.maestro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the now playing, artists, albums, and playlists categories
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView artists = (TextView) findViewById(R.id.artists);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView playlists = (TextView) findViewById(R.id.playlists);

        //Set a clicklistener on the now playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                //Start the new Activity
                startActivity(nowPlayingIntent);
            }
        });

        //Set a clicklistener on the artists View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                //Start the new Activity
                startActivity(artistsIntent);
            }
        });

        //Set a clicklistener on the albums View
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link ArtistsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                //Start the new Activity
                startActivity(albumsIntent);
            }
        });

        //Set a clicklistener on the playlists View
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link ArtistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                //Start the new Activity
                startActivity(playlistsIntent);
            }
        });
    }
}