package com.dismas.imaya.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Value1, Value2;
    private TextView SumValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Value1 = (EditText) findViewById(R.id.value1);
        Value2 = (EditText) findViewById(R.id.value2);
        SumValue = (TextView) findViewById(R.id.sum);
        Button Total = (Button) findViewById(R.id.button);
        Total.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handleButtonClick();
            }
        });

    }
    private void handleButtonClick() {
        int FirstValueConverted = Integer.parseInt(Value1.getText().toString());
        double SecondValueConverted = Double.parseDouble(Value2.getText().toString());
        double CalcTotal = FirstValueConverted + SecondValueConverted;
        SumValue.setText("Sum: " + String.valueOf(CalcTotal));
    }

}
