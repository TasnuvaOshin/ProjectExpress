package com.sumayea.joyexpress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class CreateDelivery extends Fragment {
    ImageButton back, importt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.create_delivery, container, false);

        back= view.findViewById(R.id.back);
        importt= view.findViewById(R.id.importt);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Dashboard dashboard= new Dashboard();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, dashboard).commit();
                fragmentTransaction.addToBackStack(null);



            }
        });

        importt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ImportFragment importFragment = new ImportFragment();
                FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container1, importFragment).commit();
                fragmentTransaction.addToBackStack(null);



            }
        });

        return view;

    }

}
