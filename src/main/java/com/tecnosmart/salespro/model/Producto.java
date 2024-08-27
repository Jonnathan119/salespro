package com.tecnosmart.salespro.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.SessionListener;

import java.security.Principal;
import java.util.Iterator;

@Entity
public class Producto implements Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long serialProductos;
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

    public long getSerialProductos() {
        return serialProductos;
    }

    public void setSerialProductos(long serialProductos) {
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

    @Override
    public String getAuthType() {
        return "";
    }

    @Override
    public void setAuthType(String authType) {

    }

    @Override
    public long getCreationTime() {
        return 0;
    }

    @Override
    public long getCreationTimeInternal() {
        return 0;
    }

    @Override
    public void setCreationTime(long time) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getIdInternal() {
        return "";
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public void setId(String id, boolean notify) {

    }

    @Override
    public long getThisAccessedTime() {
        return 0;
    }

    @Override
    public long getThisAccessedTimeInternal() {
        return 0;
    }

    @Override
    public long getLastAccessedTime() {
        return 0;
    }

    @Override
    public long getLastAccessedTimeInternal() {
        return 0;
    }

    @Override
    public long getIdleTime() {
        return 0;
    }

    @Override
    public long getIdleTimeInternal() {
        return 0;
    }

    @Override
    public Manager getManager() {
        return null;
    }

    @Override
    public void setManager(Manager manager) {

    }

    @Override
    public int getMaxInactiveInterval() {
        return 0;
    }

    @Override
    public void setMaxInactiveInterval(int interval) {

    }

    @Override
    public void setNew(boolean isNew) {

    }

    @Override
    public Principal getPrincipal() {
        return null;
    }

    @Override
    public void setPrincipal(Principal principal) {

    }

    @Override
    public HttpSession getSession() {
        return null;
    }

    @Override
    public void setValid(boolean isValid) {

    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void access() {

    }

    @Override
    public void addSessionListener(SessionListener listener) {

    }

    @Override
    public void endAccess() {

    }

    @Override
    public void expire() {

    }

    @Override
    public Object getNote(String name) {
        return null;
    }

    @Override
    public Iterator<String> getNoteNames() {
        return null;
    }

    @Override
    public void recycle() {

    }

    @Override
    public void removeNote(String name) {

    }

    @Override
    public void removeSessionListener(SessionListener listener) {

    }

    @Override
    public void setNote(String name, Object value) {

    }

    @Override
    public void tellChangedSessionId(String newId, String oldId, boolean notifySessionListeners, boolean notifyContainerListeners) {

    }

    @Override
    public boolean isAttributeDistributable(String name, Object value) {
        return false;
    }
}

