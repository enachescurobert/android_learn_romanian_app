package com.example.learnromanian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "tata",R.drawable.father));
        words.add(new Word("mother", "mama",R.drawable.mother));
        words.add(new Word("son", "fiu",R.drawable.son));
        words.add(new Word("daughter", "sora",R.drawable.daughter));
        words.add(new Word("older brother", "sora mai mare",R.drawable.older_brother));
        words.add(new Word("younger brother", "frate mai mic",R.drawable.little_brother));
        words.add(new Word("older sister", "sora mai mare",R.drawable.older_sister));
        words.add(new Word("younger sister", "sora mai mica",R.drawable.little_sister));
        words.add(new Word("grandmother ", "bunica",R.drawable.grandmother));
        words.add(new Word("grandfather", "bunic",R.drawable.grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}