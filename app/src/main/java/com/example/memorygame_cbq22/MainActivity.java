package com.example.memorygame_cbq22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Button_SinglePlayer, Button_MultiPlayers, Button_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remoção da ActionBar e da TittleBar - (A barra "roxa" do topo):
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide(); //Essa linha oculta a ActionBar

        setContentView(R.layout.activity_main);

        Button_SinglePlayer = findViewById(R.id.Button_SinglePlayer);
        Button_MultiPlayers = findViewById(R.id.Button_MultiPlayers);
        //Button_Home = (Button) findViewById(R.id.Button_Home);

    }

    public void Button_SinglePlayer(View view){
        Button_SinglePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SinglePlayerActivity.class);
                startActivity(intent);
            }
        });
        }

    public void Button_MultiPlayers(View view){
        Button_MultiPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MultiPlayersActivity.class);
                startActivity(intent);
            }
        });


    }

}