package com.at.gmail.tomeofadventurers.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.at.gmail.tomeofadventurers.R;

import java.util.List;

public class SelectCharacterAdapter extends RecyclerView.Adapter<SelectCharacterAdapter.SelectCharacterAdapterViewHolder>
{
    private Context myContext;
    int charNameListLength;
    List<String> charNames;

    //Constructor
    public SelectCharacterAdapter(Context myContext, List<String> names, int length) {
        this.myContext = myContext;
        charNames = names;
        charNameListLength = length;
    }

    @NonNull
    @Override
    public SelectCharacterAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(myContext);
        View view = inflater.inflate(R.layout.layout_characters, viewGroup, false);
        SelectCharacterAdapterViewHolder Holder = new SelectCharacterAdapterViewHolder(view);

        return Holder;
    }

    //i holds position
    @Override
    public void onBindViewHolder(@NonNull final SelectCharacterAdapterViewHolder selectCharacterAdapterViewHolder, final int i) {

        selectCharacterAdapterViewHolder.textViewCharacterName.setText(charNames.get(i));
    }

    @Override
    public int getItemCount() {
        return charNameListLength;
    }

    //The View holder is a single instance of the layout used in the recycler.
    public class SelectCharacterAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCharacterName;
        LinearLayout parentLayout;

        public SelectCharacterAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewCharacterName = itemView.findViewById(R.id.CharacterNameTextView);
            parentLayout = itemView.findViewById(R.id.linearLayout);
        }
    }

}

