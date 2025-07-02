
package model;

public class Student {
    
    private int id; 
    private String name;
    private String email;
    private String subject;
    private float fee;

    public Student() {
    }

    public Student(int id, String name, String email, String subject, float fee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.fee = fee;
    }

    public Student(String name, String email, String subject, float fee) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.fee = fee;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

   
    
  
    
    
}
