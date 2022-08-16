package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button singlebttn, multibttn;
    private Button createroombttn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singlebttn = findViewById(R.id.single);
        multibttn = findViewById(R.id.multi);
        createroombttn = findViewById(R.id.createroombttn);

        createroombttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        singlebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);


            }
        });

        multibttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent1);
            }
        });




    };

    public void openDialog(){
        CreateRoom createRoom = new CreateRoom();
        createRoom.show(getSupportFragmentManager(),"CreateRoom");
    }
}