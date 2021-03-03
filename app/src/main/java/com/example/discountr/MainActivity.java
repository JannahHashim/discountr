package com.example.discountr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Price;
    private TextView  display;
    private RadioGroup radioGroup,radioGroup2;

    private RadioButton discount, interest, ump,notump;
    private Button button1, button2, button3;
    //double display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Simple Calculator");

        //link with view id (from design)
        // var name = findViewById(R.id.unique id)
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        display = findViewById(R.id.tvdis);
        Price = findViewById(R.id.etprice);
        discount = findViewById(R.id.rbdis);
        interest = findViewById(R.id.rbint);
        ump = findViewById(R.id.rbump);
        notump = findViewById(R.id.rbnump);
        button1 = findViewById(R.id.btn10);
        button2 = findViewById(R.id.btn20); //make sure click link yg betul.
        button3 = findViewById(R.id.btn30);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Price.getText().toString().matches("")) {

                    double etprice = Double.parseDouble(Price.getText().toString()); //convert string to double & get the num value
                    if (discount.isChecked()) {
                        double etdis = etprice - etprice * 0.1;
                    } else {

                        double etdis = etprice + etprice * 0.1;
                        display.setText(Double.toString(etdis)); // display the result
                    }

                }

                else {

                    Toast toast = Toast.makeText(MainActivity.this, "Enter Price", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Price.getText().toString().matches("")) {

                    double etprice = Double.parseDouble(Price.getText().toString()); //convert string to double & get the num value


                    if (discount.isChecked()) {
                        double etdis = etprice - (etprice * 0.2);
                    } else {

                        double etdis = etprice + etprice * 0.2;
                        display.setText(Double.toString(etdis)); // display the result
                    }

                }

                else {

                    Toast toast = Toast.makeText(MainActivity.this, "Enter Price", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Price.getText().toString().matches("")) {

                    double etprice = Double.parseDouble(Price.getText().toString()); //convert string to double & get the num value


                    if (discount.isChecked()) {
                        double etdis = etprice - (etprice * 0.3);
                    } else {

                        double etdis = etprice + etprice * 0.3;
                        display.setText(Double.toString(etdis)); // display the result
                    }

                }

                else {

                    Toast toast = Toast.makeText(MainActivity.this, "Enter Price", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });
         ump.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (ump.isChecked()){
                  button1.setEnabled(false);
                  button2.setEnabled(false);
                  button3.setEnabled(true);

             }

             else {

                 button1.setEnabled(true);
                 button2.setEnabled(true);
                 button3.setEnabled(true);
             }
             }

         });
         notump.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (notump.isChecked()){
                     button1.setEnabled(true);
                     button2.setEnabled(true);
                     button3.setEnabled(true);

                 }

                 else {

                     button1.setEnabled(false);
                     button2.setEnabled(false);
                     button3.setEnabled(true);
                 }

             }
         });
         }
}
