package com.example.angelo.prueba_android;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {
    TextView etext1;
    RadioGroup grupo;
    Spinner spinner;
    ToggleButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        etext1=(TextView) findViewById(R.id.textName2);
        spinner=(Spinner)findViewById(R.id.spinner);
        toggle=(ToggleButton) findViewById(R.id.toggle);
        //Obtenniendo los datos mandados en el putExtra del intent
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
        //Creando la lista de objetos
        List list= new ArrayList();
        list.add("Angelo Sumiano");
        list.add("Bill Gates");
        list.add("Steve Jobs");
        list.add("Mark Zucaritas");
        list.add("Larry Page");
        //Detectndo cambios en el ToggleButton
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(Activity2.this,"ToggleButton selecionado",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(Activity2.this,"ToggleButton apagado",Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Posicion "+String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
