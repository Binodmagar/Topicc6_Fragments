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
public class FirstFragment extends Fragment implements View.OnClickListener {

    //declaration
    EditText etFirst, etSecond;
    Button btnCalculate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //view to get value inside first_fagments
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //binding
        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first + second;

        Toast.makeText(getActivity(), " sum is: " + result, Toast.LENGTH_SHORT).show();

    }
}
