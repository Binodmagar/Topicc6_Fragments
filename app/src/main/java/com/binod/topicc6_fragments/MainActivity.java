package com.binod.topicc6_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.binod.fragments.FirstFragment;
import com.binod.fragments.SecondFragments;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnFragments;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnFragments = findViewById(R.id.btnFragments);


        btnFragments.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.FragmentContainer,firstFragment);
            fragmentTransaction.commit();
            btnFragments.setText("Load second fragment");
            status = false;
        }else{
            SecondFragments secondFragments = new SecondFragments();
            fragmentTransaction.replace(R.id.FragmentContainer, secondFragments);
            fragmentTransaction.commit();
            btnFragments.setText("Load first fragment");
            status = true;
        }

    }


}
