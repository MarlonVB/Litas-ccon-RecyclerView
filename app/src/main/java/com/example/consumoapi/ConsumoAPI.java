package com.example.consumoapi;

import android.content.Context;
import android.widget.Toast;

import com.example.consumoapi.interfaces.ProveedorAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConsumoAPI {

    private Context context;
    private String endPoint;
    private String URL_API;

    public ConsumoAPI(Context context) {
        this.context = context;
        this.URL_API = "http://192.168.0.104:9090/"; //192.168.0.104
    }

    public void listar(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(this.URL_API).addConverterFactory(GsonConverterFactory.create()).build();
        ProveedorAPI proveedorAPI = retrofit.create(ProveedorAPI.class);
        Call<Proveedor> call= proveedorAPI.listar();
        call.enqueue(new Callback<Proveedor>() {
            @Override
            public void onResponse(Call<Proveedor> call, Response<Proveedor> response) {
                try {

                    if (response.isSuccessful()){
                        Proveedor proveedor = response.body();
                        System.out.println("NOMBRE: " + proveedor.getNombre());
                        System.out.println("APELLIDO: " + proveedor.getApellido());
                        System.out.println("EMAIL: " + proveedor.getEmail());
                        System.out.println("TELEFONO: " + proveedor.getTelefono());
                        System.out.println("DIRECCION: " + proveedor.getDireccion());
                        System.out.println("EXPERIENCIA: " + proveedor.getAnios_exp());
                    }

                }catch (Exception ex){
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_LONG).show();
                    System.out.println("ESTO ES UN ERROR " + ex.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Proveedor> call, Throwable t) {
                System.out.println("ERROR DE TIPO: "+ t.getMessage());
                Toast.makeText(context, "ERROR DE TIPO: "+ t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
