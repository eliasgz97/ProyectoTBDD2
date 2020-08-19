
package proyectobd2;


import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author jaram
 */
public class Laboratorio {

    String id;
    String nombre;
    ArrayList <Producto> productos = new ArrayList();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Laboratorio(String id) {
        this.id = id;
    }

    public Laboratorio(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
 

    public Document toDocument() {
        Document d = new Document();
        d.append("IdL", this.id)
                .append("NombreL", this.nombre)
                    .append("Productos", this.productos);
        return d;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("IdL", this.id);
        return d;
    }
}