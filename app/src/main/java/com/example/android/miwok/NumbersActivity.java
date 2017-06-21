package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one","satu"));
        numbers.add(new Word("two","dua"));
        numbers.add(new Word("three","tiga"));
        numbers.add(new Word("four","empat"));
        numbers.add(new Word("five","lima"));
        numbers.add(new Word("one","satu"));
        numbers.add(new Word("two","dua"));
        numbers.add(new Word("three","tiga"));
        numbers.add(new Word("four","empat"));
        numbers.add(new Word("five","lima"));

        WordAdapter itemsAdapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
