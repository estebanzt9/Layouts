package com.example.dos_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Carrito extends AppCompatActivity {

   Button Mostrar;

   public Carrodos carrito;
   TextView color;
    TextView tamaño;
    TextView peso;
    TextView num_silla;
    TextView año;
    TextView placa;
    TextView kilometraje;
    private Carrodos Carrodos;



    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        Mostrar = findViewById(R.id.Boton_carro);
        color = findViewById(R.id.text1);
        tamaño = findViewById(R.id.texto2);

        num_silla = findViewById(R.id.text4);
        año = findViewById(R.id.text5);
        placa = findViewById(R.id.text6);
        kilometraje = findViewById(R.id.text7);

        Mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color.setText(Carrodos.getColor());
                tamaño.setText(Carrodos.getTamano());
                num_silla.setText(Carrodos.getN_sillas());
                año.setText(Carrodos.getAno());
                placa.setText(Carrodos.getPlaca());
                kilometraje.setText(Carrodos.getKilometraje());
            }



        });


        }




    public void Cambio_inicio(View view){
        Intent c = new Intent(this,MainActivity.class);
        startActivity(c);


    }

}