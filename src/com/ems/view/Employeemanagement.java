package com.ems.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.ems.util.Dbconnection;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Employeemanagement extends javax.swing.JFrame {

Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

   

    public Employeemanagement() {
        initComponents();
        conn = Dbconnection.getConnection();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        Fillcombo();
        Fillcombo1();
        Fillcomboemp();
    }
    
     private void Fillcomboemp() {
        try {
            String sql = "select emp_id from staff_information ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("emp_id");
                cmb_id.addItem(id);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }

    }

    private void Fillcombo() {
        try {
            String sql = "select * from department ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("dep_name");
                combo1.addItem(id);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }

    }
     
    private void Fillcombo1() {
        try {
            String sql = "select desig_name from designation ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("desig_name");
                cmb_job_role.addItem(id);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_add = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmd_Update = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        r_female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        btn_attach = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<String>();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        person_img = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        cmb_job_role = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        cmbsalary = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        cmb_id = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 34, 190, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 79, -1));

        txt_nic.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 197, 190, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 79, 14));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 283, 79, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_16x16.gif"))); // NOI18N
        jButton1.setText("Delete Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 135, 46));

        txt_add.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 363, 194, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("Date joined");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 119, 75, -1));

        cmd_Update.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmd_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow_refresh.png"))); // NOI18N
        cmd_Update.setText("Update Record");
        cmd_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 135, 46));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("NIC");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 75, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("Job Role");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 83, 75, -1));

        txt_email.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 283, 194, -1));

        txt_lname.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 116, 190, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Date Of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 79, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 79, -1));

        txt_tel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        jPanel1.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 323, 194, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("Department");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 37, 75, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Address ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 363, 87, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Telephone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 323, 70, -1));

        txt_fname.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 77, 190, -1));

        r_female.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });
        jPanel1.add(r_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 243, 72, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 243, 79, -1));

        r_male.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });
        jPanel1.add(r_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 243, 72, -1));

        btn_attach.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_attach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attach.png"))); // NOI18N
        btn_attach.setText("Attach Image");
        btn_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attachActionPerformed(evt);
            }
        });
        jPanel1.add(btn_attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 130, 34));

        cmd_clear.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmd_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 135, 46));

        cmd_save.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/status_online.png"))); // NOI18N
        cmd_save.setText("Add Record");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 135, 46));

        combo1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 187, -1));

        lblpassword.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblpassword.setText("Password");
        jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 163, -1, -1));

        txtpassword.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 187, -1));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(person_img, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(person_img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(person_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jDateChooser1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 154, 190, -1));

        jDateChooser2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 187, -1));

        cmb_job_role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Designation" }));
        cmb_job_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_job_roleActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_job_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 190, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Basic Salary");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        cmbsalary.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Amount", "50000", "40000", "30000", "25000", "20000", "15000", " " }));
        jPanel1.add(cmbsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 860, 410));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N

        txt_search.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Employee ID ");

        btn_search.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        cmb_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ID" }));
        cmb_id.setMinimumSize(new java.awt.Dimension(75, 22));
        cmb_id.setPreferredSize(new java.awt.Dimension(75, 25));
        cmb_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_idActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("OR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(cmb_id, 0, 131, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        jMenu1.setText("Manage Users");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/status_online.png"))); // NOI18N
        jMenuItem1.setText("Add User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_r_femaleActionPerformed

    private void cmd_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_UpdateActionPerformed
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            if (r_male.isSelected()) {
                gender = "Male";
            } else if (r_female.isSelected()) {
                gender = "Female";
            }
            
            try{
                byte[] img = rs.getBytes("Image");
               ImageIcon  ImageIcon = new  ImageIcon (new  ImageIcon (img).getImage().getScaledInstance(person_img.getWidth(),person_img. getHeight(), Image.SCALE_SMOOTH));
               person_img.setIcon(ImageIcon);
        }
             catch (Exception e) {

            JOptionPane.showMessageDialog(this,"no data in databse");
        }
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           
            try{

                String value1 = txt_fname.getText();
                String value2 = txt_lname.getText();
                String value3 = dateFormat.format(jDateChooser1.getDate());
                String value4 = txt_nic.getText();
                String value5 = gender;
                String value6 = txt_email.getText();
                String value7 = txt_tel.getText();
                String value8 = txt_add.getText();
                String value9 = (String) combo1.getSelectedItem();
                String value10 = (String) cmb_job_role.getSelectedItem();
                String value11 = dateFormat.format(jDateChooser2.getDate());
                String value12 = txtpassword.getText();
                String value13 = txt_id.getText();
     
                String value15 = (String) cmbsalary.getSelectedItem();
                

                String sql= "update staff_information set emp_id='"+value13+"',first_name='"+value1+"', last_name='"+value2+"', "
                        + "Dob='"+value3+"',nic='"+value4+"',Gender='"+value5+"',Email='"+value6+"',Telephone='"+value7+"',"
                        + "Address='"+value8+"',Department='"+value9+"', job_role = '"+value10+"', "
                        + "Date_hired = '"+value11+"', password ='"+value12+"',  Salary ='"+value15+"' "
                        + " where emp_id='"+value13+"' ";
           
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Record Updated");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                         
           
        }
    }//GEN-LAST:event_cmd_UpdateActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_r_maleActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        
        txt_search.setText("");
        txt_id.setText("");
        txt_fname.setText("");
        txt_lname.setText("");
        txt_tel.setText("");        
        jDateChooser1.setDate(null);
        txt_email.setText("");
        txt_add.setText("");
        combo1.setSelectedItem(null);
        r_male.setSelected(false);
        r_female.setSelected(false);
        txt_nic.setText("");
        cmb_job_role.setSelectedItem(null);
        jDateChooser2.setDate(null);
        person_img.setIcon(null);
        txtpassword.setText("");
        cmbsalary.setSelectedItem(null);
        cmb_id.setSelectedItem(null);
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void btn_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attachActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(person_img.getWidth(), person_img.getHeight(), Image.SCALE_DEFAULT));
        person_img.setIcon(imageIcon);

        try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {

                bos.write(buf, 0, readNum);
            }

            person_image = bos.toByteArray();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_btn_attachActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            String sql = "delete from staff_information where emp_id=? ";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Record Deleted");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {

                }
            }
            try {

                String sq = "delete from users where emp_id =?";
                pst = conn.prepareStatement(sq);
                pst.setString(1, txt_id.getText());
                pst.execute();

            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "select * from staff_information where emp_id=?  ";
                       

            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();

            while (rs.next()) {

                String add1 = rs.getString("Emp_id");
                txt_id.setText(add1);

                String add2 = rs.getString("first_name");
                txt_fname.setText(add2);

                String add3 = rs.getString("surname");
                txt_lname.setText(add3);

                
                String add4 = rs.getString("Dob"); 
                java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(add4);
                jDateChooser1.setDate(date);

                String add5 = rs.getString("nic");
                txt_nic.setText(add5);

                String add6 = rs.getString("Gender");

                if (add6.equals("Male")) {
                    r_male.setSelected(true);
                    r_female.setSelected(false);

                } else if (add6.equals("Female")) {

                    r_female.setSelected(true);
                    r_male.setSelected(false);
                } else {
                    r_male.setSelected(false);
                    r_female.setSelected(false);

                }

                String add7 = rs.getString("Email");
                txt_email.setText(add7);

                String add8 = rs.getString("Telephone");
                txt_tel.setText(add8);

                String add9 = rs.getString("Address");
                txt_add.setText(add9);

                String add10 = rs.getString("dep_id");
                combo1.setSelectedItem(add10);

                String add11 = rs.getString("desig_id");
                cmb_job_role.setSelectedItem(add11);

                String add12 = rs.getString("Date_hired"); 
                java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(add12);
                jDateChooser2.setDate(date1);

                String add13 = rs.getString("password");
                txtpassword.setText(add13);
                
                String add14 = rs.getString("Salary");
                cmbsalary.setSelectedItem(add14);

                byte[] img = rs.getBytes("Image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(person_img.getWidth(), person_img.getHeight(), Image.SCALE_DEFAULT));
                person_img.setIcon(imageIcon);
                
                

            }
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Missing Data  ");

            System.out.println(e);

        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            //String password = txtpassword.getText();
            if (r_male.isSelected()) {
                gender = "Male";
            } else if (r_female.isSelected()) {
                gender = "Female";
            }
                      
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            try {
                String sql = "insert into staff_information "
                        + "(first_name,last_name,Dob,nic,Gender,Email,"
                        + "Telephone,Address,Department,"
                        + "job_role,Date_hired,password,"
                        + "emp_id,Image,Salary) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_fname.getText());
                pst.setString(2, txt_lname.getText());
                pst.setString(3, dateFormat.format(jDateChooser1.getDate()));
                pst.setString(4, txt_nic.getText());
                pst.setString(5, gender);
                pst.setString(6, txt_email.getText());
                pst.setString(7, txt_tel.getText());
                pst.setString(8, txt_add.getText());
                pst.setString(9, (String) combo1.getSelectedItem());
                pst.setString(10, (String) cmb_job_role.getSelectedItem());
                pst.setString(11, dateFormat.format(jDateChooser2.getDate()));                              
                pst.setString(12, txtpassword.getText());
                pst.setString(13, txt_id.getText());
                pst.setBytes(14, person_image);
                pst.setString(15, (String) cmbsalary.getSelectedItem());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
            
             finally {
                    try{
                        rs.close();
                        pst.close();
                    }catch(Exception r){
                        JOptionPane.showMessageDialog(null,r);
                    }
                }
        }

    }//GEN-LAST:event_cmd_saveActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        
        
       /*  try {
            
            String sql1 = "SELECT * from designation join department on department.dep_id=designation.dep_id where department.dep_name=?";

            pst = conn.prepareStatement(sql1);
            pst.setString(1, (String) cmb_job_role.getSelectedItem());
            rs = pst.executeQuery();
            
            while (rs.next()) {    
            
                String id = rs.getString("desig_name");
                cmb_job_role.addItem(id);
                
            }    
                
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        */
        
    }//GEN-LAST:event_combo1ActionPerformed

    private void cmb_job_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_job_roleActionPerformed
        
       
    }//GEN-LAST:event_cmb_job_roleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        user x = new user();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cmb_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_idActionPerformed
        // TODO add your handling code here:
        
        try {

            String sql = "select * from staff_information where emp_id=?  ";
                       

            pst = conn.prepareStatement(sql);
            pst.setString(1, (String) cmb_id.getSelectedItem());
            rs = pst.executeQuery();

            while (rs.next()) {

                String add1 = rs.getString("Emp_id");
                txt_id.setText(add1);

                String add2 = rs.getString("first_name");
                txt_fname.setText(add2);

                String add3 = rs.getString("surname");
                txt_lname.setText(add3);

                
                String add4 = rs.getString("Dob"); 
                java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(add4);
                jDateChooser1.setDate(date);

                String add5 = rs.getString("nic");
                txt_nic.setText(add5);

                String add6 = rs.getString("Gender");

                if (add6.equals("Male")) {
                    r_male.setSelected(true);
                    r_female.setSelected(false);

                } else if (add6.equals("Female")) {

                    r_female.setSelected(true);
                    r_male.setSelected(false);
                } else {
                    r_male.setSelected(false);
                    r_female.setSelected(false);

                }

                String add7 = rs.getString("Email");
                txt_email.setText(add7);

                String add8 = rs.getString("Telephone");
                txt_tel.setText(add8);

                String add9 = rs.getString("Address");
                txt_add.setText(add9);

                String add10 = rs.getString("dep_id");
                combo1.setSelectedItem(add10);

                String add11 = rs.getString("desig_id");
                cmb_job_role.setSelectedItem(add11);

                String add12 = rs.getString("Date_hired"); 
                java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(add12);
                jDateChooser2.setDate(date1);

                String add13 = rs.getString("password");
                txtpassword.setText(add13);
                
                String add14 = rs.getString("Salary");
                cmbsalary.setSelectedItem(add14);

                byte[] img = rs.getBytes("Image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(person_img.getWidth(), person_img.getHeight(), Image.SCALE_DEFAULT));
                person_img.setIcon(imageIcon);
                
                

            }
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Missing Data  ");

            System.out.println(e);

        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_cmb_idActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Employeemanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeemanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeemanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeemanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeemanagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_attach;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox cmb_id;
    private javax.swing.JComboBox<String> cmb_job_role;
    private javax.swing.JComboBox<String> cmbsalary;
    private javax.swing.JButton cmd_Update;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_save;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel person_img;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
    String filename = null;
    private String gender;

    private ImageIcon format = null;
    byte[] person_image = null;

}
