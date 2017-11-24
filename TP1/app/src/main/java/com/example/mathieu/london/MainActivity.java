package com.example.mathieu.london;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import static com.example.mathieu.london.R.layout.activity_formulaire;
import static com.example.mathieu.london.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        final Button inscrit = (Button) findViewById(R.id.button3);
        inscrit.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, formulaire.class);
                startActivity(intent);
            }
        });

        android.widget.Button button2 = (android.widget.Button) findViewById(R.id.button2);
        android.widget.Button button3 = (android.widget.Button) findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Peut être une prochaine fois !", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

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
