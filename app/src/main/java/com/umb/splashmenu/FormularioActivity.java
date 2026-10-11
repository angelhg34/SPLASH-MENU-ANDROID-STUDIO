package com.umb.splashmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {
    private EditText nombreInput, apellidoInput, edadInput;
    private Button btnEnviar;
    private TextView txtError; // Declarar el TextView de error

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nombreInput = findViewById(R.id.nombreInput);
        apellidoInput = findViewById(R.id.apellidoInput);
        edadInput = findViewById(R.id.edadInput);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtError = findViewById(R.id.txtError); // Inicializar el TextView

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenemos los textos eliminando espacios en blanco al inicio y final
                String nombre = nombreInput.getText().toString().trim();
                String apellido = apellidoInput.getText().toString().trim();
                String edad = edadInput.getText().toString().trim();

                // Validar si alguno de los campos está vacío
                if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty()) {
                    // Mostrar mensaje de error en pantalla
                    txtError.setText("No se puede enviar ningún dato del formulario vacío.");
                    txtError.setVisibility(View.VISIBLE);
                } else {
                    // Ocultar el error si todo está correcto
                    txtError.setVisibility(View.GONE);

                    // Proceder a enviar los datos a la siguiente pantalla
                    Intent intent = new Intent(FormularioActivity.this, MostrarActivity.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("apellido", apellido);
                    intent.putExtra("edad", edad);
                    startActivity(intent);
                }
            }
        });
    }
}