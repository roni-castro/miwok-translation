package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new object and start it's variables
     * @param defaultWord is the word in the default language of the cellphone
     * @param miwokWord is the word in the miwok language
     * @param imageResourceId is the id of the image
     */
    public Word(String defaultWord, String miwokWord, int imageResourceId){
        this.defaultTranslation = defaultWord;
        this.miwokTranslation = miwokWord;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Create a new object and start it's variables
     * @param defaultWord is the word in the default language of the cellphone
     * @param miwokWord is the word in the miwok language
     */
    public Word(String defaultWord, String miwokWord){
        this.defaultTranslation = defaultWord;
        this.miwokTranslation = miwokWord;
    }

    /**
     * @return the default translation of a word (according to the cellphone)
     */
    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    /**
     * @return the miwok translation of a word
     */
    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    /**
     * @return the image that gives a mean to thie word
     */
    public int getImageResourceId(){
        return imageResourceId;
    }

    /**
     * @return if this word has an image or not
     */
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }


}
