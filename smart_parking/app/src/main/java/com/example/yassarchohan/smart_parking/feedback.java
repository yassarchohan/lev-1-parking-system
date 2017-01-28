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
public class feedback extends Fragment {

   private Button btn;
    private EditText edt1,edt2;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference Mreferences;
    private Getter_methods gm;
    private String name;
    private String message;


    public feedback() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_feedback,null);
        btn = (Button) v.findViewById(R.id.submitfeed);
        edt1 = (EditText) v.findViewById(R.id.namefeed);
        edt2 = (EditText) v.findViewById(R.id.message);

        firebaseDatabase = FirebaseDatabase.getInstance();
        Mreferences = firebaseDatabase.getReference().child("Feedback");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name =edt1.getText().toString();
                message = edt2.getText().toString();
                String key = Mreferences.push().getKey();

                if(name == null && message == null){
                    Toast.makeText(v.getContext(), "error sending", Toast.LENGTH_SHORT).show();
                }
                else {
                    gm = new Getter_methods(name, message, key);
                    Mreferences.push().setValue(gm);
                }

            }
        });


        return v;
    }

}
