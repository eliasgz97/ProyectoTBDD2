
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

    public Producto(String id) {
        this.id = id;
    }

    public Producto(String id, String nombre,String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo= tipo;
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
        d.append("IdP", this.id)
                .append("NombreP", this.nombre)
                    .append("Tipo",this.tipo);

        return d;
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("IdP", this.id);
        return d;
    }
}