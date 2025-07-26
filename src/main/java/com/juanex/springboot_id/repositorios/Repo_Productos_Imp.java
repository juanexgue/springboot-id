package com.juanex.springboot_id.repositorios;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.juanex.springboot_id.models.Productos;

@Component
public class Repo_Productos_Imp implements ProductoRepositorio {

    List<Productos> datos;

    public Repo_Productos_Imp() {
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
