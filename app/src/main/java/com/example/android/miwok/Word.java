package com.example.android.miwok;

public class Word {

//    Default Translation
    private String mDefaultTranslation;

// Miwork Translation
    private String mWikokTranslation;


    public Word(String mDefaultTranslation, String mWikokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mWikokTranslation = mWikokTranslation;
    }
//   This Creates a Getter Method for the Default Translation
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

//    This Creates a Getter Method for the Miwok Translation
    public String getmWikokTranslation() {
        return mWikokTranslation;
    }
}
