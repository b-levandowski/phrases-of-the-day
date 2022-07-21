package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generatePhrase(View view){
        String[] phrases = {
                "Que dia lindo!",
                "O sol só não brilha mais que você!",
                "A persistência é o caminho do êxito.",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
                "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação."
        };

        int randomlyGeneratedNumber = new Random().nextInt(phrases.length);
        TextView sentenceView = findViewById(R.id.sentenceView);
        sentenceView.setText(phrases[randomlyGeneratedNumber]);
    }
}
