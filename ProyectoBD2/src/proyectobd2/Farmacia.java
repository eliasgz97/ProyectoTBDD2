/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author jaram
 */
public class Farmacia {

    String id;
    String nombre;
    String direccion;
    ArrayList<Producto> productos= new ArrayList();
    ArrayList<Persona> farmaceuticos = new ArrayList();
    ArrayList<Persona> propietarios = new ArrayList();
    public Farmacia(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        
    }

    public ArrayList<Persona> getFarmaceuticos() {
        return farmaceuticos;
    }

    public void setFarmaceuticos(ArrayList<Persona> farmaceuticos) {
        this.farmaceuticos = farmaceuticos;
    }

    public ArrayList<Persona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Persona> propietarios) {
        this.propietarios = propietarios;
    }
    public Farmacia() {
        
    }
    
    public Farmacia(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDicreccion() {
        return direccion;
    }

    public void setDicreccion(String dicreccion) {
        this.direccion = dicreccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void addProducto(Producto e){
        productos.add(e);
    }
    

    @Override
    public String toString() {
        return "Farmacia{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + '}';
    }
    


    public Document toDocument() {
        Document d = new Document();
        d.append("NombreF", this.nombre)
                .append("IdF", this.id)
                    .append("Direccion",this.direccion)
                        .append("Productos",this.productos)
                            .append("Farmaceuticos", this.farmaceuticos)
                                .append("Propietarios", this.propietarios);

        return d;
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("IdF", this.id);
        return d;
    }
}
