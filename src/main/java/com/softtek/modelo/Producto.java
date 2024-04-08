package com.softtek.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public void comprobar() throws ProductoExcepcion {
        if (this.idProducto == 0) {
            throw new ProductoExcepcion(nombre + " no tiene un ID asignado.");
        }
    }
}
