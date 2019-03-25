package com.example.learnromanian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "rosu",R.drawable.red));
        words.add(new Word("yellow", "galben",R.drawable.yellow));
        words.add(new Word("pink", "roz",R.drawable.pink));
        words.add(new Word("green", "verde",R.drawable.green));
        words.add(new Word("brown", "maro",R.drawable.brown));
        words.add(new Word("gray", "gri",R.drawable.gray));
        words.add(new Word("black", "negru",R.drawable.black));
        words.add(new Word("white", "alb",R.drawable.white));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}