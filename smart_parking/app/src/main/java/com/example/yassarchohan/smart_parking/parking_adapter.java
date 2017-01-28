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
public class parking_adapter extends ArrayAdapter<Getter_methods> {

    public parking_adapter(Context context, int resource, List<Getter_methods> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.activity_custom_view, parent, false);
        }

        TextView dateandtime = (TextView) convertView.findViewById(R.id.getdateandtime);
        TextView nametext = (TextView) convertView.findViewById(R.id.getname);
        TextView slotext = (TextView) convertView.findViewById(R.id.getslotno);
        TextView start = (TextView) convertView.findViewById(R.id.getstartime);
        TextView stop = (TextView) convertView.findViewById(R.id.getendtime);
        TextView total = (TextView) convertView.findViewById(R.id.gettotal);


        Getter_methods message = getItem(position);

        nametext.setVisibility(View.VISIBLE);
        slotext.setVisibility(View.VISIBLE);


        nametext.setText(message.getName());
        slotext.setText(message.getSlot());
        start.setText(message.getStarttime());
        stop.setText(message.getEndtime());

        return convertView;
    }

}
