package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> families = new ArrayList<Word>();

        families.add(new Word("father","ayah",R.drawable.family_father));
        families.add(new Word("mother", "ibu",R.drawable.family_mother));
        families.add(new Word("brother", "kakak/adik laki-laki",R.drawable.family_older_brother));
        families.add(new Word("sister", "kakak/adik perempuan",R.drawable.family_older_sister));

        WordAdapter familiesAdapter = new WordAdapter(this, families);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(familiesAdapter);
    }
}
