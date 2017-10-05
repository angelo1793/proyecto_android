package com.example.angelo.prueba_android;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etext1,etext2;
    TextView text;
    ImageView andy;
    Button buttonP,button1,button2,button3;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //Creando los objetos y asociandolos al codigo java
            etext1=(EditText) findViewById(R.id.textInput);
            etext2=(EditText) findViewById(R.id.textInput2);
            text=(TextView) findViewById(R.id.textName);
            andy=(ImageView) findViewById(R.id.imageP);
            buttonP=(Button) findViewById(R.id.buttonP);
            button1=(Button) findViewById(R.id.button1);
            button2=(Button) findViewById(R.id.button2);
            button3=(Button) findViewById(R.id.button3);
            //Habilitacion del metodo OnClickListener
            buttonP.setOnClickListener(this);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            andy.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonP:
                Toast.makeText(getApplicationContext(), "Opcion principal señalada", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "Opcion boton1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Opcion boton2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Opcion boton3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageP:
                Toast.makeText(getApplicationContext(), "Inagen de andy", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
