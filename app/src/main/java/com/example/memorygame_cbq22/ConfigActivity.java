package com.example.memorygame_cbq22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.Locale;

public class ConfigActivity extends AppCompatActivity {

    private Spinner spinner_Languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        spinner_Languages = findViewById(R.id.Spinner_Languages);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.Lista_idiomas, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spinner_Languages.setAdapter(arrayAdapter);
        spinner_Languages.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1){
                    SelecionarIdioma("br");
                    startActivity(new Intent(ConfigActivity.this,MainActivity.class));
                }else if (position == 2){
                    SelecionarIdioma("en");
                    startActivity(new Intent(ConfigActivity.this,MainActivity.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        }

        public void SelecionarIdioma(String Linguagem){
            Locale localidade = new Locale(Linguagem);
            Locale.setDefault(localidade);
            Resources resources = this.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = localidade;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());

        }
    }
