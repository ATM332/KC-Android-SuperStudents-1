package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ImageButton rockbttn1, paperbttn1, scissorsbttn1, rockbttn2, paperbttn2, scissorsbttn2;
    TextView score1, playerC1, playerC2;
    ImageView im_player1, im_player2;

    int player1score, player2score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        score1 = findViewById(R.id.score1);

        im_player1 = findViewById(R.id.im_player1);
        im_player2 = findViewById(R.id.im_player2);

        rockbttn1 = findViewById(R.id.rockbttn1);
        paperbttn1 = findViewById(R.id.paperbttn1);
        scissorsbttn1 = findViewById(R.id.scissorsbttn1);

        rockbttn2 = findViewById(R.id.rockbttn2);
        paperbttn2 = findViewById(R.id.paperbttn2);
        scissorsbttn2 = findViewById(R.id.scissorsbttn2);

        ImageButton back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(back);
            }
        });


        //player1 buttons

        rockbttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player1.setImageResource(R.drawable.rock);
                String message = turn_play("rock");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));
            }
        });

        paperbttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player1.setImageResource(R.drawable.paper);
                String message = turn_play("paper");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));
            }
        });

        scissorsbttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player1.setImageResource(R.drawable.scissors);
                String message = turn_play("scissors");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));
            }
        });

        rockbttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player2.setImageResource(R.drawable.rock);
                String message = playturn("rock");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));


            }
        });

        paperbttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player2.setImageResource(R.drawable.paper);
                String message = playturn("paper");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));


            }
        });

        scissorsbttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im_player2.setImageResource(R.drawable.scissors);
                String message = playturn("scissors");
                Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
                score1.setText("Score player1: " + Integer.toString(player1score) + " player2: " + Integer.toString(player2score));
                score1.setTextColor(getResources().getColor(R.color.Correct));
            }
        });
    }

    public String turn_play(String player1_choice ){

        String player2_choice="";
        int player2_number=1;

        if(player2_number == 1){
            player2_choice = "rock";
        }else if (player2_number == 2){
            player2_choice = "paper";
        }else if (player2_number == 3){
            player2_choice = "scissors";
        }

        if (player1_choice == player2_choice){
            return "Tie";

        }else if (player1_choice == "rock" && player2_choice == "scissors"){
            player1score++;
            return "rock crushes scissors. player 1 wins!";
        }else if (player1_choice == "paper" && player2_choice == "rock") {
            player1score++;
            return "paper covers rock. player 1 wins!";
        }else if (player1_choice == "scissors" && player2_choice == "paper") {
            player1score++;
            return "scissors cuts paper. player 1 wins!";
        }else if (player1_choice == "scissors" && player2_choice == "rock") {
            player2score++;
            return "rock crushed scissors. player 2 wins!";
        }else if (player1_choice == "rock" && player2_choice == "paper") {
            player2score++;
            return "paper covers rock. player 2 wins!";
        }else if (player1_choice == "paper" && player2_choice == "scissors") {
            player2score++;
            return "scissors cuts paper. player 2 wins!";
        }else return"error";


    }

    public String playturn(String player2_choice ){

        String player1_choice="";
        int player1_number=1;

        if(player1_number == 1){
            player1_choice = "rock";
        }else if (player1_number == 2){
            player1_choice = "paper";
        }else if (player1_number == 3){
            player1_choice = "scissors";
        }

        if (player2_choice == player1_choice){
            return "Tie";

        }else if (player2_choice == "rock" && player1_choice == "scissors"){
            player2score++;
            return "rock crushes scissors. player 2 wins!";
        }else if (player2_choice == "paper" && player1_choice == "rock") {
            player2score++;
            return "paper covers rock. player 2 wins!";
        }else if (player2_choice == "scissors" && player1_choice == "paper") {
            player2score++;
            return "scissors cuts paper. player 2 wins!";
        }else if (player2_choice == "scissors" && player1_choice == "rock") {
            player1score++;
            return "rock crushed scissors. player 1 wins!";
        }else if (player2_choice == "rock" && player1_choice == "paper") {
            player1score++;
            return "paper covers rock. player 1 wins!";
        }else if (player2_choice == "paper" && player1_choice == "scissors") {
            player1score++;
            return "scissors cuts paper. player 1 wins!";
        }else return"error";


    }
}