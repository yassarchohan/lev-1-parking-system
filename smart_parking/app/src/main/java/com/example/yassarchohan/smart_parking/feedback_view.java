package com.example.yassarchohan.smart_parking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class feedback_view extends Fragment {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference Mreferences;
    private Getter_methods gm;
    private Custom_adapter customadapter;
    private String name;
    private String message;
    private ListView list;
    private ChildEventListener mchildeventlistener;


    public feedback_view() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_feedback_view,null);
        list = (ListView) v.findViewById(R.id.list1);

        firebaseDatabase = FirebaseDatabase.getInstance();
        Mreferences = firebaseDatabase.getReference().child("Feedback");

        final List<Getter_methods> messages = new ArrayList<>();
        customadapter = new Custom_adapter(v.getContext(), R.layout.activity_custom_view, messages);
        list.setAdapter(customadapter);

        mchildeventlistener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                gm = dataSnapshot.getValue(Getter_methods.class);
                gm.setKey(dataSnapshot.getKey());
                customadapter.notifyDataSetChanged();
                customadapter.add(gm);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        Mreferences.addChildEventListener(mchildeventlistener);

        return v;
    }

}
