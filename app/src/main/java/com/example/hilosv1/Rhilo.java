package com.example.hilosv1;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Rhilo implements Runnable{

    MainActivity actividadPrincipal;
    TextView tv;
    int cont=0;

    public Rhilo(MainActivity ap){
        this.actividadPrincipal=ap;
        tv=actividadPrincipal.findViewById(R.id.tv);
    }

    @Override
    public void run() {
        tv.setText("Hola");
        while(cont<1){
            actividadPrincipal.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(cont%2==0){
                        tv.setVisibility(View.VISIBLE);
                    }else{
                        tv.setVisibility(View.INVISIBLE);
                    }
                }
            });
            cont++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent= new Intent(actividadPrincipal,MainActivity2.class);
        actividadPrincipal.startActivity(intent);
    }
}
