package com.example.questo4_pdm;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResumoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        String nome = getIntent().getStringExtra("nome");
        String lanche = getIntent().getStringExtra("lanche");

        TextView txtResumo = findViewById(R.id.txtResumo);
        txtResumo.setText("Pedido de " + nome + ":\n" + lanche);

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(ResumoActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa pilha
            startActivity(intent);
        });
    }
}