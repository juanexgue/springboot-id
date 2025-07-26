package com.juanex.springboot_id.services;

import java.util.List;
import com.juanex.springboot_id.models.Productos;

public interface ProductosServicios {

    List<Productos> findAll();

    Productos buscarId(long idProducto);
}
