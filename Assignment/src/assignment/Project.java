/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Terence
 */
public class Project {
   private String projectID, studentID, supervisorID, secondMarkerID, assessmentType, presentationDate, submissionLink, submissionDate, reportStatus;
   private Student student;
   private EvaluationResult evalutaionResult;
   
   public Project(String projectID,String studentID, String supervisorID,String secondMarkerID, String assessmentType, String presentationDate, String submissionLink, String submissionDate, String reportStatus){
       this.projectID = projectID;
       this.studentID = studentID;
       this.supervisorID = supervisorID;
       this.secondMarkerID = secondMarkerID;
       this.assessmentType = assessmentType;
       this.presentationDate = presentationDate;
       this.submissionLink = submissionLink;
       this.submissionDate = submissionDate;
       this.reportStatus = reportStatus;
   }
   
   //Getter
   public String getProjectID(){
       return projectID;
   }
   
   public String getStudentID(){
       return studentID;
   }
   
   public String getSupervisorID(){
       return supervisorID;
   }
   
   public String getSecondMarkerID(){
       return secondMarkerID;
   }
   
   public String getAssessmentType(){
       return assessmentType;
   }
   
   public String getPresentationDate(){
       return presentationDate;
   }
   
   public String getSubmissionLink(){
       return submissionLink;
   }
   
   public String getSubmissionDate(){
       return submissionDate;
   }
   
   public String getReportStatus(){
       return reportStatus;
   }
   
   public Student getStudent(){
        return student;
    }
   
   public EvaluationResult getEvaluationResult(){
       return evalutaionResult;
   }
  
   
   //Setter
   public void setProjectID(String projectID){
       this.projectID = projectID;
   }
   
   public void setStudentID(String studentID){
       this.studentID = studentID;
   }
   
   public void setSupervisorID(String supervisorID){
       this.supervisorID = supervisorID;
   }
   
   public void setSecondMarkerID(String secondMarkerID){
       this.secondMarkerID = secondMarkerID;
   }
   
   public void setAssessmentType(String assesmentType){
       this.assessmentType = assesmentType;
   }
   
   public void setPresentationDate(String presentationDate){
       this.presentationDate = presentationDate;
   }
   

    public void setSubmissionLink(String submissionLink){
        this.submissionLink = submissionLink;
    }
   
    public void setSubmissionDate(String submissionDate){
        this.submissionDate = submissionDate;
    }
   
    public void setReportStatus(String reportStatus){
        this.reportStatus = reportStatus;
    }
        
    public void setStudent(Student student){
        this.student = student;
    }
    
    public void setEvaluationResult(EvaluationResult evaluationResult){
        this.evalutaionResult = evaluationResult;
    }
    
}
