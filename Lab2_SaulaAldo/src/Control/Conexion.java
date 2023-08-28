package Control;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Conexion {
    
    
    public DBCollection conexionProfesor() {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        DB database = mongoClient.getDB("Registro");
        return database.getCollection("profesor");
    }

    public DBCollection conexionHorario() {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        DB database = mongoClient.getDB("Registro");
        return database.getCollection("horario");
    }
    
    public DBCollection conexionLogin() {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        DB database = mongoClient.getDB("Registro");
        return database.getCollection("login");
    }
    
    public DBCollection conexionEstudiante() {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        DB database = mongoClient.getDB("Registro");
        return database.getCollection("estudiante");
    }
}
