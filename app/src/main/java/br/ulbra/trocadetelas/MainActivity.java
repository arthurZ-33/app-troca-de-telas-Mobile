package br.ulbra.trocadetelas;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    Button btnTela2, btnTelaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregarTelaPrincipal();
    }

    public void carregarTelaPrincipal(){
        setContentView(R.layout.activity_main);
        btnTela2 = (Button)findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarTela2();
            }
        });
    }

    public void carregarTela2(){
    setContentView(R.layout.tela2);
    btnTelaPrincipal = (Button) findViewById(R.id.btnTelaPrincipal);
    btnTelaPrincipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            carregarTelaPrincipal();
        }
    });
    }

}