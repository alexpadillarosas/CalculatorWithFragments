package com.blueradix.android.calculatorwithfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubtractionFragment extends Fragment {

    private EditText op1EditText;
    private EditText op2EditText;
    private Button resultButton;
    private TextView resultTextView;

    public SubtractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_subtraction, container, false);

        op1EditText = view.findViewById(R.id.subtractionOp1EditText);
        op2EditText = view.findViewById(R.id.subtractionOp2EditText);
        resultTextView = view.findViewById(R.id.subtractionResultTextView);
        resultButton = view.findViewById(R.id.subtractionResultButton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer op1 = Integer.parseInt(op1EditText.getText().toString());
                Integer op2 = Integer.parseInt(op2EditText.getText().toString());
                Integer result = op1 - op2;
                resultTextView.setText(result.toString());
            }
        });

        return view;
    }

}
