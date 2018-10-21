package com.app.pruebas;

import com.app.entidad.Producto;
import com.app.negocio.Negocio;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PruebaNegocio {

    @Test
    public void pruebaIGV(){
        Producto producto = new Producto();
        producto.setCodigo(54654665);
        producto.setDescripcion("Lomo fino");
        producto.setPrecio(50.00);
        Negocio negocio = new Negocio();
        double igv = negocio.obtenerIGV(producto);
        Assert.assertEquals(9, igv, 0);
    }

    @Test
    public void pruebaCatalogo(){
        Negocio negocio = new Negocio();
        List<Producto> lista = negocio.obtenerCatalogo();
        for(Producto p:lista){
            System.out.println(p.getCodigo() + "  " + p.getDescripcion());
        }
        Assert.assertEquals(2, lista.size());
    }
}
