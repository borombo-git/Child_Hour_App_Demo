package com.borombo.childhoursappdemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.borombo.childhoursappdemo.R;
import com.borombo.childhoursappdemo.adapters.HomeProfileAdapter;
import com.borombo.childhoursappdemo.model.Profile;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Profile> profiles = new ArrayList<>();

        profiles.add(new Profile("Moi"));
        profiles.add(new Profile("Toi"));
        profiles.add(new Profile("Lui"));
        profiles.add(new Profile("Elle"));
        profiles.add(new Profile("Nous"));
        profiles.add(new Profile("Vous"));
        profiles.add(new Profile("Ils"));
        profiles.add(new Profile("Elo"));
        profiles.add(new Profile("Truc"));
        profiles.add(new Profile("Machin"));

        Log.i("Id :", String.valueOf(profiles.get(5).getId()));

        RecyclerView recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);

        HomeProfileAdapter adapter;

        adapter = new HomeProfileAdapter(profiles);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

        Button addProfile = (Button) findViewById(R.id.addProfile);
        Button deleteProfile = (Button) findViewById(R.id.deleteProfile);

        addProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddProfileActivity.class);
                startActivity(intent);
            }
        });

        deleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeleteProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
