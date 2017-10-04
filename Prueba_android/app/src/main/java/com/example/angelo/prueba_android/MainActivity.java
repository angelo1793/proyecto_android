package com.example.angelo.prueba_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etext1,etext2;
    TextView text;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            etext1=(EditText) findViewById(R.id.textInput);
            etext2=(EditText) findViewById(R.id.textInput2);
            text=(TextView) findViewById(R.id.textName);
    }
}
