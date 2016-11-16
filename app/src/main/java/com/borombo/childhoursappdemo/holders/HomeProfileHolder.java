package com.borombo.childhoursappdemo.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.borombo.childhoursappdemo.R;
import com.borombo.childhoursappdemo.model.Profile;

/**
 * Created by Erwan on 12/11/2016.
 */

public class HomeProfileHolder extends RecyclerView.ViewHolder{

    private TextView profileName;
    private Button arrival;
    private Button departure;

    public HomeProfileHolder(View itemView) {
        super(itemView);

        this.profileName = (TextView) itemView.findViewById(R.id.porfileName);
        this.arrival= (Button) itemView.findViewById(R.id.arrivalButton);
        this.departure= (Button) itemView.findViewById(R.id.departureButton);

        this.arrival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.departure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void updateUI(Profile profile){
        profileName.setText(profile.getName());
    }
}
