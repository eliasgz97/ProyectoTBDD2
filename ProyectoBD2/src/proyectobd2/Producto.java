
package proyectobd2;

import org.bson.Document;

/**
 *
 * @author jaram
 */
public class Producto {

    String id;
    String nombre;
    String tipo;
    String precio;

    public Producto(String id) {
        this.id = id;
    }

    public Producto(String id, String nombre,String tipo,String precio) {
        this.id = id;
        this.nombre = nombre;
        this.tipo= tipo;
        this.precio= precio;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }

   
    public Document toDocument() {
        Document d = new Document();
        d.append("IdProducto", this.id)
                .append("NombreProducto", this.nombre)
                    .append("Tipo",this.tipo)
                    .append("Precio", this.precio);

        return d;
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("IdProducto", this.id);
        return d;
    }
}
