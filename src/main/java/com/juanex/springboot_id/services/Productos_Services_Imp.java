package com.juanex.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;
import com.juanex.springboot_id.models.Productos;
import com.juanex.springboot_id.repositorios.Repo_Productos_Imp;

public class Productos_Services_Imp implements ProductosServicios {

    private Repo_Productos_Imp repositorio = new Repo_Productos_Imp();

    @Override
    public List<Productos> findAll() {
        return repositorio.findAll().stream().map(p -> {
            Double precioTotal = p.getPrecio() * 1.50d;
            var Producto_nuevoPrecio = (Productos) p.clone();
            Producto_nuevoPrecio.setPrecio(precioTotal.intValue());
            return Producto_nuevoPrecio;
        }).collect(Collectors.toList());
    }

    @Override
    public Productos buscarId(long idProducto) {
        return repositorio.buscarId(idProducto);
    }

}
