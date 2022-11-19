package com.example.consumoapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//        ConsumoAPI consumoAPI = new ConsumoAPI(this);
//        consumoAPI.listar();
    }

    public void init(){
        personas= new ArrayList<>();

        personas.add(new Persona("Bryan"));
        personas.add(new Persona("Cindy"));
        personas.add(new Persona("Mayra"));

        RecyclerView recyclerView = findViewById(R.id.lista);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        AdapterListaUsers listAdapter = new AdapterListaUsers(personas, this);
        recyclerView.setAdapter(listAdapter);
    }
}