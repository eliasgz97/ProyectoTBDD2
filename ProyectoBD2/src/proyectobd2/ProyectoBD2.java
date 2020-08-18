/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Daniel RC
 */
public class ProyectoBD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

MongoClient mongoClient = MongoClients.create(
    "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
MongoDatabase database = mongoClient.getDatabase("test");
database.createCollection("Personas");
    }
    
}
