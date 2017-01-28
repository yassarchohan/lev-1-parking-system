package com.example.yassarchohan.smart_parking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class Alotparking extends Fragment {

    private Button btn;
    private EditText edt1,edt2,edt3,edt4;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference Mreferences;
    private Getter_methods gm;
    private String name;
    private String slot;
    private String start;
    private String stop;



    public Alotparking() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_parking_database,null);

       btn = (Button) v.findViewById(R.id.submitrequest);

        edt1 = (EditText) v.findViewById(R.id.name1);
        edt2 = (EditText) v.findViewById(R.id.slot11);
        edt3 = (EditText) v.findViewById(R.id.starttime);
        edt4 = (EditText) v.findViewById(R.id.endtime);


        firebaseDatabase = FirebaseDatabase.getInstance();
        Mreferences = firebaseDatabase.getReference().child("parking lists");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = edt1.getText().toString();
                slot = edt2.getText().toString();
                start = edt3.getText().toString();
                stop = edt4.getText().toString();
                String key =Mreferences.push().getKey();

                gm = new Getter_methods(name, slot, start,stop,key);
                Mreferences.push().setValue(gm);
                Toast.makeText(v.getContext(), "parking successfully booked", Toast.LENGTH_SHORT).show();

            }
        });


        return v;
    }
    

}
