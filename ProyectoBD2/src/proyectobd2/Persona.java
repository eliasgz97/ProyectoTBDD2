
package proyectobd2;
import org.bson.Document;

/**
 *
 * @author jaram
 */
public class Persona {

    String id;
    String nombre;

    public Persona(String id) {
        this.id = id;
    }

    public Persona(String id, String nombre) {
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

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public Document toDocument() {
        Document d = new Document();
        d.append("ID Persona", this.id)
                .append("Nombre", this.nombre);

        return d;
    }

    public Document toDocumentName() {
        Document d = new Document();
        d.append("ID Persona", this.id);
        return d;
    }
}