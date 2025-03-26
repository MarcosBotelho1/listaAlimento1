package com.example.listaalimento;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lista); // criar a lista de itens

        Alimento banana = new Alimento("Banana",
                "89 Kcal", "100g", "banana");
        Alimento maca = new Alimento("Maçã",
                "52 Kcal", "100g", "maca");
        Alimento laranja = new Alimento("Laranja",
                "47 Kcal", "100g", "laranja");
        Alimento uva = new Alimento("Uva",
                "69 Kcal", "100g", "uva");
        Alimento abacaxi = new Alimento("Abacaxi",
                "50 Kcal", "100g", "abacaxi");
        Alimento manga = new Alimento("Manga",
                "60 Kcal", "100g", "manga");
        Alimento melancia = new Alimento("Melancia",
                "30 Kcal", "100g", "melancia");


        ArrayList<Alimento> alimentos = new ArrayList<>();
        alimentos.add(banana);
        alimentos.add(maca);
        alimentos.add(laranja);
        alimentos.add(uva);
        alimentos.add(abacaxi);
        alimentos.add(manga);
        alimentos.add(melancia);


        ListaAdapter adapter = new ListaAdapter(this, R.layout.layout_lista, alimentos);
        lista.setAdapter(adapter);

    }
}