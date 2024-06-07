/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Terence
 */
public class LecturerMain extends javax.swing.JFrame {

    Lecturer loggedinLecterur;
    ArrayList<Student> students = new ArrayList<>(); // An arraylist to store all student object
    ArrayList<Project> projects = new ArrayList<>(); // An arraylust to store all project object
    ArrayList<EvaluationResult> evaluationResults = new ArrayList<>(); // An arraylist to store all evaluation result object
    
    /**
     * Creates new form MainMenu
     * @param lecturer
     * @param students
     * @param projects
     * @param evaluationResults
     */
    public LecturerMain(Lecturer lecturer, ArrayList<Student> students, ArrayList<Project> projects, ArrayList<EvaluationResult> evaluationResults) {
        this.loggedinLecterur = lecturer;
        this.students = students;
        this.projects = projects;
        this.evaluationResults = evaluationResults;
        initComponents();
        MainNameLbl.setText(lecturer.getName());
        MainIDLbl.setText(lecturer.getID());
        
        DefaultTableModel model = (DefaultTableModel)MainSuperviseeTable.getModel();
        
        for (Student student: students){
            // check which student this lecturer supervise
            // get student lastest project
            if (!student.getProjects().isEmpty()){
                Project latestProject = student.getProjects().get(student.getProjects().size()-1);
                // validate to see if this student supervises by this acoount lecturer
                if (latestProject.getSupervisorID().equals(lecturer.getID()) || latestProject.getSecondMarkerID().equals(lecturer.getID())){
                    String [] tableDataRow = {student.getID(), student.getName(), student.getIntake(), latestProject.getAssessmentType(), latestProject.getPresentationStatus()}; 
                    model.addRow(tableDataRow);
                }
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
        PDialogStatusComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        PDialogProjectIDLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainSuperviseeTable = new javax.swing.JTable();
        ReportListBtn = new javax.swing.JButton();
        PresentationBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveAndQuitBtn = new javax.swing.JButton();
        MainNameLbl = new javax.swing.JLabel();
        MainIDLbl = new javax.swing.JLabel();

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
                                    .addComponent(FeedbackField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addGroup(ReportDialogLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(RDialogCancelBtn)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        ReportDialogLayout.setVerticalGroup(
            ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportDialogLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(ReportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
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
        PDialogSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDialogSaveBtnActionPerformed(evt);
            }
        });

        PDialogCancelBtn.setText("Cancel");
        PDialogCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDialogCancelBtnActionPerformed(evt);
            }
        });

        PDialogStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Reject" }));

        jLabel1.setText("Project ID");

        PDialogProjectIDLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDialogProjectIDLbl.setText("Project ID");

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
                            .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PresentationDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(102, 102, 102))
                                .addGroup(PresentationDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(43, 43, 43)
                                    .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PDialogIDLbl)
                                        .addComponent(PDialogNameLbl))))
                            .addGap(57, 57, 57)))
                    .addGroup(PresentationDialogLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(30, 30, 30)
                        .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PDialogProjectIDLbl)
                            .addComponent(PDialogAssessmentTypeLbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDialogPresentationDateLbl)
                    .addComponent(jLabel18)
                    .addComponent(PDialogCancelBtn)
                    .addComponent(PDialogStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        PresentationDialogLayout.setVerticalGroup(
            PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresentationDialogLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(PDialogNameLbl))
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PresentationDialogLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel18)
                        .addGap(39, 39, 39)
                        .addComponent(PDialogPresentationDateLbl)
                        .addGap(27, 27, 27))
                    .addGroup(PresentationDialogLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(PDialogIDLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PDialogProjectIDLbl))
                        .addGap(18, 18, 18)))
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDialogStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(PDialogAssessmentTypeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(PresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDialogSaveBtn)
                    .addComponent(PDialogCancelBtn))
                .addGap(39, 39, 39))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainSuperviseeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Intake", "Assessment Type", "Presentation Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MainSuperviseeTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MainSuperviseeTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(MainSuperviseeTable);
        if (MainSuperviseeTable.getColumnModel().getColumnCount() > 0) {
            MainSuperviseeTable.getColumnModel().getColumn(0).setResizable(false);
            MainSuperviseeTable.getColumnModel().getColumn(1).setResizable(false);
            MainSuperviseeTable.getColumnModel().getColumn(2).setResizable(false);
            MainSuperviseeTable.getColumnModel().getColumn(3).setResizable(false);
            MainSuperviseeTable.getColumnModel().getColumn(4).setResizable(false);
        }

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

        MainNameLbl.setText("jLabel1");

        MainIDLbl.setText("jLabel19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MainIDLbl)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(MainNameLbl)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveAndQuitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PresentationBtn)
                                .addGap(84, 84, 84)
                                .addComponent(ReportListBtn)
                                .addGap(167, 167, 167)))))
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
                    .addComponent(saveAndQuitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MainNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MainIDLbl))
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
        DefaultTableModel model = (DefaultTableModel)MainSuperviseeTable.getModel();
        int selectedIndex = MainSuperviseeTable.getSelectedRow();
        

        
        if (selectedIndex != -1){
            // get id from selectedIndex,0
            String selectedID = String.valueOf(model.getValueAt(selectedIndex, 0));
            
            // Look for student
            for (Student student: students){
                if (student.getID().equals(selectedID)){
                    // get student lastest project
                    Project latestProject = student.getProjects().get(student.getProjects().size()-1);    
                    
                    // check if student have submitted his report
                    if (!latestProject.getSubmissionDate().equals("Not set")){
                        ReportDialog.setVisible(true);
                        ReportDialog.setSize(600,400);
                        StudentNameLabel.setText(student.getName());
                        StudentIDLabel.setText(student.getID());
                        ProjectIDLabel.setText(latestProject.getProjectID());
                        AssessmentLabel.setText(latestProject.getAssessmentType());
                        SubmissionDateLabel.setText(latestProject.getSubmissionDate());
                        SubmissionLinkLabel.setText(latestProject.getSubmissionLink());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Student have not submitted his report");
                    }
                }
            }   
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a student to see his report");
        }
    }//GEN-LAST:event_ReportListBtnActionPerformed

    private void PresentationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentationBtnActionPerformed
            DefaultTableModel model = (DefaultTableModel)MainSuperviseeTable.getModel(); 
        int selectedIndex = MainSuperviseeTable.getSelectedRow();
        
        if (selectedIndex != -1){
            // get id from selectedIndex,0
            String selectedID = String.valueOf(model.getValueAt(selectedIndex, 0));
            
            for (Student student:students){
                if (student.getID().equals(selectedID)){
                    // get student lastest project
                    Project latestProject = student.getProjects().get(student.getProjects().size()-1);
                    PDialogNameLbl.setText(student.getName());
                    PDialogIDLbl.setText(student.getID());
                    PDialogAssessmentTypeLbl.setText(latestProject.getAssessmentType());
                    PDialogPresentationDateLbl.setText(latestProject.getPresentationDate());
                    PDialogProjectIDLbl.setText(latestProject.getProjectID());
                }
            }
            PresentationDialog.setVisible(true);
            PresentationDialog.setSize(570,350);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a student to see his presentation requests");
        }
    }//GEN-LAST:event_PresentationBtnActionPerformed
    

    
    private void saveAndQuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndQuitBtnActionPerformed
        FileIO.ExportProjects(projects);
    }//GEN-LAST:event_saveAndQuitBtnActionPerformed

    private void MainSuperviseeTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MainSuperviseeTableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_MainSuperviseeTableComponentShown

    private void RDialogSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDialogSaveBtnActionPerformed
        int newID = Integer.parseInt(evaluationResults.get(evaluationResults.size()-1).getEvaluationID().substring(2)) +1;
        String newIDIdentifier = "EV" + String.valueOf(newID);

        EvaluationResult evaluationResult = new EvaluationResult(newIDIdentifier,ProjectIDLabel.getText(),loggedinLecterur.getID(), GradeComboBox.getItemAt(GradeComboBox.getSelectedIndex()),FeedbackField.getText());
        evaluationResults.add(evaluationResult);
        ReportDialog.setVisible(false);
    }//GEN-LAST:event_RDialogSaveBtnActionPerformed

    private void RDialogCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDialogCancelBtnActionPerformed
        ReportDialog.setVisible(false);
    }//GEN-LAST:event_RDialogCancelBtnActionPerformed

    private void PDialogCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDialogCancelBtnActionPerformed
        PresentationDialog.setVisible(false);
    }//GEN-LAST:event_PDialogCancelBtnActionPerformed

    private void PDialogSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDialogSaveBtnActionPerformed
        // Save presntation status
        String selectedProjectID = PDialogProjectIDLbl.getText();
        String presentationStatus = String.valueOf(PDialogStatusComboBox.getSelectedItem());
        
        for (Project project: projects){
            if (project.getProjectID().equals(selectedProjectID)){
                // If presentation Status is accepted, the presentation is scheduled
                if (presentationStatus.equals("Accept")){
                    project.setPresentationStatus("Scheduled");
                }
                if(presentationStatus.equals("Reject")){
                    project.setPresentationStatus("Pending");
                }
            }
        }
        
        RelinkStudentProjects();
        ReinitializeTable();
        
    }//GEN-LAST:event_PDialogSaveBtnActionPerformed

    public void RelinkStudentProjects(){
        // Clear link
        for (Student student: students){
            student.clearProjects();
        }
        
        // set projects to student
        for (int i = 0; i < students.size(); i ++){
            for(int j = 0; j < projects.size(); j ++)
                if (students.get(i).getID().equals(projects.get(j).getStudentID())){
                    students.get(i).addProject(projects.get(j));
                    
                }
        }
    }
    
    public void ReinitializeTable(){
        DefaultTableModel model = (DefaultTableModel)MainSuperviseeTable.getModel();
        model.setRowCount(0);
        
        for (Student student: students){
            // check which student this lecturer supervise
            // get student lastest project
            if (!student.getProjects().isEmpty()){
                Project latestProject = student.getProjects().get(student.getProjects().size()-1);
                // validate to see if this student supervises by this acoount lecturer
                if (latestProject.getSupervisorID().equals(loggedinLecterur.getID()) || latestProject.getSecondMarkerID().equals(loggedinLecterur.getID())){
                    String [] tableDataRow = {student.getID(), student.getName(), student.getIntake(), latestProject.getAssessmentType(), latestProject.getPresentationStatus()}; 
                    model.addRow(tableDataRow);
                }
            }
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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssessmentLabel;
    private javax.swing.JTextField FeedbackField;
    private javax.swing.JComboBox<String> GradeComboBox;
    private javax.swing.JLabel MainIDLbl;
    private javax.swing.JLabel MainNameLbl;
    private javax.swing.JTable MainSuperviseeTable;
    private javax.swing.JLabel PDialogAssessmentTypeLbl;
    private javax.swing.JButton PDialogCancelBtn;
    private javax.swing.JLabel PDialogIDLbl;
    private javax.swing.JLabel PDialogNameLbl;
    private javax.swing.JLabel PDialogPresentationDateLbl;
    private javax.swing.JLabel PDialogProjectIDLbl;
    private javax.swing.JButton PDialogSaveBtn;
    private javax.swing.JComboBox<String> PDialogStatusComboBox;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JButton saveAndQuitBtn;
    // End of variables declaration//GEN-END:variables
}
