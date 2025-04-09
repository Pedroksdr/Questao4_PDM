package com.example.questo4_pdm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class FormularioActivity extends AppCompatActivity {

    private String lancheSelecionado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        TextInputEditText editNome = findViewById(R.id.editNome);
        RadioGroup grupoLanches = findViewById(R.id.radioGroupLanches);
        Button btnConfirmar = findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(view -> {
            int idSelecionado = grupoLanches.getCheckedRadioButtonId();
            RadioButton radioSelecionado = findViewById(idSelecionado);
            lancheSelecionado = radioSelecionado.getText().toString();
            String nome = editNome.getText().toString();

            Intent intent = new Intent(FormularioActivity.this, ResumoActivity.class);
            intent.putExtra("nome", nome);
            intent.putExtra("lanche", lancheSelecionado);
            startActivity(intent);
        });
    }
}