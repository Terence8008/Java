/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Terence
 */
public class EvaluationResult {
    private String evaluationID, projectID, evaluatorID, grade, comment;
    
    public EvaluationResult(String evaluationID,String projectID,String evaluatorID, String grade, String comment ){
        this.evaluationID = evaluationID;
        this.evaluatorID = evaluatorID;
        this.projectID = projectID;
        this.grade = grade;
        this.comment = comment;
    }
    
    //Setter
    public void setEvaluationID(String evaluationID){
        this.evaluationID = evaluationID;
    }
    
    public void setProjectID(String projectID){
        this.projectID = projectID;
    }
    
    public void setEvaluatorID(String evaluatorID){
        this.evaluationID = evaluatorID;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
     
    public void setComment(String comment){
        this.comment = comment;
    }
    //Getter
    public String getEvaluationID(){
        return evaluationID;
    }
    
    public String getProjectID(){
        return projectID;
    }
    
    public String getEvaluatorID(){
        return evaluatorID;
    }
    
    public String  getGrade(){
        return grade;
    }
     
    public String  getComment(){
        return comment;
    } 
}
