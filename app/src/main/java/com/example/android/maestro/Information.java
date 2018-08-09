package com.example.android.maestro;

import android.graphics.drawable.Drawable;
import android.widget.Button;

/**
 * {@link Information} represents a piece or information that will be displayed to the user.
 * It can contain an artist, and album, a number of songs or song title
 */
public class Information {

    /**
     * First piece of information
     */
    private String mInformationA;

    /**
     * Second piece of information
     */
    private String mInformationB;

    /**
     * Resource Id fetching the image for the piece of information displayed
     */
    private int mImageResourceId;

    /**
     * Resource Id fetching the button to be displayed
     */
    private int mPlayButton = NO_BUTTON_PROVIDED;

    /**
     * Constant value that represents no button was provided for this information line
     */
    private static final int NO_BUTTON_PROVIDED = -1;

    /**
     * Create a new information object
     *
     * @param informationA    First piece of information displayed
     * @param informationB    Second piece of information displayed
     * @param imageResourceId is the drawable resource ID for the image associated with the information
     */
    public Information(String informationA, String informationB, int imageResourceId) {
        mInformationA = informationA;
        mInformationB = informationB;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new information object
     *
     * @param informationA    First piece of information displayed
     * @param informationB    Second piece of information displayed
     * @param imageResourceId is the drawable resource ID for the image associated with the information
     * @param playButton      is the drawable resource ID for the button associated with the information
     */
    public Information(String informationA, String informationB, int imageResourceId, int playButton) {
        mInformationA = informationA;
        mInformationB = informationB;
        mImageResourceId = imageResourceId;
        mPlayButton = playButton;
    }

    /**
     * get the first piece of information
     *
     * @return first piece of information
     */
    public String getInformationA() {
        return mInformationA;
    }

    /**
     * get the second piece of information
     *
     * @return second piece of information
     */
    public String getInformationB() {
        return mInformationB;
    }

    /**
     * get the image to match the information
     *
     * @return image of the information
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns the button associated with the resource ID
     *
     * @return
     */
    public int getPlayButton() {
        return mPlayButton;
    }

    /**
     * Returns whether or not there is a button for the line of information
     *
     * @return
     */
    public boolean hasButton() {
        return mPlayButton != NO_BUTTON_PROVIDED;
    }
}