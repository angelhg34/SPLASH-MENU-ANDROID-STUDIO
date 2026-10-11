package com.umb.splashmenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MostrarActivity extends AppCompatActivity {
    private TextView txtNombre, txtApellido, txtEdad;
    private Button btnVolverMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        btnVolverMenu = findViewById(R.id.btn_volver_menu);
        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String edad = getIntent().getStringExtra("edad");
        txtNombre.setText("Nombre: " + nombre);
        txtApellido.setText("Apellido: " + apellido);
        txtEdad.setText("Edad: " + edad);

    // Lógica para volver al menú principal
        btnVolverMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarActivity.this, MenuActivity.class);
                // Limpia el historial de pantallas para que al presionar atrás no regrese al formulario
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}