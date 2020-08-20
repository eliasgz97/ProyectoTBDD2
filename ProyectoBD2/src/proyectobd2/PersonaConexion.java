/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author jaram
 */
public class PersonaConexion {

    Persona persona;
    Farmacia farmacia;
    Laboratorio laboratorio;
    Producto producto;
    CodecRegistry pojoCodecRegistry = org.bson.codecs.configuration.CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), org.bson.codecs.configuration.CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    public PersonaConexion(Persona persona) {
        this.persona = persona;
    }

    public PersonaConexion() {

    }

    public PersonaConexion(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public PersonaConexion(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public PersonaConexion(Producto producto) {
        this.producto = producto;
    }

    public void crearPersona() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test").withCodecRegistry(pojoCodecRegistry);
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

    public void updatecb_personas(JComboBox personas) {
        personas.removeAllItems();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection collection = database.getCollection("Persona");
        
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            Document str = cursor.next();
            ArrayList<String> list = new ArrayList();
            list.add((String) str.get("IdP"));
            personas.addItem(list.get(0).toString());
        }
        cursor.close();
    }
        public void updatecb_laboratorios(JComboBox laboratorios) {
        laboratorios.removeAllItems();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection collection = database.getCollection("Laboratorio");
        
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            Document str = cursor.next();
            ArrayList<String> list = new ArrayList();
            list.add((String) str.get("IdL"));
            laboratorios.addItem(list.get(0).toString());
        }
        cursor.close();
    }
    public void updatecb_farmacias (JComboBox farmacias){
            farmacias.removeAllItems();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection collection = database.getCollection("Farmacia");
        
        MongoCursor<Document> cursor = collection.find().iterator();
        while (cursor.hasNext()) {
            Document str = cursor.next();
            ArrayList<String> list = new ArrayList();
            list.add((String) str.get("IdF"));
            farmacias.addItem(list.get(0).toString());
        }
        cursor.close();
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


    public void eliminarPersona(Document viejo) {
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
    
    //---------------------------------------------------------INICIO METODOS DE FARMACIA----------------------------------------------------------------------
    public void crearFarmacia() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test").withCodecRegistry(pojoCodecRegistry);
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Farmacia");
            collection.insertOne(farmacia.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerFarmacia(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        modelo.setNumRows(0);
        ArrayList<String> farmacia = new ArrayList();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Farmacia");
            MongoCursor<org.bson.Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                String principal = "";
                String[] p;
                principal = cursor.next().toString();
                p = principal.split(",");
                for (int i = 0; i < p.length; i++) {
                    String f[] = p[i].split("=");
                    farmacia.add(f[1]);
                }
                Object[] row = new Object[farmacia.size()];
                for (int i = 0; i < farmacia.size(); i++) {
                    if (i == farmacia.size() - 1) {
                        row[i] = (farmacia.get(i)).substring(0, farmacia.get(i).length() - 2);
                    } else {
                        row[i] = farmacia.get(i);
                    }
                }
                farmacia.clear();
                modelo.addRow(row);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Document obtenerFarmacia(Farmacia farmacia) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        Document r = new Document();
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Farmacia");
            Document d = farmacia.toDocumentName();
            FindIterable<Document> result = collection.find(d);
            r = result.first();
            if (r == null) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public void eliminarFarmacia(Document viejo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Farmacia");
            collection.deleteOne(viejo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public void reemplazarFarmacia(Document viejo, Document nuevo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Farmacia");
            collection.replaceOne(viejo, nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void reemplazarLaboratorio(Document viejo, Document nuevo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Laboratorio");
            collection.replaceOne(viejo, nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //-------------------------------------------------------INICIO METODOS DE LABORATORIO----------------------------------------------------------------

    public void crearLaboratorio() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test").withCodecRegistry(pojoCodecRegistry);
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Laboratorio");
            collection.insertOne(laboratorio.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerLaboratorios(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        modelo.setNumRows(0);
        ArrayList<String> laboratorio = new ArrayList();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Laboratorio");
            MongoCursor<org.bson.Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                String principal = "";
                String[] p;
                principal = cursor.next().toString();
                p = principal.split(",");
                for (int i = 0; i < p.length; i++) {
                    String f[] = p[i].split("=");
                    laboratorio.add(f[1]);
                }
                Object[] row = new Object[laboratorio.size()];
                for (int i = 0; i < laboratorio.size(); i++) {
                    if (i == laboratorio.size() - 1) {
                        row[i] = (laboratorio.get(i)).substring(0, laboratorio.get(i).length() - 2);
                    } else {
                        row[i] = laboratorio.get(i);
                    }
                }
                laboratorio.clear();
                modelo.addRow(row);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Document obtenerLaboratorio(Laboratorio laboratorio) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        Document r = new Document();
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Laboratorio");
            Document d = laboratorio.toDocumentName();
            FindIterable<Document> result = collection.find(d);
            r = result.first();
            if (r == null) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public void eliminarLaboratorio(Document viejo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Laboratorio");
            collection.deleteOne(viejo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//------------------------------------------------------INICIO METODOS PRODUCTO---------------------------------------------------------------------

    public void crearProducto() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test").withCodecRegistry(pojoCodecRegistry);
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Producto");
            collection.insertOne(producto.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerProductos(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setNumRows(0);
        modelo.setNumRows(0);
        ArrayList<String> producto = new ArrayList();
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Producto");
            MongoCursor<org.bson.Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                String principal = "";
                String[] p;
                principal = cursor.next().toString();
                p = principal.split(",");
                for (int i = 0; i < p.length; i++) {
                    String f[] = p[i].split("=");
                    producto.add(f[1]);
                }
                Object[] row = new Object[producto.size()];
                for (int i = 0; i < producto.size(); i++) {
                    if (i == producto.size() - 1) {
                        row[i] = (producto.get(i)).substring(0, producto.get(i).length() - 2);
                    } else {
                        row[i] = producto.get(i);
                    }
                }
                producto.clear();
                modelo.addRow(row);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Document obtenerProducto(Producto producto) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        Document r = new Document();
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Producto");
            Document d = producto.toDocumentName();
            FindIterable<Document> result = collection.find(d);
            r = result.first();
            if (r == null) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public void eliminarProducto(Document viejo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Producto");
            collection.deleteOne(viejo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public void reemplazarProducto(Document viejo, Document nuevo) {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        try {
            MongoCollection<org.bson.Document> collection = database.getCollection("Producto");
            collection.replaceOne(viejo, nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
