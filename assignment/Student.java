/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */
public class Student {
    private String tpNumber,name,supervisor, assignedDate, intake, AssessementType, PStatus, RStatus;
    
    public Student(String tpNumber, String name, String assignedDate,String supervisor, String intake, String AssessementType, String PStatus, String RStatus) {
        this.tpNumber = tpNumber;
        this.name = name;
        this.supervisor = supervisor;
        this.assignedDate = assignedDate;
        this.intake = intake;
        this.AssessementType = AssessementType;
        this.PStatus = PStatus;
        this.RStatus = RStatus;
    }
    
    public String getTpNumber(){
        return tpNumber;
    }
        
    public String getName(){
        return name;
    }
    
    public String getSupervisor(){
        return supervisor;
    }
    
    public String getAssignedDate(){
        return assignedDate;
    }
    
    public String getIntake(){
        return intake;
    }
    
    public String getAssessmentType(){
        return AssessementType;
    }
    
    public String getPStatus(){
        return PStatus;
    }
    
    public String getRStatus(){
        return RStatus;
    }
    
    public void setName(String name){
        this.name = name;
    } 
    
    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    } 
    
    public void setAssignedDate(String assignedDate){
        this.assignedDate = assignedDate;
    } 
    
    public void setIntake(String intake){
        this.intake = intake;
    } 
    
    public void setAssessmentype(String assessmentType){
        this.AssessementType = assessmentType;
    } 
    
    public void setPStatus(String PStatus){
        this.PStatus = PStatus;
    }
    
    public void setRStatus(String RStatus){
        this.RStatus = RStatus;
    } 
}
