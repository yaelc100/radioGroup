package com.example.user.radiogroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
LinearLayout rdgr;
RadioButton rdbtn1,rdbtn2,rdbtn3;
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdgr=(LinearLayout)findViewById(R.id.rdgr);
        rdbtn1=(RadioButton)findViewById(R.id.rdbtn1);
        rdbtn2=(RadioButton)findViewById(R.id.rdbtn2);
        rdbtn3=(RadioButton)findViewById(R.id.rdbtn3);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);


    }


    public void ClickC(View view) {
        if(rdbtn1.isChecked())
            rdgr.setBackgroundColor(Color.GREEN);
        if(rdbtn2.isChecked())
            rdgr.setBackgroundColor(Color.RED);
        if(rdbtn3.isChecked())
            rdgr.setBackgroundColor(Color.BLUE);



    }

    public void Click(View view) {
        rdgr.setBackgroundColor(Color.WHITE);
    }
}
