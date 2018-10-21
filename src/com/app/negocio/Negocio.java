package com.app.negocio;

import com.app.entidad.Producto;

public class Negocio {

    public double obtenerIGV(Producto producto) {
        double igv = producto.getPrecio() * 0.18;
        return igv;
    }
}
