package com.example.itmaster.ejercicio_criptomonedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BitcoinActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoin);
    }

    public void calcularBitcoin(View view)
    {
        double cotizacion = 220000;
        EditText pesos = findViewById(R.id.pesos);
        double valorPesos = Double.valueOf(pesos.getText().toString());
        double valorBitcoin = valorPesos/cotizacion;
        String mensaje = "Podes comprar " + valorBitcoin + " Bitcoins";

        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();

    }
}
