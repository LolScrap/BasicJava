package com.seaportdevelopers.liudas.basicjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DissplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dissplay_message);

        Intent init = getIntent();
        String mesa = init.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tw = (TextView) findViewById(R.id.textView2);
        tw.setText(mesa);
    }
}
