package com.example.yassarchohan.smart_parking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class slots extends Fragment {

    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    public slots() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slots,null);


        btn = (Button) v.findViewById(R.id.slot1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn1 = (Button) v.findViewById(R.id.slot2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn2 = (Button) v.findViewById(R.id.slot3);
        btn3 = (Button) v.findViewById(R.id.slot4);
        btn4 = (Button) v.findViewById(R.id.slot5);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn5 = (Button) v.findViewById(R.id.slot6);
        btn6 = (Button) v.findViewById(R.id.slot7);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return v;
    }

}
