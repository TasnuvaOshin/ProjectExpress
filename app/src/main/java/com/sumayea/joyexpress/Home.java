package com.sumayea.joyexpress;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dashboard dashboard= new dashboard();
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container1, dashboard).commit();







//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setTitleTextColor(Color.WHITE);

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);


        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case R.id.nav_dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new dashboard()).commit();
                break;

//            case R.id.nav_profile:
//                startActivity((new Intent(this,.class)));
//                break;


            case R.id.nav_delivery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new CreateDelivery()).commit();
                break;


            case R.id.nav_import:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new Import()).commit();
                break;


            case R.id.nav_listDeliveries:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListDelivery()).commit();
                break;

            case R.id.nav_listInvoices:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListInvoice()).commit();
                break;

            case R.id.nav_listCancelDeliveries:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListCancelDelivery()).commit();
                break;

            case R.id.nav_operator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new CreateOperator()).commit();
                break;


            case R.id.nav_listOperator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListOperator()).commit();
                break;

            case R.id.nav_store:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new CreateStore()).commit();
                break;

            case R.id.nav_listStore:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListStore()).commit();
                break;

            case R.id.nav_product:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new CreateProduct()).commit();
                break;


            case R.id.nav_listProduct:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new ListProduct()).commit();
                break;


        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
