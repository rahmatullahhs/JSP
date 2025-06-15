/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Employee {
    
    

    
    private int id; 
    private String name;
    private String email;
    private String role;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String email, String role, float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.salary = salary;
    }

    public Employee(String name, String email, String role, float salary) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    
    
    
    
  
    
    
}
