package com.example.learnromanian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        //setTitle("Numbers");
        setContentView(R.layout.word_list);

        //The ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements to the Word Object
       words.add(new Word("zero","zero",R.drawable.zero));
       words.add(new Word("one","unu",R.drawable.one));
       words.add(new Word("two","doi",R.drawable.two));
       words.add(new Word("three","trei",R.drawable.three));
       words.add(new Word("four","patru",R.drawable.four));
       words.add(new Word("five","cinci",R.drawable.five));
       words.add(new Word("six","sase",R.drawable.six));
       words.add(new Word("seven","sapte",R.drawable.seven));
       words.add(new Word("eight","opt",R.drawable.eight));
       words.add(new Word("nine","noua",R.drawable.nine));
       words.add(new Word("ten","zece",R.drawable.ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);

    }
}
