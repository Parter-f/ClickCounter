package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView szamlalo;
    private Button pluszgomb;
    private Button minusgomb;
    private int szam;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){

        szamlalo = findViewById(R.id.szamlalo);
        pluszgomb = findViewById(R.id.pluszgomb);
        minusgomb = findViewById(R.id.minusgomb);

        pluszgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam++;
                szamlalo.setText(Integer.toString(szam));
                if(szam > 0){
                    szamlalo.setTextColor(Color.GREEN);

                }
                else if (szam < 0){
                    szamlalo.setTextColor(Color.rgb(255 , 0 ,0));
                }
                else{
                    szamlalo.setTextColor(Color.BLUE);
                }


            }
        });
        minusgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam--;
                szamlalo.setText(Integer.toString(szam));
                if(szam > 0){
                    szamlalo.setTextColor(Color.GREEN);
                }
                else if (szam < 0){
                    szamlalo.setTextColor(Color.rgb(255 , 0 ,0));
                }
                else{
                    szamlalo.setTextColor(Color.BLUE);

                }

            }
        });
       // szamlalo.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
         //       szam = 0;
          //      szamlalo.setText(Integer.toString(szam));
         //       szamlalo.setTextColor(Color.BLUE);
         //   }
        //});

        szamlalo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                szam = 0;
                szamlalo.setText(Integer.toString(szam));
                szamlalo.setTextColor(Color.BLUE);
                return false;

            }
        });





    }

}