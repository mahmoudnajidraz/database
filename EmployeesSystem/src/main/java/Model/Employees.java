/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author pc
 */
public class Employees {

    /**
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the birth_date
     */
    public String getBirth_date() {
        return birth_date;
    }

    /**
     * @param birth_date the birth_date to set
     */
    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the workingSystem
     */
    public String getWorkingSystem() {
        return workingSystem;
    }

    /**
     * @param workingSystem the workingSystem to set
     */
    public void setWorkingSystem(String workingSystem) {
        this.workingSystem = workingSystem;
    }
    private ObjectId id;
    private String name;
    private int age;
    private Date createdAt;

    private String birth_date;
    private double salary;
    private String workingSystem;

    public Map<String, Object> ToJson() {
        Map<String, Object> json = new HashMap<>();
        json.put("Name", this.getName());
        json.put("Age", this.getAge());
        json.put("CreatedAt", this.getCreatedAt());
        json.put("Birth_date", this.getBirth_date());
        json.put("Salary", this.getSalary());
        json.put("WorkingSystem", this.getWorkingSystem());
        return json;

    }

    public static Employees FromJson(Document d) {
        Employees e = new Employees();
        e.setId(d.getObjectId("_id"));
        e.setName(d.getString("Name"));
        e.setAge(d.getInteger("Age"));
        e.setSalary(d.getDouble("Salary"));
        e.setBirth_date(d.getString("Birth_date"));
        e.setWorkingSystem(d.getString("WorkingSystem"));
        e.setCreatedAt(d.getDate("CreatedAt"));


        return e;

    }

    public String ToString() {
        return "Name : " + this.getName() + "AGE : " + this.getAge() + "Salary : " + this.getSalary() + "WorkingSystem :" + this.getWorkingSystem();

    }
    

}
