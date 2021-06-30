package com.example.saveui26june;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mtxt1;
    private Button mbtn;
    private EditText medtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtn = findViewById(R.id.btn);
        mtxt1 = findViewById(R.id.txt1);
        medtxt = findViewById(R.id.edtxt);
        medtxt.addTextChangedListener(textWatcher);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtxt1.setText("ButtonClicked");
            }
        });
    }

         private TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("Tag","Characters"+s+"start"+start+"count"+count+"after"+after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("Tag","Characters"+s+"start"+start+"before"+before+"count"+count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Tag", s.toString());
                if(s.toString().length()>=6) {
                    Toast.makeText(MainActivity.this,"entered characters",Toast.LENGTH_SHORT).show();
                }
            }
        };




    }

