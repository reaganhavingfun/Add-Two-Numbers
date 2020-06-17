package com.example.addtwonumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    EditText txtNum1;
    EditText txtNum2;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum1 = (EditText) findViewById(R.id.txtNum1);
                txtNum2 = (EditText) findViewById(R.id.txtNum2);
                tvResult = (TextView) findViewById(R.id.tvResult);

                int num1 = Integer.parseInt(txtNum1.getText().toString());
                int num2 = Integer.parseInt(txtNum2.getText().toString());
                int result = num1 + num2;
                tvResult.setText(result + "");
            }
        });
    }
}
