package com.example.lista.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lista.Models.Agente;
import com.example.lista.R;
import java.util.List;

public class AgenteAdapter extends RecyclerView.Adapter<AgenteAdapter.ViewHolder>

{
    private List<Agente> agentes; // Agrega la lista de agentes

    // Constructor para pasar la lista de agentes al adaptador
    public AgenteAdapter(List<Agente> agentes) {
        this.agentes = agentes;
    }

    @NonNull
    @Override
    public AgenteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.agenteitem,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgenteAdapter.ViewHolder holder, int position) {
        Agente a=agentes.get(position);
        holder.setDate(a);
    }

    @Override
    public int getItemCount() {
        return agentes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtedad,txtrol;
        Agente agenteHolder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre=itemView.findViewById(R.id.tvNombre);
            txtedad=itemView.findViewById(R.id.tvedad);
            txtrol=itemView.findViewById(R.id.tvrol);
        }


        public void setDate(Agente a)
        {
         this.agenteHolder=a;
         txtNombre.setText(a.getNombres());
         txtedad.setText(a.getEdad());
         txtrol.setText(a.getRol().getNombre());

        }
    }
}
