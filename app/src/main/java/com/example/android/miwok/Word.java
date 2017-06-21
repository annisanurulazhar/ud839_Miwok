package com.example.android.miwok;

import java.lang.ref.SoftReference;

/**
 * Created by Annsnrlzhr on 6/21/2017.
 */

public class Word {
   private String miwokTranslation;
    private String defaultTranslation;

    public Word (String defaultTrans, String miwokTrans) {
        miwokTranslation = miwokTrans;
        defaultTranslation = defaultTrans;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
