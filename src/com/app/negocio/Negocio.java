package com.app.negocio;

import com.app.entidad.Producto;

import java.util.ArrayList;
import java.util.List;

public class Negocio {

    public double obtenerIGV(Producto producto) {
        double igv = producto.getPrecio() * 0.18;
        return igv;
    }

    public List<Producto> obtenerCatalogo(){
        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto();
        producto1.setPrecio(10);
        producto1.setDescripcion("Alfajor");
        producto1.setCodigo(101);
        Producto producto2 = new Producto();
        producto2.setPrecio(1);
        producto2.setDescripcion("Caramelo");
        producto2.setCodigo(102);
        productos.add(producto1);
        productos.add(producto2);
        return productos;

    }
}
