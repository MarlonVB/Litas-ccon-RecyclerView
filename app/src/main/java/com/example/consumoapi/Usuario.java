package com.example.consumoapi;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Usuario implements Serializable {
    @SerializedName("usuario_id")
    private Long usuario_id;

    @SerializedName("nombreUsuario")
    private String nombreUsuario;

    @SerializedName("contraseniaUsuario")
    private String contraseniaUsuario;

    public Usuario() {
    }

    public Usuario( String nombreUsuario, String contraseniaUsuario) {

        this.nombreUsuario = nombreUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }
}
