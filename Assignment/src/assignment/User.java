/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */

// Create a abstract user class
abstract class User {
    public String id,name, email, password;
    
    
    //Constructor
    public User(String id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    // Creating abstract methods
    // Getter
    public abstract String getID();
    
    public abstract String getName();
    
    public abstract String getEmail();
    
    public abstract String getPassword();
    
    //Setter
    public abstract void setID(String id);
    
    public abstract void setName(String name);
    
    public abstract void setEmail(String email);
    
    public abstract void setPassword(String password);
}
