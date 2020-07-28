package com.sumayea.joyexpress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Dashboard extends Fragment {

    GridLayout homeGrid;
    CardView creat_parcel;
    CardView parcel_update;
    CardView payment_update;

    ImageButton settings;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.dashboard, container, false);

        settings= view.findViewById(R.id.settings);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SettingsFragment settingsFragment= new SettingsFragment();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, settingsFragment).commit();
                fragmentTransaction.addToBackStack(null);



            }
        });


        homeGrid= (GridLayout)view.findViewById(R.id.gridHome);
        creat_parcel= (CardView) view.findViewById(R.id.creat_parcel);
        parcel_update= (CardView) view.findViewById(R.id.parcel_update);
        payment_update= (CardView) view.findViewById(R.id.payment_update);



        creat_parcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                CreateDelivery createDelivery= new CreateDelivery();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, createDelivery).commit();
                fragmentTransaction.addToBackStack(null);


            }
        });

        parcel_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Parcel_ListFragment parcel_listFragment= new Parcel_ListFragment();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, parcel_listFragment).commit();
                fragmentTransaction.addToBackStack(null);


            }
        });



        payment_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                PaymentUpdateFragment  paymentUpdateFragment= new PaymentUpdateFragment();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, paymentUpdateFragment).commit();
                fragmentTransaction.addToBackStack(null);


            }
        });


        return view;
    }


}
