package com.example.eventoonclickV1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.eventoonclickconif.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnClaseAnonima);
        btn2 = findViewById(R.id.btnImplements);



    }

    public void eventoBoton(View view) {

        if (view.getId()==btn1.getId()){

            Toast.makeText(this, "Metodo Onclick desde el botón anonimo", Toast.LENGTH_SHORT).show();
        }

        if (view.getId()==btn2.getId()){

            Toast.makeText(this, "Metodo Onclick desde el botón implements", Toast.LENGTH_SHORT).show();
        }

        if (view.getId()==R.id.btnOnclick)

        Toast.makeText(this, "Metodo Onclick", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

    }
}
