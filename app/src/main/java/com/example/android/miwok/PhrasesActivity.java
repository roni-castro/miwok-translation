package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> phrasesWordList = new ArrayList<>();
        phrasesWordList.add(new Word("Where are you going?","minto wuksus"));
        phrasesWordList.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrasesWordList.add(new Word("My name is...","oyaaset..."));
        phrasesWordList.add(new Word("How are you feeling?","michәksәs?"));
        phrasesWordList.add(new Word("I’m feeling good.","kuchi achit"));
        phrasesWordList.add(new Word("Are you coming?","әәnәs'aa?"));
        phrasesWordList.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrasesWordList.add(new Word("I’m coming.","әәnәm"));
        phrasesWordList.add(new Word("Let’s go.","yoowutis"));
        phrasesWordList.add(new Word("Come here.","әnni'nem"));

        // The adapter is the connection between the data set and the ListView
        WordAdapter phrasesWordAdapter = new WordAdapter(this, phrasesWordList,R.color.category_phrases);
        // Connect the ListView with the adapter
        ListView phrasesListView = (ListView) findViewById(R.id.activity_all_list_items);
        phrasesListView.setAdapter(phrasesWordAdapter);
    }
}
