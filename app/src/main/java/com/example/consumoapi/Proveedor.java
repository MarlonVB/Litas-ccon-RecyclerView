package com.example.consumoapi;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

public class Proveedor extends Persona implements Serializable {

    @SerializedName("anios_exp")
    private Integer anios_exp;

    @SerializedName("usuario")
    Usuario usuario = new Usuario();

    public Proveedor(Long id_persona, String nombre, String apellido, String email, String telefono, String direccion, Integer anios_exp) {
        super(id_persona, nombre, apellido, email, telefono, direccion);
        this.anios_exp = anios_exp;
    }

    public Integer getAnios_exp() {
        return anios_exp;
    }

    public void setAnios_exp(Integer anios_exp) {
        this.anios_exp = anios_exp;
    }
}
