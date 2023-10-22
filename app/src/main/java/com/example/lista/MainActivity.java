package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lista.Adapters.AgenteAdapter;
import com.example.lista.Models.Agente;
import com.example.lista.Models.Rol;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Agente> agentes=new ArrayList<>();
        agentes.add(new Agente("jett", "20",new Rol("duelista")));
        agentes.add(new Agente("omen", "28",new Rol("controlador")));
        agentes.add(new Agente("sage", "25",new Rol("centinela")));
        AgenteAdapter ag=new AgenteAdapter(agentes);
        RecyclerView rv=(RecyclerView) findViewById(R.id.recy);
        rv.setAdapter(ag);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}