package com.example.owner.flooring_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Owner on 3/30/2018.
 *
 * This class is the second intent that displays the result of the footage.
 */

public class Result extends AppCompatActivity {

    TextView tvCalculation;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        //Here's where the calculation gets displayed in the second intent
        tvCalculation=(TextView)findViewById(R.id.tvCalculation);

        Bundle extras= getIntent().getExtras();
        double length=Double.parseDouble((String)extras.get("Width"));
        double width=Double.parseDouble((String)extras.get("Length"));
        double area=length*width;
        tvCalculation.setText("Width is :"+width+" and length is "+length+"."+"You need "+area+" square feet.");
    }
}
