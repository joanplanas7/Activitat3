package com.example.tasca4joanplanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends Activity {
    private Spinner spinner;
    private String retorn;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.intents, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        /*Intent in = new Intent(this, MainActivity.class);
        in.putExtra("missatge", "hola");
        startActivity(in);*/
    }

   public void enrere(View v){
        Intent in = new Intent(this, MainActivity.class);
        in.putExtra("info", retorn);
        startActivity(in);
    }



    public void onClick(View view) {
        int position = spinner.getSelectedItemPosition();
        String info = "";
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.vogella.com/"));
                retorn = "Open Browser";
                break;
            case 1:
                intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:(+49)12345789"));
                retorn = "Dial";
                break;
            case 2:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:50.123,7.1434?z=19"));
                retorn = "Show Map";

                break;
            case 3:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=query"));
                retorn = "Search on Map";
                break;
            case 4:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                retorn = "Take picture";
                break;
            case 5:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/"));
                retorn = "Show contacts";

                break;
            case 6:
                intent = new Intent(Intent.ACTION_EDIT,
                        Uri.parse("content://contacts/people/1"));
                retorn = "Edit first contact";
                break;

        }


        if (intent != null) {
            startActivity(intent);
        }



    }
}