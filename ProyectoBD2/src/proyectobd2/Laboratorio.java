
package proyectobd2;


import org.bson.Document;

/**
 *
 * @author jaram
 */
public class Laboratorio {

    String id;
    String nombre;

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
                .append("NombreL", this.nombre);

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