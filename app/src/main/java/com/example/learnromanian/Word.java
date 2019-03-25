package com.example.learnromanian;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Romanian translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Romanian translation for the word */
    private String mRomanianTranslation;

    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param romaninanTranslation is the word in the Romanian language
     */
    public Word(String defaultTranslation, String romaninanTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mRomanianTranslation = romaninanTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Romanian translation of the word.
     */
    public String getRomanianTranslation() {
        return mRomanianTranslation;
    }
    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}