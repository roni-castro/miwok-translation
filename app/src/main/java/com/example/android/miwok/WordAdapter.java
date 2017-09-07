/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word>  {
    private int colorResourceId;
    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param wordList is the list of {@link Word}s to be displayed.
     */
     public WordAdapter(Context context, ArrayList<Word> wordList, int colorResourceId){
         super(context, 0, wordList);
         this.colorResourceId = colorResourceId;
     }

    /**
     * Create a list item, to be attached into the View
     * @param position is the position of the element in the list (0,1,2,3...)
     * @param convertView is the view whic was recycled
     * @param parent is the parent group of all the itens (ListView)
     * @return a recycled or a new view
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view,
        // which means converting a XML file into View Object
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Change the color of the text container in the list item
        View text_container = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        // Set the background color of the text container
        text_container.setBackgroundColor(color);

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml with the ID image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        //Check if the this word has an image. If so, get the imageID from the
        // currentWord object and set this imageID on the ImageView, otherwise don't show it
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible if it's recycled
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }


        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}