package com.example.ayeshjayasekara1.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Landing extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Button btnSum =(Button)findViewById(R.id.button);
        final TextView txt = (TextView)findViewById(R.id.text100);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int s1=Integer.parseInt(edt1.getText().toString());
                //int s2=Integer.parseInt(edt2.getText().toString());

                //int s3= s1 + s2;

                Toast.makeText(getApplicationContext(),String.valueOf("33"),Toast.LENGTH_LONG).show();
                txt.setText("Heloo Machan!!!!");
            }
        });
    }




    @Override
    public void onClick(View v) {

    }
}
