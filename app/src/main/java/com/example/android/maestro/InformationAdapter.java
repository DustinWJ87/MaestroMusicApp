package com.example.android.maestro;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    /**
     * Resource ID for the background color for this list of information
     */
    private int mColorResourceId;

    /**
     * Create a new {@link InformationAdapter} object.
     *
     * @param context         is the current context that the adapter is being created in.
     * @param data            is the list of {@link Information} to be displayed.
     * @param colorResourceId is the resource ID for the background color for this information list.
     */
    public InformationAdapter(Activity context, ArrayList<Information> data, int colorResourceId) {
        super(context, 0, data);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check is an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Information object located at this position in the list
        Information currentInformation = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID informationA
        TextView informationATextView = listItemView.findViewById(R.id.informationA);
        // Get the information from the currentInformation object and set this text on the informationATextView
        informationATextView.setText(currentInformation.getInformationA());
        // Find the TextView in the list_item.xml layout with the ID informationB
        TextView informationBTextView = listItemView.findViewById(R.id.informationB);
        // Get the information from the currentInformation object and set this text on the informationATextView
        informationBTextView.setText(currentInformation.getInformationB());
        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentInformation.getImageResourceId());
        // Find the Button in the list_item.xml layout with the ID play button
        final Button playButton = listItemView.findViewById(R.id.play_button);
        // Find our whether or not the line of information has a button and then displays it properly
        // Also sets an onclickListener to swap the state of the button from play to pause and vice versa
        if (currentInformation.hasButton()) {
            playButton.setId(currentInformation.getPlayButton());
            playButton.setVisibility(View.VISIBLE);
            playButton.setTag(1);
            playButton.setText(R.string.play_button);
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final int status = (Integer) v.getTag();
                    if (status == 1) {
                        playButton.setText(R.string.pause_button);
                        v.setTag(0);
                    } else {
                        playButton.setText(R.string.play_button);
                        v.setTag(1);
                    }
                }
            });
        } else {
            playButton.setVisibility(View.INVISIBLE);
        }
        // Set the theme color for the list item
        View listContainer = listItemView.findViewById(R.id.list_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the list item container View
        listContainer.setBackgroundColor(color);


        // Return the View for the ListItem
        return listItemView;
    }
}