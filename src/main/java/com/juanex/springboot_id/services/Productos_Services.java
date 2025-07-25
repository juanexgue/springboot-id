package com.juanex.springboot_id.services;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

import com.juanex.springboot_id.models.Productos;
import com.juanex.springboot_id.repositorios.Repo_Productos;

public class Productos_Services {

    private Repo_Productos repositorio = new Repo_Productos();

    public List<Productos> findAll() {
        return repositorio.findAll().stream().map(p -> {
            Double precioTotal = p.getPrecio() * 1.50d;
            // p.setPrecio(precioTotal.intValue());
            var Producto_nuevoPrecio = new Productos(p.getIdProducto(), p.getNombre(),
                    precioTotal.intValue());
            return Producto_nuevoPrecio;
        }).collect(Collectors.toList());
    }

    public Productos buscarId(long idProducto) {
        return repositorio.buscarId(idProducto);
    }
}
