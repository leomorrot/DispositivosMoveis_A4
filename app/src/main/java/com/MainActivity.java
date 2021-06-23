package com;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.contagemdeestoque.R;


public class MainActivity {
    int contador;
    Button botao1, botao2;
    TextView caixaDeTexto;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        contador = 0;
        setContentView(R.layout.activity_main);

        botao1 = findViewById(R.id.buttonAdd);
        botao1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               contador++;
           }
        });
        botao2 = findViewById(R.id.buttonSub);
        botao2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador--;
            }
        });
        caixaDeTexto = findViewById(R.id.textView);
        caixaDeTexto.setText(Integer.toString(contador));
    }

}
