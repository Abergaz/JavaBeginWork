/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_8h.gui;

/**
 *
 * @author Tim
 */
public class FrameSavedGames extends BaseChildFrame {

    /**
     * Creates new form FrameSavedGames
     */
    public FrameSavedGames() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGames = new javax.swing.JTable();
        jbtnLoadGame = new javax.swing.JButton();
        jbtnReturn = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        jTableGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableGames.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableGames);

        jbtnLoadGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_8h/images/load_small.png"))); // NOI18N
        jbtnLoadGame.setText("Загрузить");
        jbtnLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoadGameActionPerformed(evt);
            }
        });

        jbtnReturn.setText("<< в меню");
        jbtnReturn.setName("FrameStat"); // NOI18N
        jbtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReturnActionPerformed(evt);
            }
        });

        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_8h/images/delete.png"))); // NOI18N
        jbtnDelete.setText("Удалить");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnReturn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnLoadGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDelete)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLoadGame)
                    .addComponent(jbtnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-662)/2, (screenSize.height-420)/2, 662, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoadGameActionPerformed

    }//GEN-LAST:event_jbtnLoadGameActionPerformed

    private void jbtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReturnActionPerformed
        closeFrame();
    }//GEN-LAST:event_jbtnReturnActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
       
    }//GEN-LAST:event_jbtnDeleteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGames;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnLoadGame;
    private javax.swing.JButton jbtnReturn;
    // End of variables declaration//GEN-END:variables
}
