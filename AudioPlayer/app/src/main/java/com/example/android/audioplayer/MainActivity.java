package com.example.android.audioplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Playbutton = (Button) findViewById(R.id.play_button);
        Playbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View View) {
             Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();

            }
        });

        Button Pausebutton = (Button) findViewById(R.id.pause_button);
        Pausebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View View) {
                Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
