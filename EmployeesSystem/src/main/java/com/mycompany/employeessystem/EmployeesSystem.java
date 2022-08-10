/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.employeessystem;

import ARCE.MainInterface;
import Model.Employees;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.sql.Timestamp;


import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author pc
 */
public class EmployeesSystem {

    public static void main(String[] args) {
        String db_name = "AndalusiaRefreshmentsCompanyEmployees";
        String collectionEmp = "Employees";
        String password = "EmployeesEmployees";
        String connect = "mongodb+srv://Employees:" + password + "@cluster0.tjhks.mongodb.net/?retryWrites=true&w=majority";
        /* connect with mango */
        MongoClient client = MongoClients.create(connect);
        /* get database */
        MongoDatabase dataBase = client.getDatabase(db_name);
        /* get collection */
        MongoCollection empCollection = dataBase.getCollection(collectionEmp);

        MongoCursor e = empCollection.find().iterator();
        ArrayList<Employees> employee = new ArrayList<>();

        while (e.hasNext()) {
            employee.add(Employees.FromJson((Document) e.next()));

        }
        e.close();
        System.out.println(employee.size());

        /*for (int i = 1; i <= 30; i++) {
            Employees emp1 = new Employees();
            emp1.setAge(68);
            emp1.setSalary(1400);
            emp1.setBirth_date("01/01/1937");
            emp1.setName("Ahmed Naji :" + i);
            emp1.setWorkingSystem("patTime");
            emp1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            Document doc = new Document();
            doc.putAll(emp1.ToJson());
            empCollection.insertOne(doc);

        }*/

        System.out.println("Hello World!");
    }
    
    
}
