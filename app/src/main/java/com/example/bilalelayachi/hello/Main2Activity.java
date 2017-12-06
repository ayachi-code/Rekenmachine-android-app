package com.example.bilalelayachi.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Switch verander = (Switch) findViewById(R.id.kwadrateren);
        verander.setChecked(false);

        verander.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);

            }
        });








    }






    public void bereken(View view){
        EditText getal = (EditText) findViewById(R.id.getal1);
        TextView hetgetal = (TextView) findViewById(R.id.antwoord);
        int waarden = Integer.parseInt(getal.getText().toString());
        double wortel_waarden = Math.sqrt(waarden);
        String wortel_waarden_string = String.valueOf(wortel_waarden);
        hetgetal.setText("Het wortel van het getal is " + wortel_waarden_string);
        System.out.println("hey " + wortel_waarden_string);



    }




}
