/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author jaram
 */
public class PersonaConexion {

    Persona persona;

    public PersonaConexion(Persona persona) {
        this.persona = persona;
    }

    public PersonaConexion() {

    }

    public void crearPersona() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Persona");
            collection.insertOne(persona.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerPersonas(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        modelo.setNumRows(0);
        ArrayList<String> persona = new ArrayList();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Persona");
            MongoCursor<org.bson.Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                String principal = "";
                String[] p;
                principal = cursor.next().toString();
                p = principal.split(",");
                for (int i = 0; i < p.length; i++) {
                    String f[] = p[i].split("=");
                    persona.add(f[1]);
                }
                Object[] row = new Object[persona.size()];
                for (int i = 0; i < persona.size(); i++) {
                    if (i == persona.size() - 1) {
                        row[i] = (persona.get(i)).substring(0, persona.get(i).length() - 2);
                    } else {
                        row[i] = persona.get(i);
                    }
                }
                persona.clear();
                modelo.addRow(row);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Document obtenerPersona(Persona persona) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        Document r = new Document();
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Persona");
            Document d = persona.toDocumentName();
            FindIterable<Document> result = collection.find(d);
            r = result.first();
            if (r == null) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public void reemplazarPersona(Document viejo, Document nuevo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Persona");
            collection.replaceOne(viejo, nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarFarmacia(Document viejo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Persona");
            collection.deleteOne(viejo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}