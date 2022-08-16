package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView score, computerC, playerC;
    ImageView imcomp, implayer;
    ImageButton rockbttn, paperbttn, scissorsbttn;

    int PlayerScore, ComputerScore =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        score = findViewById(R.id.score);
        computerC = findViewById(R.id.cc);
        playerC = findViewById(R.id.pc);

        imcomp = findViewById(R.id.im_computer);
        implayer = findViewById(R.id.im_player);

        rockbttn = findViewById(R.id.rockbttn);
        paperbttn = findViewById(R.id.paperbttn);
        scissorsbttn = findViewById(R.id.scissorsbttn);

        ImageButton back1 = findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(back1);
            }
        });




        rockbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                implayer.setImageResource(R.drawable.rock);
                String message = play_turn("rock");
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();
                score.setText("Score  player: " + Integer.toString(PlayerScore) + "  Computer: " + Integer.toString(ComputerScore));
                score.setTextColor(getResources().getColor(R.color.Correct));

            }
        });


        paperbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                implayer.setImageResource(R.drawable.paper);
                String message =play_turn("paper");
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();
                score.setText("Score  player: " + Integer.toString(PlayerScore) + "  Computer: " + Integer.toString(ComputerScore));
                score.setTextColor(getResources().getColor(R.color.Correct));

            }
        });


        scissorsbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                implayer.setImageResource(R.drawable.scissors);
                String message =play_turn("scissors");
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();
                score.setText("Score  player: " + Integer.toString(PlayerScore) + "  Computer: " + Integer.toString(ComputerScore));
                score.setTextColor(getResources().getColor(R.color.Correct));


            }
        });


    }

    public String play_turn(String player_choice){

        String computer_choice="";
        Random r = new Random();
        //choose 1 2 or 3
        int computer_choice_number = r.nextInt(3)+1;

        if(computer_choice_number == 1){
            computer_choice = "rock";
        }else if (computer_choice_number == 2){
            computer_choice = "paper";
        }else if (computer_choice_number == 3){
            computer_choice = "scissors";
        }

        //set the computer image based on computer choice
        if (computer_choice == "rock"){
            imcomp.setImageResource(R.drawable.rock);
        }else if (computer_choice == "paper"){
            imcomp.setImageResource(R.drawable.paper);
        }else if (computer_choice == "scissors"){
            imcomp.setImageResource(R.drawable.scissors);
        }

        //compare players choice vs computers choice
        if (computer_choice == player_choice){
            return "Tie";

        }else if (player_choice == "rock" && computer_choice == "scissors"){
            PlayerScore++;
            return "rock crushes scissors. You win!";
        }else if (player_choice == "paper" && computer_choice == "rock") {
            PlayerScore++;
            return "paper covers rock. You wins!";
        }else if (player_choice == "scissors" && computer_choice == "paper") {
            PlayerScore++;
            return "scissors cuts paper. You wins!";
        }else if (player_choice == "scissors" && computer_choice == "rock") {
            ComputerScore++;
            return "rock crushed scissors. Computer wins!";
        }else if (player_choice == "rock" && computer_choice == "paper") {
            ComputerScore++;
            return "paper covers rock. Computer wins!";
        }else if (player_choice == "paper" && computer_choice == "scissors") {
            ComputerScore++;
            return "scissors cuts paper. Computer wins!";
        }else return"error";


    }

}