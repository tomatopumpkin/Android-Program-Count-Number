package com.wimonsiri.exercise4_2s6206021621147;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numberText;
    private Button btnCountU, btnCountD, btnRes;

    final String message = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCountU = (Button) findViewById(R.id.btnCountU);
        btnCountD = (Button) findViewById(R.id.btnCountD);
        btnRes = (Button) findViewById(R.id.btnRes);
        numberText = (TextView) findViewById(R.id.numberText);

        btnCountU.setOnClickListener(this);
        btnCountD.setOnClickListener(this);
        btnRes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(numberText.getText().toString());
        if (v.getId() == R.id.btnCountU) {
            num++;
            if (num % 5 == 0){
                Toast.makeText(this,"หาร 5 ลงตัว" , Toast.LENGTH_SHORT).show();
            }
            numberText.setText(Integer.toString(num));
        } else if (v.getId() == R.id.btnCountD) {
            num--;
            if (num % 5 == 0){
                Toast.makeText(this,"หาร 5 ลงตัว" , Toast.LENGTH_SHORT).show();
            }
            numberText.setText(Integer.toString(num));
        } else if (v.getId() == R.id.btnRes) {
            numberText.setText(message);

        }

    }


}