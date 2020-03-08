package com.blueradix.android.calculatorwithfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout additionFrameContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdditionFragment additionFragment = new AdditionFragment();
        SubtractionFragment subtractionFragment = new SubtractionFragment();

        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.additionFragmentContainer, additionFragment)
                .commit();

        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.subtractionFragmentContainer, subtractionFragment)
                .commit();


    }
}
