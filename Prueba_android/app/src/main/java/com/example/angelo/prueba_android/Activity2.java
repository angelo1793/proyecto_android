package com.example.angelo.prueba_android;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    TextView etext1;
    RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //Obtenniendo los datos mandados en el putExtra del intent
        etext1=(TextView) findViewById(R.id.textName2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if (bundle!=null){
            String cadena=(String) bundle.get("DATO");
            etext1.setText(cadena);
        }
        //Interectuando con el radio group
        grupo=(RadioGroup) findViewById(R.id.rGroup);
        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i==R.id.rButton1){
                    Toast.makeText(getApplicationContext(),"Opcion 1",Toast.LENGTH_LONG).show();
                }else if (i==R.id.rButton2){
                    Toast.makeText(getApplicationContext(),"Opcion 2",Toast.LENGTH_LONG).show();
                }else if (i==R.id.rButton3){
                    Toast.makeText(getApplicationContext(),"Opcion 3",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
