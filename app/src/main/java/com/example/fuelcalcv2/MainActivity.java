package com.example.fuelcalcv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText distance, liters;
    Button calc;

    float result_num;
    float dis,lit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        distance = (EditText)findViewById(R.id.distance);
        liters = (EditText)findViewById(R.id.liters);
        calc = (Button)findViewById(R.id.calcBtn);

    }

    public void calc(View view) {
        dis = Float.parseFloat(distance.getText().toString());
        lit = Float.parseFloat(liters.getText().toString());
        result_num = (100*lit)/dis;
        result.setText(String.valueOf(result_num));

        if (result_num==0){
            Toast.makeText(getApplicationContext(),"result is 0",Toast.LENGTH_LONG).show();
        }

    }
}
