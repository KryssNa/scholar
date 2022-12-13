/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import database.DbConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lenovo
 */
public class newAttendance extends javax.swing.JInternalFrame {
    Connection conn=DbConnection.getconnection();
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form newAttendance
     */
    public newAttendance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAttendance = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelbatchCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        subcombobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        ClassAttendanceButton = new javax.swing.JButton();
        submit_attendance = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        tblAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Student Batch", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAttendance);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 370, 750, 187);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch Code");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 50, 100, 30);

        jLabelbatchCode.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelbatchCode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbatchCode.setText("Batch 32A");
        jPanel1.add(jLabelbatchCode);
        jLabelbatchCode.setBounds(420, 50, 240, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 110, 100, 30);

        subcombobox.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        subcombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subcomboboxMouseClicked(evt);
            }
        });
        subcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subcomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(subcombobox);
        subcombobox.setBounds(420, 110, 240, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 190, 70, 30);

        datechooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datechooserPropertyChange(evt);
            }
        });
        jPanel1.add(datechooser);
        datechooser.setBounds(420, 190, 240, 30);

        ClassAttendanceButton.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        ClassAttendanceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/marked.png"))); // NOI18N
        ClassAttendanceButton.setAutoscrolls(true);
        ClassAttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClassAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassAttendanceButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClassAttendanceButton);
        ClassAttendanceButton.setBounds(280, 270, 110, 30);

        submit_attendance.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        submit_attendance.setText("Submit Attendance");
        submit_attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_attendanceActionPerformed(evt);
            }
        });
        jPanel1.add(submit_attendance);
        submit_attendance.setBounds(580, 260, 180, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1040, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subcomboboxActionPerformed
        // TODO add your handling code here:
             try {
                    String query="select course_name from AddTeacher";
                            
                    pst=conn.prepareStatement(query);

                    ResultSet rst = pst.executeQuery();
                    
                    while(rst.next()){
                        String sub=rst.getString("Course_name");
                        System.out.println("sub");
                        subcombobox.addItem(sub);                    
                    }
                    }
        
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_subcomboboxActionPerformed

    private void datechooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datechooserPropertyChange
        // TODO add your handling code here:

        /**
        * Restricting Using from Marking Attendance on future date
        //         */
                try {
                        //JDateChooser Format
                        SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        String finaldate = comparedate.format(datechooser.getDate());
            
                        //Current Date Formats
                        DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
                        Calendar cal =new GregorianCalendar();
                            int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        
                        String lbl_date=(month+1)+"/"+day+"/"+year;
            
                        if (finaldate.compareTo(lbl_date) > 0) {
                                JOptionPane.showMessageDialog(null, "Your can't mark attendance on Future Date", "Future Date", JOptionPane.WARNING_MESSAGE);
                                ClassAttendanceButton.setEnabled(false);
                            } else {
                                ClassAttendanceButton.setEnabled(true);
                            }
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
    }//GEN-LAST:event_datechooserPropertyChange

    private void ClassAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassAttendanceButtonActionPerformed

            for (int i = 0; i < tblAttendance.getRowCount(); i++) {
               tblAttendance.setValueAt("Present", i, 3);
 
            }
//                String name = ClassAttendanceTable.getModel().getValueAt(i, 1).toString();
//                String result;
//
//                boolean attendance = Boolean.parseBoolean(ClassAttendanceTable.getModel().getValueAt(i, 3).toString());
//
//                if (attendance) {
//                    result = "Present";
//                } else {
//                    result = "Absent";
//                }
//
//                pst=conn.prepareStatement("insert into std_attend values ('" + d + "','" + id + "','" + name + "','" + jLabelbatchCode.getText() + "','" + jComboBoxBook.getSelectedItem() + "','" + result + "')");
//                pst.executeUpdate();
//            }
//            JOptionPane.showMessageDialog(this, "Attendance Marked", "Notify", JOptionPane.PLAIN_MESSAGE);
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(jPanelForPresent, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        clearingTable();
//        clearing();
    }//GEN-LAST:event_ClassAttendanceButtonActionPerformed

    private void submit_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_attendanceActionPerformed
        java.util.Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                java.util.Date d = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String timeString = sdf.format(d);

                String value0 = timeString;
                String value1 = sdf.format(datechooser.getDate());
//                System.out.println(value1);
                Object course=subcombobox.getSelectedItem();

                try{
                    
                    for (int i = 0; i < tblAttendance.getRowCount(); i++) {
                String id = tblAttendance.getModel().getValueAt(i, 0).toString();
                        System.out.println(id);
                String name = tblAttendance.getModel().getValueAt(i, 1).toString();
//                String result;
//System.out.println(name);
//                boolean attendance = Boolean.parseBoolean(tblAttendance.getModel().getValueAt(i, 3).toString());
                String attendance = tblAttendance.getModel().getValueAt(i, 3).toString();
//System.out.println(attendance);

//                if (attendance) {
//                    result = "Present";
//                } else {
//                    result = "Absent";
//                }

                pst=conn.prepareStatement("insert into std_attend values ('" + value1 + "','" + id + "','" + name + "','" + jLabelbatchCode.getText() + "','" + subcombobox.getSelectedItem() + "','" + attendance + "')");
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Attendance Marked", "Notify", JOptionPane.PLAIN_MESSAGE);
//

//                    String reg= "insert into Admin_Audit ( date, status) values ('"+value0+" / "+value1+"','Added Record')";
//                    pst=conn.prepareStatement(reg);
//                    pst.execute();

                }
                catch (HeadlessException | SQLException e)

                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_submit_attendanceActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        try {

            String query="select distinct AddStudent.std_id ,CONCAT(AddStudent.firstname,' ',AddStudent.Surname)as Name,AddStudent.Std_batch as Student_Batch , std_attend.std_status as Attendance_Status from AddStudent left join std_attend on AddStudent.Std_id=std_attend.Std_id order by Std_id asc";
            pst=conn.prepareStatement(query);
            
            ResultSet rst = pst.executeQuery();

            
            tblAttendance.setModel(DbUtils.resultSetToTableModel(rst));
//            tblAttendance.addColumn(Attendance);

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);

//            JOptionPane.showMessageDialog(null, "Attendance is already Marked", "Choosen Marked Date", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void subcomboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subcomboboxMouseClicked
        // TODO add your handling code here:
        try {
                    String query="select course_name from AddTeacher";
                            
                    pst=conn.prepareStatement(query);

                    ResultSet rst = pst.executeQuery();
                    
                    while(rst.next()){
                        String sub=rst.getString("Course_name");
                        System.out.println("sub");
                        subcombobox.addItem(sub);                    
                    }
                    }
        
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
}
        
    }//GEN-LAST:event_subcomboboxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClassAttendanceButton;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelbatchCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> subcombobox;
    private javax.swing.JButton submit_attendance;
    private javax.swing.JTable tblAttendance;
    // End of variables declaration//GEN-END:variables
}
