package com.example.learnromanian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the Views that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New intent to open the activity {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start a new activity
                startActivity(numbersIntent);
            }
        });

        //Find the Views that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //Set a clicklistener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New intent to open the activity {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start a new activity
                startActivity(colorsIntent);
            }
        });

        //Find the Views that shows the colors category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a clicklistener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New intent to open the activity {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start a new activity
                startActivity(phrasesIntent);
            }
        });

        //Find the Views that shows the colors category
        TextView family = (TextView) findViewById(R.id.family);
        //Set a clicklistener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New intent to open the activity {@link ColorsActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                //Start a new activity
                startActivity(familyIntent);
            }
        });

    }


/*
    public void openNumbersList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyList(View view){
        Intent i = new Intent(this, FamilyMembersActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
*/

}
