package com.example.niraj.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {
    public SongAdapter(@NonNull Context context, @NonNull ArrayList<Songs> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Songs currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.first_text_view);
        miwokTextView.setText(currentWord.getFirstItem());
        TextView defaultTextView = listItemView.findViewById(R.id.second_text_view);
        defaultTextView.setText(currentWord.getSecondItem());
        return listItemView;
    }
}
