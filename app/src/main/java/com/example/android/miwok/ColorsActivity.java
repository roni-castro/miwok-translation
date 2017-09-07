package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> colorWordList = new ArrayList<>();
        colorWordList.add(new Word("red","weṭeṭṭi", R.drawable.color_red));
        colorWordList.add(new Word("green","chokokki", R.drawable.color_green));
        colorWordList.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        colorWordList.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        colorWordList.add(new Word("black","kululli",R.drawable.color_black));
        colorWordList.add(new Word("white","kelelli",R.drawable.color_white));
        colorWordList.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colorWordList.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        // The adapter is the connection between the data set and the ListView
        WordAdapter colorAdapter = new WordAdapter(this, colorWordList,R.color.category_colors);
        // Connect the ListView with the adapter
        ListView colorListView = (ListView) findViewById(R.id.activity_all_list_items);
        colorListView.setAdapter(colorAdapter);
    }
}
