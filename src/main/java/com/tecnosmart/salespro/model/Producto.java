package com.tecnosmart.salespro.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    private int serialProductos;
    private String nombre;
    private String descripcion;
    private double precio;
    private String proveedoresNitProveedor;

    private Producto() {
    }

    public static Producto createProducto() {
        return new Producto();
    }

    // Getters y Setters

    public int getSerialProductos() {
        return serialProductos;
    }

    public void setSerialProductos(int serialProductos) {
        this.serialProductos = serialProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedoresNitProveedor() {
        return proveedoresNitProveedor;
    }

    public void setProveedoresNitProveedor(String proveedoresNitProveedor) {
        this.proveedoresNitProveedor = proveedoresNitProveedor;
    }
}

