package com.example.bilalelayachi.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText getal1;
    EditText getal2;
    TextView uitkomst;

    int keuze = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void extra(View v) {
            Button naar_extra_knop = (Button) findViewById(R.id.naar_extra);

            Intent intent = new intent();



            System.out.println("hey");
    }


    public void plus(View v) {
        keuze = 2;
        System.out.println(keuze);

    }

    public void keer(View v) {
        keuze = 4;
        System.out.println(keuze);

    }

    public void min(View v) {
        keuze = 6;
        System.out.println(keuze);

    }


    public void klik(View v) {




        Button submit = (Button) findViewById(R.id.submit);
        EditText getal1 = (EditText) findViewById(R.id.getal1);
        EditText getal2 = (EditText) findViewById(R.id.getal2);
        TextView uitkomst = (TextView) findViewById(R.id.uitkomst);




        int waardengetal1 = Integer.parseInt(getal1.getText().toString());
        int waardengetal2 = Integer.parseInt(getal2.getText().toString());


        if (keuze == 2) {
            int som = waardengetal1 + waardengetal2;
            String u_som = Integer.toString(som);
            uitkomst.setText(u_som);
        } else if (keuze == 4) {
            int som = waardengetal1 * waardengetal2;
            String u_som = Integer.toString(som);
            uitkomst.setText(u_som);
        } else if (keuze == 6) {
            int som = waardengetal1 - waardengetal2;
            String u_som = Integer.toString(som);
            uitkomst.setText(u_som);
        }


        System.out.println(keuze);


    }










}
