package com.example.consumoapi.interfaces;

import com.example.consumoapi.Proveedor;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProveedorAPI {

    //http://localhost:9090/proveedor/listar

    @GET("proveedor/listar")
    public Call<Proveedor> listar();
}
