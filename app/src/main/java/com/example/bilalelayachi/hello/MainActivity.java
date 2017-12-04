package com.example.bilalelayachi.hello;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText getal1;
    EditText getal2;
    TextView uitkomst;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




    }



    public void klik (View v) {

        Button submit = (Button) findViewById(R.id.submit);
        EditText getal1 = (EditText) findViewById(R.id.getal1);
        EditText getal2 = (EditText) findViewById(R.id.getal2);
        TextView uitkomst = (TextView) findViewById(R.id.uitkomst);


        int waardengetal1 = Integer.parseInt(getal1.getText().toString());
        int waardengetal2 = Integer.parseInt(getal2.getText().toString());

        int som = waardengetal1 + waardengetal2;


        String u_som = Integer.toString(som);

        uitkomst.setText(u_som);


        System.out.println("De waarde is " + u_som);


    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
