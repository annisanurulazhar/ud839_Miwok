package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one","satu",R.drawable.number_one));
        numbers.add(new Word("two","dua",R.drawable.number_two));
        numbers.add(new Word("three","tiga",R.drawable.number_three));
        numbers.add(new Word("four","empat",R.drawable.number_four));
        numbers.add(new Word("five","lima",R.drawable.number_five));
        numbers.add(new Word("six","enam",R.drawable.number_six));
        numbers.add(new Word("seven","tujuh",R.drawable.number_seven));
        numbers.add(new Word("eight","delapan",R.drawable.number_eight));
        numbers.add(new Word("nine","sembilan",R.drawable.number_nine));
        numbers.add(new Word("ten","sepuluh",R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
