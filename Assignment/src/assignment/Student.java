/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */
public class Student extends User{
    private String intake;
    private Project project;
    
    public Student(String id, String name, String email, String password, String intake) {
        super(id, name, email, password);
        this.intake = intake;
    }
    
    // Setter 
    public void setIntake(String intake){
        this.intake = intake;
    }
    
    public void setProject(Project project){
        this.project = project;
    }

    //Getter 
    public String getIntake(){
        return intake;
    }
    
    public Project getProject(){
        return project;
    }
    
}
