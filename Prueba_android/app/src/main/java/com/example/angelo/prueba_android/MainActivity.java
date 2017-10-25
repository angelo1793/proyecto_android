package com.example.angelo.prueba_android;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etext1,etext2;
    TextView text;
    ImageView andy;
    Button buttonP,button1,button2,button3;
    ImageButton buttonImage;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //Creando los objetos y asociandolos al codigo java
            etext1=(EditText) findViewById(R.id.textInput);

            text=(TextView) findViewById(R.id.textName);
            andy=(ImageView) findViewById(R.id.imageP);
            buttonP=(Button) findViewById(R.id.buttonP);
            button1=(Button) findViewById(R.id.button1);
            button2=(Button) findViewById(R.id.button2);
            button3=(Button) findViewById(R.id.button3);
            buttonImage=(ImageButton) findViewById(R.id.ButtonImage);

            //Habilitacion del metodo OnClickListener
            buttonP.setOnClickListener(this);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            andy.setOnClickListener(this);
            buttonImage.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonP:
                String textHint=etext1.getText().toString();
                Intent intent= new Intent(this,Activity2.class);
                intent.putExtra("DATO",textHint);
                startActivity(intent);
                break;
            case R.id.button1:
                text.setText("mi nonmbre cambio :)");
                break;
            case R.id.button2:
                andy.setImageResource(R.drawable.button_image);
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Opcion 3 ", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageP:
                Toast.makeText(getApplicationContext(), "Solo soy una imagen de andy", Toast.LENGTH_LONG).show();
                break;
            case R.id.ButtonImage:
                Toast.makeText(getApplicationContext(),"soy un ImageButton",Toast.LENGTH_LONG);
        }
    }
}
