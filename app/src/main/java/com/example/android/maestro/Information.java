package com.example.android.maestro;

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
     * Create a new information object
     *
     * @param informationA    First piece of information displayed
     * @param informationB    Second piece of information displayed
     * @param ImageResourceId is the drawable resource ID for the image associated with the information
     */
    public Information(String informationA, String informationB, int ImageResourceId) {
        mInformationA = informationA;
        mInformationB = informationB;
        mImageResourceId = ImageResourceId;
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
}