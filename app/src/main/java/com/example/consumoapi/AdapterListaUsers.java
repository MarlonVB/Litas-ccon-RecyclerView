package com.example.consumoapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListaUsers extends RecyclerView.Adapter<AdapterListaUsers.ViewHolder> {

    private List<Persona> listaPersonas;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterListaUsers(List<Persona> listaPersonas, Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.listaPersonas = listaPersonas;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_lista, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(listaPersonas.get(position));
        holder.nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick
                Toast.makeText(context, holder.nombre.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;

        ViewHolder (View view){
            super(view);
            nombre = view.findViewById(R.id.nombreUsuario);
        }

        void bindData (final Persona item){
            nombre.setText(item.getNombre());
        }
    }
}
