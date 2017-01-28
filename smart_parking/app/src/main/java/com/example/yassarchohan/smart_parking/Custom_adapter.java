package com.example.yassarchohan.smart_parking;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yassar chohan on 1/28/2017.
 */
public class Custom_adapter extends ArrayAdapter<Getter_methods> {


    public Custom_adapter(Context context, int resource,List<Getter_methods> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.activity_custom_view, parent, false);
        }


        TextView messageTextView = (TextView) convertView.findViewById(R.id.forusername);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.userpassword);

        Getter_methods message = getItem(position);

            messageTextView.setVisibility(View.VISIBLE);
            messageTextView.setText(message.getName());
            authorTextView.setText(message.getMessage());

        return convertView;
    }
}
