package com.example.saludandoapp;
//1. Se importan las librerias necesarias
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //2. Se crean variables de enlace
    EditText nombre;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 3. Se referencian las variables a los elementos creados
        nombre = findViewById(R.id.et_nombre);
        mensaje = findViewById(R.id.tv_mensaje);

    }

    // 4. Se creacion funcion para el click del boton
    public void saludar(View view){
        // Si el nombre esta vacio, se muestra error
        if(nombre.getText().length() == 0){
            nombre.setError("Obligatorio");
            Toast.makeText(this, "Debes ingresar el nombre",Toast.LENGTH_LONG).show();
            // Mostrar mensaje con letras rojas
            mensaje.setTextColor(Color.RED);
            mensaje.setText("NOMBRE OBLIGATORIO");
        } else {
            // capturar datos y enviar mensaje
            mensaje.setTextColor(Color.BLUE);
            mensaje.setText("Hola " + nombre.getText().toString());
        }
    }
}