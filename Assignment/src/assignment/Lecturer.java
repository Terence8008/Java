/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */
public class Lecturer extends User{
    private boolean pmRole;
    
    public Lecturer(String id, String name, String email, String password, boolean pmRole){
        super(id, name, email, password);
        this.pmRole = pmRole;
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
    // Example of Polymorphism
    
    //Getter
    public boolean getPmRole(){
        return pmRole;
    }
    
    //Setter
    public void setPmRole(boolean pmRole){
        this.pmRole = pmRole;
    }
    
}
