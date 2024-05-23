/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.GameManager;

/**
 *
 * @author Suthasoma
 */
public class PluginModal extends javax.swing.JFrame {

    private MainFrame frame;
    private String folderPath = "";
    private GameManager game;
    /**
     * Creates new form PluginModal
     */
    public PluginModal(MainFrame parent) {
        game = GameManager.getInstance();
        setUndecorated(true);
        initComponents();
        frame = parent;
        this.setLocationRelativeTo(frame);
        this.setBackground(new Color(0f,0f,0f,0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPane1 = new gui.RoundedPane();
        backButton = new gui.ButtonRounded();
        jLabel1 = new javax.swing.JLabel();
        uploadButton = new gui.ButtonRounded();
        statusUpload = new javax.swing.JLabel();
        fileChoose = new gui.ButtonRounded();
        fileName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roundedPane1.setBackground(new java.awt.Color(1f, 0.8f, 0.8f, 0.8f));
        roundedPane1.setBordered(false);
        roundedPane1.setRoundBottomLeft(40);
        roundedPane1.setRoundBottomRight(40);
        roundedPane1.setRoundTopLeft(40);
        roundedPane1.setRoundTopRight(40);

        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plugin");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        fileChoose.setText("Choose File");
        fileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPane1Layout = new javax.swing.GroupLayout(roundedPane1);
        roundedPane1.setLayout(roundedPane1Layout);
        roundedPane1Layout.setHorizontalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPane1Layout.createSequentialGroup()
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(statusUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundedPane1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(fileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPane1Layout.setVerticalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPane1Layout.createSequentialGroup()
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        if (folderPath.equals("")) {
            JOptionPane.showMessageDialog(this, "File nya mana lekkk");
        } else {
            try {
                game.addPlugin(folderPath);
                statusUpload.setForeground(Color.GREEN);
                statusUpload.setText("Mantap lekk! Plugin sukses ditambahkan..");
            } catch (Exception e) {
                statusUpload.setForeground(Color.RED);
                statusUpload.setText("Waduh lekk! Pluginnya ga valid..");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        frame.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void fileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooseActionPerformed
        // TODO add your handling code here:
        JFileChooser folderChooser = new JFileChooser();
        folderChooser.setDialogTitle("Pilih folder penyimpanan");
        folderChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        folderChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jar-file", "jar");
        folderChooser.setFileFilter(filter);
        folderChooser.setPreferredSize(new Dimension(800, 600));
        int option = folderChooser.showOpenDialog(this);
        
        if (option == JFileChooser.APPROVE_OPTION) {
            java.io.File chosenFile = folderChooser.getSelectedFile();
            folderPath = chosenFile.getAbsolutePath();
            fileName.setText(folderPath);
        }
    }//GEN-LAST:event_fileChooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.ButtonRounded backButton;
    private gui.ButtonRounded fileChoose;
    private javax.swing.JLabel fileName;
    private javax.swing.JLabel jLabel1;
    private gui.RoundedPane roundedPane1;
    private javax.swing.JLabel statusUpload;
    private gui.ButtonRounded uploadButton;
    // End of variables declaration//GEN-END:variables
}