package com.example.asynctasktext.uicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    EditText e1,e2;
    RadioButton r1,r2;
    CheckBox c1,c2;
    String element;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.mail);
        s1 = (Spinner) findViewById(R.id.sp1);
        r1 = (RadioButton) findViewById(R.id.male);
        r2 = (RadioButton) findViewById(R.id.female);
        c1 = (CheckBox) findViewById(R.id.chfi);
        c2 = (CheckBox) findViewById(R.id.chse);
    }


    public void send(View view) {

        element=s1.getSelectedItem().toString();
        StringBuilder sb=new StringBuilder();
        if(r1.isChecked())
        {
            sb.append("male");
        }
        if(r2.isChecked())
        {
            sb.append("female");
        }
        StringBuilder sb2=new StringBuilder();
        if(c1.isChecked())
        {
            sb2.append("first\n");

        }
        if(c2.isChecked())
        {
            sb2.append("second\n");
        }
        Toast.makeText(this,""+e1.getText().toString()+ "\n"+e2.getText().toString()+"\n" +element + "\n"+ sb+"\n"+sb2,Toast.LENGTH_LONG).show();
    }
    }


