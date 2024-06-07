/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */
public class Admin extends User{
    public Admin(String id, String name, String email, String password){
        super(id, name, email, password);
    }
    
    // Example of Polymorphism
    //getter
    @Override public String getID(){
        return id;
    }
    
    @Override public String getName(){
        return name;
    }
    
    @Override public String getEmail(){
        return email;
    }
    
    @Override public String getPassword(){
        return password;
    }
    
    //Setter
    @Override public void setID(String id){
        this.id = id;
    }
    
    @Override public void setName(String name){
        this.name = name;
    }
    
    @Override public void setEmail(String email){
        this.email = email;
    }
    
    @Override public void setPassword(String password){
        this.password = password;
    }
    // end of example of polymorphism
}
