package com.example.owner.flooring_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//This class displays the main screen to enter the flooring measurements
public class MainActivity extends AppCompatActivity {

    EditText etLength, etWidth;
    TextView txtLblLength, txtLblWidth;
    Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLength=(EditText)findViewById(R.id.etLength);
        etWidth=(EditText)findViewById(R.id.etWidth);
        txtLblLength = (TextView) findViewById(R.id.txtLblLength);
        txtLblWidth=(TextView)findViewById(R.id.txtLblWidth);
        btnCalculate=(Button)findViewById(R.id.btnCalculate);

    }

    public void onClickResult(View view) {
        String width = etWidth.getText().toString();
        String length = etLength.getText().toString();

        //This calls the 2nd intent to print out the calculation
        Intent act2Intent = new Intent(this, Result.class);
        act2Intent.putExtra("Width", width);
        act2Intent.putExtra("length", length);
        startActivity(act2Intent);
    }
}