package com.juanex.springboot_id.repositorios;

import java.util.List;
import com.juanex.springboot_id.models.Productos;

public interface ProductoRepositorio {

    List<Productos> findAll();

    Productos buscarId(long idProducto);
}
