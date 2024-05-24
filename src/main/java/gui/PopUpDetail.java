/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import models.*;

/**
 *
 * @author Suthasoma
 */
public class PopUpDetail extends javax.swing.JFrame {
    
    private CardItem parent;
    private LivingThing object;

    /**
     * Creates new form PopUpDetail
     */
    public PopUpDetail(CardItem parent) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/logos/icon.png"));
        setIconImage(icon.getImage());
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.parent = parent;
        this.object = (LivingThing) parent.getObject();
        setEffectTable();
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        roundedPane1.setBackground(new Color(0.9f, 0.9f, 0.8f, 0.9f));
        if (object instanceof Animal) {
            setDataAnimal();
        } else {
            setDataPlant();
        }
        setLocationRelativeTo(parent.getsParent());
        if (!parent.isSwap()) {
            panenButton.setVisible(false);
        }
    }
    
    private void setEffectTable() {
        String data[][] = new String[4][2];
        data[0][0] = "ACCELERATE";
        data[1][0] = "DELAY";
        data[2][0] = "PROTECT";
        data[3][0] = "TRAP";
        data[0][1] = "0";
        data[1][1] = "0";
        data[2][1] = "0";
        data[3][1] = "0";
        for (Item item : object.getItems()) {
            for (int i = 0; i < 4; i++) {
                if (item.getNameParsed().equals(data[i][0])) {
                    data[i][1] = Integer.toString(Integer.parseInt(data[i][1])+1);
                    break;
                }
            }
        }
        caccelerate.setText(data[0][1]);
        cdelay.setText(data[1][1]);
        cprotect.setText(data[2][1]);
        ctrap.setText(data[3][1]);
    }

    private void setDataPlant() {
        Plant plant = (Plant) object;
        weightLabel.setText("Umur:");
        harvestLabel.setText("Umur Panen:");
        weightAmount.setText(Integer.toString(plant.getAge()));
        harvestAmount.setText(Integer.toString(plant.getAgeToHarvest()));
        if (plant.isInstantHarvest() || plant.getAge() >= plant.getAgeToHarvest()) {
            nameLabel.setText(plant.getProduct().getNameParsed());
            imageLabel.setIcon(new ImageIcon(plant.getProduct().getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            panenButton.setEnabled(false);
            nameLabel.setText(plant.getNameParsed());
            imageLabel.setIcon(new ImageIcon(plant.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH)));
        }
    }
    
    private void setDataAnimal() {
        Animal animal = (Animal) object;
        weightLabel.setText("Berat:");
        harvestLabel.setText("Berat Panen:");
        weightAmount.setText(Integer.toString(animal.getWeight()));
        harvestAmount.setText(Integer.toString(animal.getWeightToHarvest()));
        nameLabel.setText(object.getNameParsed());
        imageLabel.setIcon(new ImageIcon(animal.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH)));
        if (!animal.isInstantHarvest() && animal.getWeight() < animal.getWeightToHarvest()) {
            panenButton.setEnabled(false);
        }
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
        imageLabel = new javax.swing.JLabel();
        harvestLabel = new javax.swing.JLabel();
        backButton = new gui.ButtonRounded();
        weightLabel = new javax.swing.JLabel();
        panenButton = new gui.ButtonRounded();
        nameLabel = new javax.swing.JLabel();
        weightAmount = new javax.swing.JLabel();
        harvestAmount = new javax.swing.JLabel();
        buttonRounded1 = new gui.ButtonRounded();
        buttonRounded2 = new gui.ButtonRounded();
        buttonRounded3 = new gui.ButtonRounded();
        buttonRounded4 = new gui.ButtonRounded();
        caccelerate = new gui.ButtonRounded();
        cdelay = new gui.ButtonRounded();
        cprotect = new gui.ButtonRounded();
        ctrap = new gui.ButtonRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        setResizable(false);

        roundedPane1.setRoundBottomLeft(30);
        roundedPane1.setRoundBottomRight(30);
        roundedPane1.setRoundTopLeft(30);
        roundedPane1.setRoundTopRight(30);
        roundedPane1.setBordered(false);

        harvestLabel.setText("jLabel1");

        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        weightLabel.setText("jLabel1");

        panenButton.setText("Panen");
        panenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panenButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setAlignmentX(1.0F);
        nameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        weightAmount.setText("jLabel1");

        harvestAmount.setText("jLabel1");

        buttonRounded1.setText("Accelerate");
        buttonRounded1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRounded1ActionPerformed(evt);
            }
        });

        buttonRounded2.setText("Delay");

        buttonRounded3.setText("Protect");
        buttonRounded3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRounded3ActionPerformed(evt);
            }
        });

        buttonRounded4.setText("Trap");

        caccelerate.setText("0");

        cdelay.setText("0");

        cprotect.setText("0");

        ctrap.setText("0");

        javax.swing.GroupLayout roundedPane1Layout = new javax.swing.GroupLayout(roundedPane1);
        roundedPane1.setLayout(roundedPane1Layout);
        roundedPane1Layout.setHorizontalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundedPane1Layout.createSequentialGroup()
                                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonRounded1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(buttonRounded2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonRounded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonRounded4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caccelerate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cdelay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cprotect, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctrap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundedPane1Layout.createSequentialGroup()
                                    .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(weightAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(roundedPane1Layout.createSequentialGroup()
                                    .addComponent(harvestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(harvestAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        roundedPane1Layout.setVerticalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabel)
                            .addComponent(weightAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harvestLabel)
                            .addComponent(harvestAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caccelerate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdelay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cprotect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctrap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(panenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(roundedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        parent.getsParent().setEnabled(true);
        parent.getsParent().setFocusable(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void panenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panenButtonActionPerformed
        // TODO add your handling code here:
        if (!parent.getOwner().isActiveDeckFull()) {
            try {
                parent.getOwner().harvestField(parent.getPosition());
                parent.getsParent().refreshActiveDeck();
                parent.getsParent().changeFieldToPlayer();
//                System.out.println(parent.getPosition().getFirst()+", "+parent.getPosition().getSecond()+": "+parent.getObject().getName());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(parent.getsParent(), "Kartu yang dipanen sudah menghilang...clear", "Warning", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(parent.getsParent(), "Tidak dapat memanen. Deck aktif penuh.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        parent.getsParent().setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_panenButtonActionPerformed

    private void buttonRounded1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRounded1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRounded1ActionPerformed

    private void buttonRounded3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRounded3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRounded3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.ButtonRounded backButton;
    private gui.ButtonRounded buttonRounded1;
    private gui.ButtonRounded buttonRounded2;
    private gui.ButtonRounded buttonRounded3;
    private gui.ButtonRounded buttonRounded4;
    private gui.ButtonRounded caccelerate;
    private gui.ButtonRounded cdelay;
    private gui.ButtonRounded cprotect;
    private gui.ButtonRounded ctrap;
    private javax.swing.JLabel harvestAmount;
    private javax.swing.JLabel harvestLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel nameLabel;
    private gui.ButtonRounded panenButton;
    private gui.RoundedPane roundedPane1;
    private javax.swing.JLabel weightAmount;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
