package com.binod.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.binod.topicc6_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragments extends Fragment implements View.OnClickListener {

    EditText etRadius;
    Button btnAreaOfCircle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_fragments, container, false);
        etRadius = view.findViewById(R.id.etRadius);
        btnAreaOfCircle = view.findViewById(R.id.btnAreaOfCircle);

        btnAreaOfCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f * radius *radius;

        Toast.makeText(getActivity(), "Radius is: " + radius, Toast.LENGTH_SHORT).show();

    }
}
