package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.MainActivity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double n1;
    Double n2;
    Double resFinal;

    int nOperacion;

    public void resultadoGenerado(View view){

        TextView tv = findViewById(R.id.pantalla);
        n2= Double.parseDouble(tv.getText().toString());

        switch (nOperacion){
            case 1: resFinal= n1 + n2; break;
            case 2: resFinal= n1 - n2;break;
            case 3: resFinal= n1 * n2;break;
            case 4: resFinal= n1 / n2;break;

        }
        Intent intent = new Intent(this,PantallaResultado.class);
        String message = resFinal.toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void guardarN1 (View view){
        TextView tv = findViewById(R.id.pantalla);
        n1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    /**
     * Métodos operaciones
     * @param view
     */

    public void botonSuma (View view){
        nOperacion = 1;
        guardarN1(view);
    }

    public void botonResta (View view){
        nOperacion = 2;
        guardarN1(view);
    }

    public void botonMultiplicacion (View view){
        nOperacion = 3;
        guardarN1(view);
    }

    public void botonDivision (View view){
        nOperacion = 4;
        guardarN1(view);
    }

    public void botonBorrarTodo(View view){
        n1 = 0.0;
        n2 = 0.0;
        TextView tv = findViewById(R.id.pantalla);
        tv.setText("");
    }

    public void borrarUltimo (View view){
        TextView tv = findViewById(R.id.pantalla);
        String str = tv.getText().toString();
        str = str.substring(0, str.length()-1);
        tv.setText(str.toString());
    }

    public void btnUno (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "1");
    }
    public void btnDos (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "2");
    }
    public void btnTres (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "3");
    }
    public void btnCuatro (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "4");
    }
    public void btnCinco (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "5");
    }
    public void btnSeis (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "6");
    }
    public void btnSiete (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "7");
    }
    public void btnOcho (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "8");
    }
    public void btnNueve (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "9");
    }
    public void btnCero (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "0");
    }
    public void btnPunto (View view){
        TextView tv = findViewById(R.id.pantalla);
        tv.setText(tv.getText() + ".");
    }

}