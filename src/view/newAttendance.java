/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import database.DbConnection;
import java.sql.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        jComboBoxBook = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ClassAttendanceButton = new javax.swing.JButton();
        TableButton = new javax.swing.JButton();
        AbsenteesButton = new javax.swing.JButton();
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
        jLabel1.setBounds(210, 60, 100, 30);

        jLabelbatchCode.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelbatchCode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbatchCode.setText("Batch 32A");
        jPanel1.add(jLabelbatchCode);
        jLabelbatchCode.setBounds(330, 60, 240, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 120, 100, 30);

        jComboBoxBook.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBoxBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBookActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxBook);
        jComboBoxBook.setBounds(330, 120, 240, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 200, 70, 30);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(330, 200, 240, 30);

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
        ClassAttendanceButton.setBounds(430, 260, 110, 30);

        TableButton.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        TableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/table.png"))); // NOI18N
        TableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TableButton);
        TableButton.setBounds(220, 260, 110, 30);

        AbsenteesButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        AbsenteesButton.setText("Mark Absent Student Attendance");
        AbsenteesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbsenteesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenteesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AbsenteesButton);
        AbsenteesButton.setBounds(620, 260, 250, 40);

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

    private void jComboBoxBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBookActionPerformed
        // TODO add your handling code here:
//        try {
//            jComboBoxBook.addItem("Please Select....");
//            ResultSet rs = conn.createStatement().executeQuery("select course from AddTeacher ");//group by std_book_session
//            while (rs.next()) {
//                jComboBoxBook.addItem(rs.getString(1));
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//        }
    }//GEN-LAST:event_jComboBoxBookActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:

        /**
        * Restricting Using from Marking Attendance on future date
        //         */
        //        try {
            //            //JDateChooser Format
            //            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            //            String finaldate = comparedate.format(jDateChooser1.getDate());
            //
            //            //Current Date Formats
            //            DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
            //            Date date = new Date();
            //            String matchdate = dateFormatcurrrent.format(date);
            //
            //            if (finaldate.compareTo(matchdate) > 0) {
                //                JOptionPane.showMessageDialog(null, "Your can't mark attendance on Future Date", "Future Date", JOptionPane.WARNING_MESSAGE);
                //                ClassAttendanceButton.setEnabled(false);
                //            } else {
                //                ClassAttendanceButton.setEnabled(true);
                //            }
            //        } catch (Exception ex) {
            //            System.out.println(ex.toString());
            //        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void ClassAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassAttendanceButtonActionPerformed
        // TODO add your handling code here:

//        /**
//        * Casting the jDateChooser with the help of SimpleDateFormat Variable d
//        * is pass to get the date and save it in database
//        */
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        String d = sdf.format(jDateChooser1.getDate());
//
//        try {
//            for (int i = 0; i < ClassAttendanceTable.getRowCount(); i++) {
//                String id = ClassAttendanceTable.getModel().getValueAt(i, 0).toString();
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

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        // TODO add your handling code here:
        /**
        * Retrieving data from database
        */
        //        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        //        String d = sdf.format(jDateChooser1.getDate());
        //
        //        try {
            //
            //            CallableStatement call = conn.prepareCall("{ call myproc( ? , ?) }");
            //            call.setString(1, d);
            //            call.setString(2, jLabelbatchCode.getText());
            //            ResultSet rs = call.executeQuery();
            //
            //            DefaultTableModel dt = (DefaultTableModel) ClassAttendanceTable.getModel();
            //            while (rs.next()) {
                //                dt.addRow(new Object[]{rs.getString("std_id"), rs.getString("std_name"), rs.getString("std_batch"), false});
                //            }
            //            ClassAttendanceTable.setModel(dt);
            //
            //        } catch (Exception ex) {
            //
            //            JOptionPane.showMessageDialog(null, "Attendance is already Marked", "Choosen Marked Date", JOptionPane.WARNING_MESSAGE);
            //        }
    }//GEN-LAST:event_TableButtonActionPerformed

    private void AbsenteesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenteesButtonActionPerformed
        // TODO add your handling code here:
        /**
        * This Button is for retrieving absent student data
        */
//
//        jPanelForAbsent.setVisible(true);
//        jPanelForPresent.setVisible(false);
    }//GEN-LAST:event_AbsenteesButtonActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

//        // TODO add your handling code here:
//         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        String d = sdf.format(jDateChooser1.getDate());

        try {
            
//            CallableStatement call = conn.prepareCall("{ call myproc( ? , ?) }");
//            call.setString(1, d);
//            call.setString(2, jLabelbatchCode.getText());
            String query="select AddStudent.std_id ,CONCAT(AddStudent.firstname,' ',AddStudent.Surname)as Name,AddStudent.Std_batch as Student_Batch , std_attend.std_status as Attendance_Status from AddStudent left join std_attend on AddStudent.Std_id=std_attend.Std_id order by Std_id asc";
            pst=conn.prepareStatement(query);
            
            ResultSet rst = pst.executeQuery();

//            DefaultTableModel dt = (DefaultTableModel) tblAttendance.getModel();
//            while (rst.next()) {
////                dt.addRow(new Object[]{rst.getString("std_id"), rst.getString("FirstName"), rst.getString("std_batch"), false});
//            }
            
            tblAttendance.setModel(DbUtils.resultSetToTableModel(rst));
//            tblAttendance.addColumn(Attendance);

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);

//            JOptionPane.showMessageDialog(null, "Attendance is already Marked", "Choosen Marked Date", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsenteesButton;
    private javax.swing.JButton ClassAttendanceButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JComboBox<String> jComboBoxBook;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelbatchCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAttendance;
    // End of variables declaration//GEN-END:variables
}