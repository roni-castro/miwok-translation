package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> familyWordList = new ArrayList<>();
        familyWordList.add(new Word("father","әpә",R.drawable.family_father));
        familyWordList.add(new Word("mother","әṭa",R.drawable.family_mother));
        familyWordList.add(new Word("son","angsi",R.drawable.family_son));
        familyWordList.add(new Word("daugther","tune",R.drawable.family_daughter));
        familyWordList.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        familyWordList.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        familyWordList.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        familyWordList.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        familyWordList.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        familyWordList.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

        // The adapter is the connection between the data set and the ListView
        WordAdapter familyAdatper = new WordAdapter(this, familyWordList,R.color.category_family);

        // Connect the ListView with the adapter
        ListView familyListView = (ListView) findViewById(R.id.activity_all_list_items);
        familyListView.setAdapter(familyAdatper);
    }
}
