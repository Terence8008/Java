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
