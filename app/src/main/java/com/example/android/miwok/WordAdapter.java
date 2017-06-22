package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Annsnrlzhr on 6/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context ctx, ArrayList<Word> words) {
        super(ctx, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView mMiwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        mMiwokTextView.setText(currentWord.getMiwokTranslation());

        TextView mDefaultTextView = (TextView) listItemView.findViewById(R.id.english);
        mDefaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            mImageView.setImageResource(currentWord.getmImageResourceId());
            mImageView.setVisibility(View.VISIBLE);
        } else {
            mImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

