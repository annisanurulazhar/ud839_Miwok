package com.example.android.miwok;

import android.media.Image;
import android.support.annotation.IdRes;
import android.widget.ImageView;

import java.lang.ref.SoftReference;

/**
 * Created by Annsnrlzhr on 6/21/2017.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int mImageResourceId = NullId;

    private static final int NullId = -1;

    public Word (String defaultTrans, String miwokTrans) {
        miwokTranslation = miwokTrans;
        defaultTranslation = defaultTrans;
    }
    public Word (String defaultTranslation, String miwokTranslation, int id) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        mImageResourceId = id;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId!=NullId;
    }
}
