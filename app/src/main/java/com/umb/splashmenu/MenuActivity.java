package com.umb.splashmenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MenuActivity extends AppCompatActivity {
    Button btn_umb_page;
    Button btn_search_page;
    Button btn_messages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu);
        btn_umb_page=(Button)findViewById(R.id.btn_umb_page);
        btn_search_page=(Button)findViewById(R.id.btn_search_page);
        btn_messages=(Button)findViewById(R.id.btn_messages);
        btn_umb_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this,
                        Paginaumb.class);
                MenuActivity.this.startActivity(myIntent);
            }
        });
        btn_search_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this,
                        BuscarWebActivity.class);
                MenuActivity.this.startActivity(myIntent);
            }
        });
        btn_messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this,
                        FormularioActivity.class);
                MenuActivity.this.startActivity(myIntent);
            }
        });
    }
}