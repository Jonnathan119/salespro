package com.tecnosmart.salespro.controller;

import com.tecnosmart.salespro.model.Producto;
import com.tecnosmart.salespro.repository.ProductoRepository;
import com.tecnosmart.salespro.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class ProductoController {

    private final ProductoService productoService;
    @Autowired
    private ProductoRepository productoRepository;

    public ProductoController(ProductoService productoService, ProductoRepository productoRepository) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "productos";
    }

    //mapeo de la vista del formulario
    @GetMapping("/productos/nuevo")
    public String mostrarFormularioDeRegistro(Model model) {
        model.addAttribute("producto", Producto.createProducto());
        return "registro_producto";
    }
    //mapeo para guardar un producto en la base de datos
    @PostMapping("/productos/guardar")
    public String guardarProducto(@ModelAttribute Producto producto, Model model) {
        try {
            productoRepository.save(producto);
            return "redirect:/productos";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Error al guardar el producto: " + e.getMessage());
            return "registro_producto";
        }
    }

    //mapeo para editar un producto de la lista
    @GetMapping("/productos/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable("id") int id, Model model) {
        Producto producto = productoService.obtenerProductoPorId(id);
        model.addAttribute("producto", producto);
        return "registro_producto";
    }

    //mapeo para eliminar un producto de la lista
    @GetMapping("/productos/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") int id) {
        productoService.eliminarProducto(id);
        return "redirect:/productos";
    }
}

