package com.example.sendbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendOutBroadcast(View view) {
        Intent I = new Intent();
        I.setAction("com.example.sendbroadcast");
        I.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
    }
}
