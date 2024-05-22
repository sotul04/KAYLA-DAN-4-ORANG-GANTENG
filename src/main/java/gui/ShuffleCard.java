/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.sun.source.tree.ParenthesizedTree;
import java.awt.*;
import java.util.ArrayList;
import models.*;

/**
 *
 * @author Suthasoma
 */
public class ShuffleCard extends javax.swing.JFrame {

    private ArrayList<GameObject> cardList = new ArrayList<>();
    private int maxCards;
    private MainFrame parent;
    private Player owner;
    /**
     * Creates new form ShuffleCard
     */
    public ShuffleCard(ArrayList<GameObject> cards, int max, MainFrame parent, Player owner) {
        this.parent = parent;
        this.owner = owner;
        initComponents();
        setLocationRelativeTo(parent);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        maxCards = max;
        refreshItem(cards);
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
        shuffleAgainButton = new gui.ButtonRounded();
        jPanel1 = new javax.swing.JPanel();
        cardShuffle1 = new gui.CardShuffle();
        cardShuffle2 = new gui.CardShuffle();
        cardShuffle3 = new gui.CardShuffle();
        cardShuffle4 = new gui.CardShuffle();
        nextButton = new gui.ButtonRounded();
        leftCardLabel = new gui.ButtonRounded();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        setResizable(false);

        roundedPane1.setBackground(new java.awt.Color(153, 204, 255));
        roundedPane1.setRoundBottomLeft(30);
        roundedPane1.setRoundBottomRight(30);
        roundedPane1.setRoundTopLeft(30);
        roundedPane1.setRoundTopRight(30);

        shuffleAgainButton.setBackground(new Color(0.96f, 0.953f, 0.9f, 0.1f));
        shuffleAgainButton.setBackground(new Color(0.2f, 0.8f, 0.9f, 0.1f));
        shuffleAgainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonicon/Available Updates_5.png"))); // NOI18N
        shuffleAgainButton.setColor(new Color(0.7f, 0.9f, 0.9f, 0.3f));
        shuffleAgainButton.setColorClick(new Color(0.2f, 0.8f, 0.9f, 0.3f));
        shuffleAgainButton.setColorOver(new Color(0.8f, 0.9f, 0.3f, 0.3f));
        shuffleAgainButton.setRadius(60);
        shuffleAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shuffleAgainButtonActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        cardShuffle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardShuffle1MouseClicked(evt);
            }
        });
        jPanel1.add(cardShuffle1);

        cardShuffle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardShuffle2MouseClicked(evt);
            }
        });
        jPanel1.add(cardShuffle2);

        cardShuffle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardShuffle3MouseClicked(evt);
            }
        });
        jPanel1.add(cardShuffle3);

        cardShuffle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardShuffle4MouseClicked(evt);
            }
        });
        jPanel1.add(cardShuffle4);

        nextButton.setText("Lanjutkan");
        nextButton.setRadius(30);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        leftCardLabel.setText(" ");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kartu tersisa:");

        javax.swing.GroupLayout roundedPane1Layout = new javax.swing.GroupLayout(roundedPane1);
        roundedPane1.setLayout(roundedPane1Layout);
        roundedPane1Layout.setHorizontalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(roundedPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shuffleAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        roundedPane1Layout.setVerticalGroup(
            roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(roundedPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shuffleAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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

    public void refreshItem(ArrayList<GameObject> list) {
        cardShuffle1.setObject(list.get(0));
        cardShuffle2.setObject(list.get(1));
        cardShuffle3.setObject(list.get(2));
        cardShuffle4.setObject(list.get(3));
        updateLeftCards();
    }
    
    private void shuffleAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shuffleAgainButtonActionPerformed
        // TODO add your handling code here:
        cardList.clear();
        ArrayList<GameObject> newOne = new ArrayList<>(owner.shuffleCard());
        refreshItem(newOne);
    }//GEN-LAST:event_shuffleAgainButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        owner.updateSelectedDeck(cardList);
        parent.refreshActiveDeck();
        parent.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void updateLeftCards() {
        leftCardLabel.setText(Integer.toString(maxCards - cardList.size()));
    }
    
    private void cardShuffle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardShuffle1MouseClicked
        // TODO add your handling code here:
        cardShuffle1.swapShuffleColor();
        if (cardShuffle1.isPicked()) {
            if (maxCards < cardList.size() + 1) {
                cardShuffle1.swapShuffleColor();
                return;
            }
            cardList.add(cardShuffle1.getObject());
        } else {
            cardList.remove(cardShuffle1.getObject());
        }
        updateLeftCards();
    }//GEN-LAST:event_cardShuffle1MouseClicked

    private void cardShuffle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardShuffle2MouseClicked
        // TODO add your handling code here:
        cardShuffle2.swapShuffleColor();
        if (cardShuffle2.isPicked()) {
            if (maxCards < cardList.size() + 1) {
                cardShuffle2.swapShuffleColor();
                return;
            }
            cardList.add(cardShuffle2.getObject());
        } else {
            cardList.remove(cardShuffle2.getObject());
        }
        updateLeftCards();
    }//GEN-LAST:event_cardShuffle2MouseClicked

    private void cardShuffle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardShuffle3MouseClicked
        // TODO add your handling code here:
        cardShuffle3.swapShuffleColor();
        if (cardShuffle3.isPicked()) {
            if (maxCards < cardList.size() + 1) {
                cardShuffle3.swapShuffleColor();
                return;
            }
            cardList.add(cardShuffle3.getObject());
        } else {
            cardList.remove(cardShuffle3.getObject());
        }
        updateLeftCards();
    }//GEN-LAST:event_cardShuffle3MouseClicked

    private void cardShuffle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardShuffle4MouseClicked
        // TODO add your handling code here:
        cardShuffle4.swapShuffleColor();
        if (cardShuffle4.isPicked()) {
            if (maxCards < cardList.size() + 1) {
                cardShuffle4.swapShuffleColor();
                return;
            }
            cardList.add(cardShuffle4.getObject());
        } else {
            cardList.remove(cardShuffle4.getObject());
        }
        updateLeftCards();
    }//GEN-LAST:event_cardShuffle4MouseClicked

    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ShuffleCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShuffleCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShuffleCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShuffleCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ArrayList<GameObject> anjing = new ArrayList<>();
//                anjing.add(new Carnivore());
//                anjing.add(new Trap());
//                anjing.add(new Omnivore("BERUANG"));
//                anjing.add(new Destroy());
////                new ShuffleCard(anjing, 4).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.CardShuffle cardShuffle1;
    private gui.CardShuffle cardShuffle2;
    private gui.CardShuffle cardShuffle3;
    private gui.CardShuffle cardShuffle4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private gui.ButtonRounded leftCardLabel;
    private gui.ButtonRounded nextButton;
    private gui.RoundedPane roundedPane1;
    private gui.ButtonRounded shuffleAgainButton;
    // End of variables declaration//GEN-END:variables
}
