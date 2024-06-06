/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Terence
 */
public class LecturerMain extends javax.swing.JFrame {

    ArrayList<Student> students = new ArrayList<>(); // An arraylist to store all student object
    ArrayList<Project> projects = new ArrayList<>(); // An arraylust to store all project object
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Lecturer> lecturers = new ArrayList<>();
    ArrayList<Student> responsibleStudent = new ArrayList<>();
    ArrayList<EvaluationResult> evaluationResults = new ArrayList<>();
    
    /**
     * Creates new form MainMenu
     */
    public LecturerMain() {
        initComponents();  
    }
    
    public LecturerMain(Project project) {
        initComponents();       
        for (int i = 0; i < projects.size(); i ++){
            if (projects.get(i).getProjectID().equals(project.getStudentID())){
                projects.set(i, project);
            }
        }
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReportDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FeedbackField = new javax.swing.JTextField();
        StudentNameLabel = new javax.swing.JLabel();
        StudentIDLabel = new javax.swing.JLabel();
        ProjectIDLabel = new javax.swing.JLabel();
        AssessmentLabel = new javax.swing.JLabel();
        SubmissionLinkLabel = new javax.swing.JLabel();
        SubmissionDateLabel = new javax.swing.JLabel();
        RDialogSaveBtn = new javax.swing.JButton();
        RDialogCancelBtn = new javax.swing.JButton();
        GradeComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        EvaluationIDLabel = new javax.swing.JLabel();
        PresentationDialog = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PDialogPresentationDateLbl = new javax.swing.JLabel();
        PDialogNameLbl = new javax.swing.JLabel();
        PDialogIDLbl = new javax.swing.JLabel();
        PDialogAssessmentTypeLbl = new javax.swing.JLabel();
        PDialogSaveBtn = new javax.swing.JButton();
        PDialogCancelBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ReportListBtn = new javax.swing.JButton();
        PresentationBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveAndQuitBtn = new javax.swing.JButton();
        ImportBtn = new javax.swing.JButton();
        DashBoardNameLbl = new javax.swing.JLabel();
        MainMenuIDLbl = new javax.swing.JLabel();

        jLabel6.setText("Student name ");

        jLabel7.setText("Id");

        jLabel8.setText("Project ID");

        jLabel9.setText("Assessment Type");

        jLabel10.setText("Submission link");

        jLabel11.setText("Submission date");

        jLabel12.setText("Grade");

        jLabel13.setText("Feedback");

        StudentNameLabel.setText("jLabel14");

        StudentIDLabel.setText("jLabel15");

        ProjectIDLabel.setText("jLabel16");

        AssessmentLabel.setText("jLabel17");

        SubmissionLinkLabel.setText("jLabel18");

        SubmissionDateLabel.setText("jLabel19");

        RDialogSaveBtn.setText("Save Changes");
        RDialogSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDialogSaveBtnActionPerformed(evt);
            }
        });

        RDialogCancelBtn.setText("Cancel");
        RDialogCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDialogCancelBtnActionPerformed(evt);
            }
        });

        GradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B", "C", "D", "E", "F" }));

        jLabel14.setText("Evaluation ID");

        EvaluationIDLabel.setText("jLabel15");

        javax.swing.GroupLayout ReportDialogLayout = new javax.swing.GroupLayout(ReportDialog.getContentPane());
        ReportDialog.getContentPane().setLayout(ReportDialogLayout);
        ReportDialogLayout.setHorizontalGroup(
            ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportDialogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportDialogLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))))
                    .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RDialogSaveBtn)
                        .addGroup(ReportDialogLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(13, 13, 13))))
                .addGap(32, 32, 32)
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentNameLabel)
                    .addComponent(StudentIDLabel)
                    .addComponent(AssessmentLabel)
                    .addComponent(SubmissionLinkLabel)
                    .addComponent(ProjectIDLabel)
                    .addComponent(SubmissionDateLabel))
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportDialogLayout.createSequentialGroup()
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ReportDialogLayout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(jLabel13))
                                .addGroup(ReportDialogLayout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addComponent(FeedbackField))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportDialogLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                    .addComponent(jLabel14)
                                    .addGap(90, 90, 90)))
                            .addGroup(ReportDialogLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(RDialogCancelBtn)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EvaluationIDLabel)
                            .addGroup(ReportDialogLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        ReportDialogLayout.setVerticalGroup(
            ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportDialogLayout.createSequentialGroup()
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportDialogLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(EvaluationIDLabel))))
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportDialogLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FeedbackField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportDialogLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(StudentIDLabel))
                        .addGap(26, 26, 26)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ProjectIDLabel))
                        .addGap(24, 24, 24)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(AssessmentLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(SubmissionLinkLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(SubmissionDateLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDialogSaveBtn)
                    .addComponent(RDialogCancelBtn))
                .addContainerGap())
        );

        jLabel15.setText("Student name:");

        jLabel16.setText("TP number");

        jLabel17.setText("Assessment Type");

        jLabel18.setText("Proposed presentation Date:");

        PDialogPresentationDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDialogPresentationDateLbl.setText("Student Requested PresentationDate");

        PDialogNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDialogNameLbl.setText("Name");

        PDialogIDLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDialogIDLbl.setText("ID");

        PDialogAssessmentTypeLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDialogAssessmentTypeLbl.setText("Asessment Type");

        PDialogSaveBtn.setText("Save");

        PDialogCancelBtn.setText("Cancel");
        PDialogCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDialogCancelBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Reject" }));

        javax.swing.GroupLayout PresentationDialogLayout = new javax.swing.GroupLayout(PresentationDialog.getContentPane());
        PresentationDialog.getContentPane().setLayout(PresentationDialogLayout);
        PresentationDialogLayout.setHorizontalGroup(
            PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresentationDialogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PDialogSaveBtn)
                        .addGroup(PresentationDialogLayout.createSequentialGroup()
                            .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel17))
                            .addGap(30, 30, 30)
                            .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PDialogAssessmentTypeLbl)
                                .addComponent(PDialogIDLbl)
                                .addComponent(PDialogNameLbl)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDialogPresentationDateLbl)
                    .addComponent(jLabel18)
                    .addComponent(PDialogCancelBtn)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        PresentationDialogLayout.setVerticalGroup(
            PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresentationDialogLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(PDialogNameLbl))
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PresentationDialogLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(PDialogIDLbl)))
                    .addGroup(PresentationDialogLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel18)
                        .addGap(39, 39, 39)
                        .addComponent(PDialogPresentationDateLbl)))
                .addGap(8, 8, 8)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(PDialogAssessmentTypeLbl))
                .addGap(3, 3, 3)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDialogSaveBtn)
                    .addComponent(PDialogCancelBtn))
                .addGap(39, 39, 39))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tp Number", "Name", "Intake"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ReportListBtn.setText("Evaluate Student Report");
        ReportListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportListBtnActionPerformed(evt);
            }
        });

        PresentationBtn.setText("Check Presentation Request");
        PresentationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentationBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Assigned supervisee");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Lecturer DashBoard");

        jLabel4.setText("Name: ");

        jLabel5.setText("ID: ");

        saveAndQuitBtn.setText("Save and Quit");
        saveAndQuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAndQuitBtnActionPerformed(evt);
            }
        });

        ImportBtn.setText("Import");
        ImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportBtnActionPerformed(evt);
            }
        });

        DashBoardNameLbl.setText("jLabel1");

        MainMenuIDLbl.setText("jLabel19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MainMenuIDLbl)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(DashBoardNameLbl))))
                                .addGap(423, 423, 423))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ImportBtn)
                                .addGap(26, 26, 26)))
                        .addComponent(saveAndQuitBtn)
                        .addGap(31, 31, 31)
                        .addComponent(LogoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PresentationBtn)
                                .addGap(137, 137, 137)
                                .addComponent(ReportListBtn)
                                .addGap(114, 114, 114)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(325, 325, 325))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(saveAndQuitBtn)
                    .addComponent(LogoutBtn)
                    .addComponent(ImportBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DashBoardNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MainMenuIDLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReportListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PresentationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void ReportListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportListBtnActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex != -1){
            // Check if student have been evaluated
            for (int i =0; i < evaluationResults.size(); i++){
                if(responsibleStudent.get(selectedIndex).getProject().getProjectID().equals(evaluationResults.get(i).getProjectID()) && evaluationResults.get(i).getEvaluatorID().equals("LR02")){  // check for evaluation list 
                    JOptionPane.showMessageDialog(null, "Simple Information Message");
                }
                else{
                    Student selectedStudent = responsibleStudent.get(selectedIndex);
                    ReportDialog.setVisible(true);
                    ReportDialog.setSize(600,400);
                    StudentNameLabel.setText(selectedStudent.getName());
                    StudentIDLabel.setText(selectedStudent.getID());
                    ProjectIDLabel.setText(selectedStudent.getProject().getProjectID());
                    AssessmentLabel.setText(selectedStudent.getProject().getAssessmentType());
                    SubmissionDateLabel.setText(selectedStudent.getProject().getSubmissionDate());
                    SubmissionLinkLabel.setText(selectedStudent.getProject().getSubmissionLink());
                    EvaluationIDLabel.setText(selectedStudent.getID()+"R");
                }               
            }
        }
       
    }//GEN-LAST:event_ReportListBtnActionPerformed

    private void PresentationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentationBtnActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex != -1){
            Student selectedStudent = responsibleStudent.get(selectedIndex);
            PresentationDialog.setVisible(true);
            PresentationDialog.setSize(600,400);
            PDialogNameLbl.setText(selectedStudent.getName());
            PDialogIDLbl.setText(selectedStudent.getID());
            PDialogAssessmentTypeLbl.setText(selectedStudent.getProject().getAssessmentType());
            PDialogPresentationDateLbl.setText(selectedStudent.getProject().getPresentationDate());
        }
    }//GEN-LAST:event_PresentationBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed

    }//GEN-LAST:event_LogoutBtnActionPerformed
    

    
    private void saveAndQuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndQuitBtnActionPerformed
        updateTextFile(projects);
    }//GEN-LAST:event_saveAndQuitBtnActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void ImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportBtnActionPerformed
        String studentFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\StudentData.txt";
        String projectFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Projects.txt";
        String evaluationFilepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Evaluation Result.txt";
        File Sfile = new File(studentFilepath);
        File Pfile = new File(projectFilepath);
        File EFile = new File(evaluationFilepath);
        
        // Import Student file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(Sfile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    students.add(new Student(dataRow[0],dataRow[1],dataRow[2],dataRow[3],dataRow[4])); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Import project file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(Pfile));               
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    projects.add(new Project(dataRow[0],dataRow[1],dataRow[2],dataRow[3],dataRow[4],dataRow[5],dataRow[6],dataRow[7],dataRow[8])); //Create project object and add to project arraylist                              
                }
            }               
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }                  
        
        // Import evaluation file into array
        try {
            BufferedReader br = new BufferedReader(new FileReader(EFile));         
            Object[] tableLines = br.lines().toArray();  // Create array of object to represent each lines        
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim(); // convert line object into String and trim it
                String[] dataRow = line.split("/");
                if (dataRow.length != 1) // Check if the datarow have been split using the delimiter
                { 
                    evaluationResults.add(new EvaluationResult(dataRow[0], dataRow[1], dataRow[2], dataRow[3], dataRow[4])); //Create student object and add to student arraylist                 
                }
            }     
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // set projects to student
        for (int i = 0; i < students.size(); i ++){
            for(int j = 0; j < projects.size(); j ++)
                if (students.get(i).getID().equals(projects.get(j).getStudentID())){
                    students.get(i).setProject(projects.get(j));
                    projects.get(j).setStudent(students.get(i));
                }
        }
        
        
        String [] columnsName = {"Tp number", "Name","Intake"}; //Set the column identifier 
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setColumnIdentifiers(columnsName);      
        
        
        // See which student is responsible for LR02
        for(int i =0 ; i < projects.size() ; i++){
            if (projects.get(i).getSupervisorID().equals("LR02") || projects.get(i).getSecondMarkerID().equals("LR02")){
                responsibleStudent.add(projects.get(i).getStudent());
            }
        }

        
        // Add responsible student data to jtable
        for(int i =0 ; i < responsibleStudent.size() ; i++){{
            String [] tableDataRow = {responsibleStudent.get(i).getID(),responsibleStudent.get(i).getName(),responsibleStudent.get(i).getIntake()};
            model.addRow(tableDataRow);               
            }
        }
    }//GEN-LAST:event_ImportBtnActionPerformed

    private void RDialogSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDialogSaveBtnActionPerformed
        EvaluationResult evaluationResult = new EvaluationResult(EvaluationIDLabel.getText(),ProjectIDLabel.getText(),"LR02", GradeComboBox.getItemAt(GradeComboBox.getSelectedIndex()),FeedbackField.getText());
        evaluationResults.add(evaluationResult);
        ReportDialog.setVisible(false);
    }//GEN-LAST:event_RDialogSaveBtnActionPerformed

    private void RDialogCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDialogCancelBtnActionPerformed
        ReportDialog.setVisible(false);
    }//GEN-LAST:event_RDialogCancelBtnActionPerformed

    private void PDialogCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDialogCancelBtnActionPerformed
        PresentationDialog.setVisible(false);
    }//GEN-LAST:event_PDialogCancelBtnActionPerformed

    
    
    public void updateTextFile(ArrayList<Project> projects){
        String filepath = "C:\\Users\\Terence\\Desktop\\Terence\\Apu\\Sem 3\\Java\\Assingnment\\Assignment\\src\\assignment\\Project.txt";
        File file = new File(filepath);
        
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write("Project ID, Student ID, Supervisor ID, SecondMarker ID, Assessment Type, Presentation Date, Submission Link, Submission Date, Report Status,");
            bw.newLine();
            
            // Check how many line to be writtern to text file
            for(int i =0; i < projects.size(); i++){
                String lineWrite = projects.get(i).getProjectID()+"/ "+projects.get(i).getStudentID() +"/ "+projects.get(i).getSupervisorID()+ "/ "+projects.get(i).getSecondMarkerID()+"/ "+ projects.get(i).getAssessmentType() + "/ "+projects.get(i).getPresentationDate() + "/ "+projects.get(i).getSubmissionLink() +"/ "+ projects.get(i).getSubmissionDate() +"/ "+projects.get(i).getReportStatus();
                bw.write(lineWrite);
                bw.newLine();
            }
            
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssessmentLabel;
    private javax.swing.JLabel DashBoardNameLbl;
    private javax.swing.JLabel EvaluationIDLabel;
    private javax.swing.JTextField FeedbackField;
    private javax.swing.JComboBox<String> GradeComboBox;
    private javax.swing.JButton ImportBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JLabel MainMenuIDLbl;
    private javax.swing.JLabel PDialogAssessmentTypeLbl;
    private javax.swing.JButton PDialogCancelBtn;
    private javax.swing.JLabel PDialogIDLbl;
    private javax.swing.JLabel PDialogNameLbl;
    private javax.swing.JLabel PDialogPresentationDateLbl;
    private javax.swing.JButton PDialogSaveBtn;
    private javax.swing.JButton PresentationBtn;
    private javax.swing.JDialog PresentationDialog;
    private javax.swing.JLabel ProjectIDLabel;
    private javax.swing.JButton RDialogCancelBtn;
    private javax.swing.JButton RDialogSaveBtn;
    private javax.swing.JDialog ReportDialog;
    private javax.swing.JButton ReportListBtn;
    private javax.swing.JLabel StudentIDLabel;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JLabel SubmissionDateLabel;
    private javax.swing.JLabel SubmissionLinkLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton saveAndQuitBtn;
    // End of variables declaration//GEN-END:variables
}
