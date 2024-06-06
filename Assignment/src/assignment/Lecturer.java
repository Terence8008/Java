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
    
    //Getter
    public boolean getPmRole(){
        return pmRole;
    }
    
    //Setter
    public void setPmRole(boolean pmRole){
        this.pmRole = pmRole;
    }
    
}
