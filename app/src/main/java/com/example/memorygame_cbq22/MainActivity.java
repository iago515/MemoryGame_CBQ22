package com.example.memorygame_cbq22;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Button_SinglePlayer, Button_MultiPlayers;
    Button Button_Config, Button_Info, Button_ExitGame;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_options,menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Botão de seleção 1 jogador
    public void Button_SinglePlayer(View view){
        Button_SinglePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SinglePlayerActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Menu_option_language:
                Toast.makeText(MainActivity.this, "Opção LINGUAGEM selecionada", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Menu_option_moreinfo:
                Toast.makeText(MainActivity.this, "Opção MAIS INFORMAÇÕES selecionada", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Menu_option_exit:
                Toast.makeText(MainActivity.this, "Opção SAIR Selecionada", Toast.LENGTH_SHORT).show();
                break;
            }
                return super.onOptionsItemSelected(item);
            }

    //Botão de seleção 2 jogadores
    public void Button_MultiPlayers(View view){
        Button_MultiPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MultiPlayersActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Button_Config(View view){
        Button_Config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    // public void Button_Info(View view){
    //    Button_Config.setOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {

    //        }
    //    });
    //}

    // public void Button_ExitGame(View view){
    //    Button_Config.setOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            Finish();
    //        }
    //    });
    //}

}