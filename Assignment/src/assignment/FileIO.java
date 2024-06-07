/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Terence
 */
public class FileIO {
    // Set your own file location
    public static String studentFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\StudentData.txt";
    public static String lecturerFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Lecturer.txt";
    public static String projectFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Projects.txt";
    public static String adminFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Admin.txt";
    public static String evaluationFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Evaluation Result.txt";
    
    // static global method
    public static ArrayList<Student> ImportStudents(){
        ArrayList<Student> students = new ArrayList<>();
        File Sfile = new File(studentFilepath);
        
        // Import Student file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(Sfile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    students.add(new Student(dataRow[0].trim(),dataRow[1].trim(),dataRow[2].trim(),dataRow[3].trim(),dataRow[4].trim())); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
    
    public static ArrayList<Project> ImportProjects(){
        ArrayList<Project> projects = new ArrayList<>();
        File Pfile = new File(projectFilepath);
        
        // Import project file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(Pfile));               
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    projects.add(new Project(dataRow[0].trim(),dataRow[1].trim(),dataRow[2].trim(),dataRow[3].trim(),dataRow[4].trim(),dataRow[5].trim(),dataRow[6].trim(),dataRow[7].trim(),dataRow[8].trim(),dataRow[9].trim())); //Create project object and add to project arraylist                              
                }
            }               
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projects;
    }
    
    public static ArrayList<Lecturer> ImportLecturer(){
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        File LFile = new File(lecturerFilepath);
        
        // Import lecturer file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(LFile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    lecturers.add(new Lecturer(dataRow[0].trim(), dataRow[1].trim(), dataRow[2].trim(), dataRow[3].trim(), Boolean.parseBoolean(dataRow[4].trim()))); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lecturers;
    }
    
    public static ArrayList<Admin> ImportAdmin(){
        ArrayList<Admin> admins = new ArrayList<>();
        File AFile = new File(adminFilepath);
        
         // Import admin file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(AFile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    admins.add(new Admin(dataRow[0].trim(), dataRow[1].trim(), dataRow[2].trim(), dataRow[3].trim())); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admins;
    }
    
    public static ArrayList<EvaluationResult> ImportEvaluationResult(){
        ArrayList<EvaluationResult> evaluationResults = new ArrayList<>();
        File EFile = new File(evaluationFilepath);
        
        // Import evaluation file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(EFile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    evaluationResults.add(new EvaluationResult(dataRow[0].trim(), dataRow[1].trim(), dataRow[2].trim(), dataRow[3].trim(), dataRow[4].trim())); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return evaluationResults;
    }
    
    public static void ExportStudents(ArrayList<Student> students){
        File Sfile = new File(studentFilepath);
        
        try{
            FileWriter fw = new FileWriter(Sfile);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("ID, Name, Email, Password, Intake");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < students.size(); i++){
                String lineWrite = students.get(i).getID()+"/ "+students.get(i).getName() +"/ " + students.get(i).getEmail()+ "/ "+students.get(i).getPassword()+ "/ "+students.get(i).getIntake();
                bw.write(lineWrite);
                bw.newLine();
            }    
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ExportProjects(ArrayList<Project> projects){
        File Pfile = new File(projectFilepath);
        
        try{
            FileWriter fw = new FileWriter(Pfile);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("Project ID, Student ID, Supervisor ID, SecondMarker ID, Assessment Type, Presentation Date, Submission Link, Submission Date, Report Status, Presentation Status,");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < projects.size(); i++){
                String lineWrite = projects.get(i).getProjectID()+"/ "+projects.get(i).getStudentID() +"/ "+projects.get(i).getSupervisorID()+ "/ "+projects.get(i).getSecondMarkerID()+"/ "+ projects.get(i).getAssessmentType() + "/ "+projects.get(i).getPresentationDate() + "/ "+projects.get(i).getSubmissionLink() +"/ "+ projects.get(i).getSubmissionDate() +"/ "+projects.get(i).getReportStatus() + "/ " + projects.get(i).getPresentationStatus();
                bw.write(lineWrite);
                bw.newLine();
            }    
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ExportLecturer(ArrayList<Lecturer> lecturers){
        File LFile = new File(lecturerFilepath);
        
        try{
            FileWriter fw = new FileWriter(LFile);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("ID, Name, Email, password, pmRole,");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < lecturers.size(); i++){
                String lineWrite = lecturers.get(i).getID()+"/ "+ lecturers.get(i).getName()+"/ "+ lecturers.get(i).getEmail()+ "/" + lecturers.get(i).getPassword() + "/" + String.valueOf(lecturers.get(i).getPmRole());
                bw.write(lineWrite);
                bw.newLine();
            }    
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ExportAdmin(ArrayList<Admin> admins){
        File Afile = new File(adminFilepath);
        
        try{
            FileWriter fw = new FileWriter(Afile);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("ID, Name, Email, password,");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < admins.size(); i++){
                String lineWrite = admins.get(i).getID()+"/ "+ admins.get(i).getName()+"/ "+ admins.get(i).getEmail()+ "/" + admins.get(i).getPassword();
                bw.write(lineWrite);
                bw.newLine();
            }    
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ExportEvaluationResult(ArrayList<EvaluationResult> evaluationResults){
        File Efile = new File(evaluationFilepath);
        
        try{
            FileWriter fw = new FileWriter(Efile);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("Evaluation ID, Project ID, EvaluatorID, Grade, Comment,");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < evaluationResults.size(); i++){
                String lineWrite = evaluationResults.get(i).getEvaluationID()+"/ "+ evaluationResults.get(i).getProjectID() +"/ "+ evaluationResults.get(i).getEvaluatorID() + "/" + evaluationResults.get(i).getGrade() + "/" + evaluationResults.get(i).getComment();
                bw.write(lineWrite);
                bw.newLine();
            }    
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

