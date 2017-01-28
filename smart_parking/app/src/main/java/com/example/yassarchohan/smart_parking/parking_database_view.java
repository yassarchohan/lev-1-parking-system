package com.example.yassarchohan.smart_parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class parking_database_view extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference Mreferences;
    private Getter_methods gm;
    private Custom_adapter customadapter;
    private String name;
    private String message;
    private ListView list;
    private ChildEventListener mchildeventlistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_database_view);




    }
}
