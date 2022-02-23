package com.stefane.sorteio; // Define onde está o MainActivity.java

// Importa recursos para serem utilizados no programa
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

// Classe: estrutura de código e dentro dela são definidas algumas ações
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Essa ação é executada quando clico no botão "CLIQUE AQUI"
    public void sortearNumero(View view){
        Random random = new Random(); // Instancia um objeto da classe Random
        int numero = random.nextInt(11); // Gera números de 0 a 10
        // int numero = new Random().nextInt(11);
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("Número sorteado: " + numero);
    }

}
