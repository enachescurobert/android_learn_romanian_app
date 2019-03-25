package com.example.learnromanian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("How are you?", "Ce faci?",R.drawable.meet1));
        words.add(new Word("What is your name?", "Cum te cheama?",R.drawable.meet2));
        words.add(new Word("My name is...", "Numele meu este...",R.drawable.meet3));
        words.add(new Word("How are you feeling?", "Cum te simti?",R.drawable.meet4));
        words.add(new Word("I’m feeling good.", "Ma simt bine.",R.drawable.meet5));
        words.add(new Word("Are you coming?", "Vii?",R.drawable.meet6));
        words.add(new Word("Yes, I’m coming.", "Da, vin.",R.drawable.meet7));
        words.add(new Word("I’m coming.", "Vin.",R.drawable.meet8));
        words.add(new Word("Let’s go.", "Hai sa mergem.",R.drawable.meet9));
        words.add(new Word("Come here.", "Hai aici.",R.drawable.meet10));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}