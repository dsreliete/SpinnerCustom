package com.example.eliete.myapplication2;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomSpinnerAdapter extends ArrayAdapter<String> {

    private List<String> list;
    private Context context;

    public CustomSpinnerAdapter(@NonNull MainActivity context, @LayoutRes int
            resource, @NonNull List<String> list) {
        super(context, resource, list);
        this.list = list;
        this.context = context;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);

    }

    public View getCustomView(int position, @Nullable View convertView,
                              @NonNull ViewGroup parent){

        View view = LayoutInflater.from(context).inflate(R.layout
                .spinner_item_cobranca, parent, false);

        TextView itemSpinner = (TextView) view.findViewById(R.id.item_spinner);
        itemSpinner.setText(getItem(position));


        return view;
    }

    public String getItem(int position) {
        return list.get(position);
    }
}
