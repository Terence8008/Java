/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.ArrayList;

/**
 *
 * @author Terence
 */
public class Student extends User{
    private String intake;
    ArrayList<Project> projects = new ArrayList<>();
    
    public Student(String id, String name, String email, String password, String intake) {
        super(id, name, email, password);
        this.intake = intake;
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
    
    // Setter 
    public void setIntake(String intake){
        this.intake = intake;
    }
    
    public void addProject(Project project){
        this.projects.add(project);
    }

    //Getter 
    public String getIntake(){
        return intake;
    }
    
    public ArrayList<Project> getProjects(){
        return projects;
    }
    
    // others
    public void clearProjects(){
        this.projects.clear();
    }
    
}
