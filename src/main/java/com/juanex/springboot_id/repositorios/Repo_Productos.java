package com.juanex.springboot_id.repositorios;

import java.util.Arrays;
import java.util.List;

import com.juanex.springboot_id.models.Productos;

public class Repo_Productos {

    List<Productos> datos;

    public Repo_Productos() {
        this.datos = Arrays.asList(
                new Productos(001L, "Disco duro", 50),
                new Productos(002L, "Memoria Ram", 150));

    }

    public List<Productos> findAll() {
        return datos;
    }

    public Productos buscarId(long idProducto) {
        return datos.stream()
                .filter(p -> p.getIdProducto()
                        .equals(idProducto))
                .findFirst().orElseThrow();
    }
}
