package com.example.calculadoramaterias;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText M1p1,M1p2,M1p3,M2p1,M2p2,M2p3,M3p1,M3p2,M3p3,M4p1,M4p2,M4p3,M5p1,M5p2,M5p3,M6p1,M6p2,M6p3,M7p1,M7p2,M7p3,M8p1,M8p2,M8p3,M9p1,M9p2,
            M9p3,M10p1,M10p2,M10p3;

    public TextView proba,fisica,quimica,ingles,ojp,map,ss,isb,lpti,pi,par1,par2,par3,pTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M1p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M1p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M2p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M2p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M2p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M3p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M3p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M3p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M4p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M4p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M4p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M5p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M5p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M5p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M6p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M6p2= (EditText)findViewById(R.id.txt_Mat1_P2);
        M6p3= (EditText)findViewById(R.id.txt_Mat1_P3);
        M7p1= (EditText)findViewById(R.id.txt_Mat1_P1);
        M7p2= (EditText) findViewById(R.id.txt_Mat1_P2);
        M7p3= (EditText) findViewById(R.id.txt_Mat1_P3);
        M8p1= (EditText) findViewById(R.id.txt_Mat1_P1);
        M8p2= (EditText) findViewById(R.id.txt_Mat1_P2);
        M8p3= (EditText) findViewById(R.id.txt_Mat1_P3);
        M9p1= (EditText) findViewById(R.id.txt_Mat1_P1);
        M9p2= (EditText) findViewById(R.id.txt_Mat1_P2);
        M9p3= (EditText) findViewById(R.id.txt_Mat1_P3);
        M10p1= (EditText) findViewById(R.id.txt_Mat10_P1);
        M10p2= (EditText) findViewById(R.id.txt_Mat10_P2);
        M10p3= (EditText) findViewById(R.id.txt_Mat10_P3);
        proba= (TextView)findViewById(R.id.proba);
        fisica= (TextView)findViewById(R.id.fisica);
        quimica= (TextView)findViewById(R.id.quimica);
        ingles= (TextView)findViewById(R.id.ingles);
        ojp= (TextView)findViewById(R.id.ojp);
        map= (TextView)findViewById(R.id.map);
        ss= (TextView)findViewById(R.id.ss);
        isb= (TextView)findViewById(R.id.isb);
        lpti= (TextView)findViewById(R.id.lpti);
        pi= (TextView) findViewById(R.id.pi);
        par1= (TextView) findViewById(R.id.p1);
        par2= (TextView) findViewById(R.id.p2);
        par3= (TextView) findViewById(R.id.p3);
        pTotal = (TextView) findViewById(R.id.pTotal);

        Button promediar = (Button) findViewById(R.id.btnPromediar);
        promediar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double M1p1d=Double.parseDouble(M1p1.getText().toString());
                double M1p2d=Double.parseDouble(M1p2.getText().toString());
                double M1p3d=Double.parseDouble(M1p3.getText().toString());
                double M2p1d=Double.parseDouble(M2p1.getText().toString());
                double M2p2d=Double.parseDouble(M2p2.getText().toString());
                double M2p3d=Double.parseDouble(M2p3.getText().toString());
                double M3p1d=Double.parseDouble(M3p1.getText().toString());
                double M3p2d=Double.parseDouble(M3p2.getText().toString());
                double M3p3d=Double.parseDouble(M3p3.getText().toString());
                double M4p1d=Double.parseDouble(M4p1.getText().toString());
                double M4p2d=Double.parseDouble(M4p2.getText().toString());
                double M4p3d=Double.parseDouble(M4p3.getText().toString());
                double M5p1d=Double.parseDouble(M5p1.getText().toString());
                double M5p2d=Double.parseDouble(M5p2.getText().toString());
                double M5p3d=Double.parseDouble(M5p3.getText().toString());
                double M6p1d=Double.parseDouble(M6p1.getText().toString());
                double M6p2d=Double.parseDouble(M6p2.getText().toString());
                double M6p3d=Double.parseDouble(M6p3.getText().toString());
                double M7p1d=Double.parseDouble(M7p1.getText().toString());
                double M7p2d=Double.parseDouble(M7p2.getText().toString());
                double M7p3d=Double.parseDouble(M7p3.getText().toString());
                double M8p1d=Double.parseDouble(M8p1.getText().toString());
                double M8p2d=Double.parseDouble(M8p2.getText().toString());
                double M8p3d=Double.parseDouble(M8p3.getText().toString());
                double M9p1d=Double.parseDouble(M9p1.getText().toString());
                double M9p2d=Double.parseDouble(M9p2.getText().toString());
                double M9p3d=Double.parseDouble(M9p3.getText().toString());
                double M10p1d=Double.parseDouble(M10p1.getText().toString());
                double M10p2d=Double.parseDouble(M10p2.getText().toString());
                double M10p3d=Double.parseDouble(M10p3.getText().toString());

                double promPar1 = (M1p1d+M2p1d+M3p1d+M4p1d+M5p1d+M6p1d+M7p1d+M8p1d+M9p1d+M10p1d)/10;
                double promPar2 = (M1p2d+M2p2d+M3p2d+M4p2d+M5p2d+M6p2d+M7p2d+M8p2d+M9p2d+M10p2d)/10;
                double promPar3 = (M1p3d+M2p3d+M3p3d+M4p3d+M5p3d+M6p3d+M7p3d+M8p3d+M9p3d+M10p3d)/10;

                double promMat1 = (M1p1d+M1p2d+M1p3d)/3;
                double promMat2 = (M2p1d+M2p2d+M2p3d)/3;
                double promMat3 = (M3p1d+M3p2d+M3p3d)/3;
                double promMat4 = (M4p1d+M4p2d+M4p3d)/3;
                double promMat5 = (M5p1d+M5p2d+M5p3d)/3;
                double promMat6 = (M6p1d+M6p2d+M6p3d)/3;
                double promMat7 = (M7p1d+M7p2d+M7p3d)/3;
                double promMat8 = (M8p1d+M8p2d+M8p3d)/3;
                double promMat9 = (M9p1d+M9p2d+M9p3d)/3;
                double promMat10 = (M10p1d+M10p2d+M10p3d)/3;

                double ptotal = (promPar1+promPar2+promPar3)/3;

                proba.setText(String.valueOf(promMat1));
                fisica.setText(String.valueOf(promMat2));
                quimica.setText(String.valueOf(promMat3));
                ingles.setText(String.valueOf(promMat4));
                ojp.setText(String.valueOf(promMat5));
                map.setText(String.valueOf(promMat6));
                ss.setText(String.valueOf(promMat7));
                isb.setText(String.valueOf(promMat8));
                lpti.setText(String.valueOf(promMat9));
                pi.setText(String.valueOf(promMat10));
                pTotal.setText(String.valueOf(ptotal));
                par1.setText(String.valueOf(promPar1));
                par2.setText(String.valueOf(promPar2));
                par3.setText(String.valueOf(promPar3));

                if(promMat1<59.9){
                    proba.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat2<59.9){
                    fisica.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat3<59.9){
                    quimica.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat4<59.9){
                    ingles.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat5<59.9){
                    ojp.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat6<59.9){
                    map.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat7<59.9){
                    ss.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat8<59.9){
                    isb.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat9<59.9){
                    lpti.setTextColor(Color.parseColor("#FF0000"));
                }if(promMat10<59.9){
                    pi.setTextColor(Color.parseColor("#FF0000"));
                }if(promPar1<59.9){
                    par1.setTextColor(Color.parseColor("#FF0000"));
                }if(promPar2<59.9){
                    par2.setTextColor(Color.parseColor("#FF0000"));
                }if(promPar3<59.9){
                    par3.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });


    }
}