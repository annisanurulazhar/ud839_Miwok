package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("Good Morning", "Selamat Pagi"));
        phrases.add(new Word ("Good Evening", "Selamat Malam"));
        phrases.add(new Word("Hello, World!", "Halo, Dunia!"));

        WordAdapter phrasesAdapter = new WordAdapter(this,phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);

    }
}
