package com.example.hilosv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
    }

    public void btnOnClick(View v){
        Rhilo r= new Rhilo(this);
       Thread h= new Thread(r);

       h.start();
       /* tv.setVisibility(View.INVISIBLE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tv.setVisibility(View.VISIBLE);
        */

    }
}