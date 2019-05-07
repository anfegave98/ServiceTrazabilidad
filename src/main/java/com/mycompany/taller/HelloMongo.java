/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

/**
 *
 * @author brown
 */
public class HelloMongo {

    private DB database;
    private DBCollection collection;

    public DBCollection setUp() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        database = mongoClient.getDB("DataBase");
        collection = database.getCollection("paciente");
        return collection;
    }
}
