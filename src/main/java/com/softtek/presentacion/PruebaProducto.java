package com.softtek.presentacion;
import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoExcepcion;

public class PruebaProducto {

        public static void main(String[] args) {
            // Crear un producto con ID
            Producto productoConID = new Producto(1, "Cafetera", 99.99, "Café SA", "Cafetera de última generación");

            // Crear un producto sin ID
            Producto productoSinID = new Producto();
            productoSinID.setNombre("Tostadora");
            productoSinID.setPrecio(49.99);
            productoSinID.setProveedor("Electrodomésticos SA");
            productoSinID.setDescripcion("Tostadora con capacidad para dos rebanadas");

            try {
                productoConID.comprobar();
                System.out.println("El producto con ID ha pasado la comprobación.");
            } catch (ProductoExcepcion e) {
                System.out.println(e.getMessage());
            }

            try {
                // Comprobar el producto sin ID
                productoSinID.comprobar();
            } catch (ProductoExcepcion e) {
                System.out.println("Producto sin ID: " + e.getMessage());
            }
        }
    }


