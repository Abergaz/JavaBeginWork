package com.javabegin.training.game.goldman_11.gui;


import com.javabegin.training.game.goldman_11.gamemap.impl.JTableGameMap;
import com.javabegin.training.game.goldman_11.gamemap.loader.abstracts.AbstractMapLoader;
import com.javabegin.training.game.goldman_11.gamemap.loader.impl.DBMapLoader;
import com.javabegin.training.game.goldman_11.objects.MapInfo;
import com.javabegin.training.game.goldman_11.objects.User;
import com.javabegin.training.game.goldman_11.score.impl.DbScoreSaver;
import com.javabegin.training.game.goldman_11.score.interfaces.ScoreSaver;
import com.javabegin.training.game.goldman_11.sound.impl.WavPlayer;
import com.javabegin.training.game.goldman_11.sound.interfaces.SoundPlayer;

public class FrameMainMenu extends javax.swing.JFrame {

    private FrameGame frameGame;
    private FrameStat frameStat;
    private FrameSavedGames frameSavedGames;
    private ScoreSaver scoreSaver = new DbScoreSaver();
    private CustomDialog usernameDialog = new CustomDialog(this, "Имя пользователя", "Введите имя:", true);;
    private JTableGameMap gameMap = new JTableGameMap();
    private AbstractMapLoader mapLoader = new DBMapLoader(gameMap);
    private SoundPlayer soundPlayer = new WavPlayer();
    private static final int MAP_LEVEL_ONE = 1;
    private User user;

    /**
     * Creates new form FrameMainMenu
     */
    public FrameMainMenu() {
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

        jpnlMainMenu = new javax.swing.JPanel();
        jbtnNewGame = new javax.swing.JButton();
        jbtnLoadGame = new javax.swing.JButton();
        jbtnStatistics = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Игра");
        setName("FrameMainMenu"); // NOI18N
        setResizable(false);

        jpnlMainMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jbtnNewGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_11/images/new.png"))); // NOI18N
        jbtnNewGame.setText("Новая игра");
        jbtnNewGame.setToolTipText("Создать новую игру");
        jbtnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnNewGame.setIconTextGap(10);
        jbtnNewGame.addActionListener(formListener);

        jbtnLoadGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnLoadGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_11/images/load.png"))); // NOI18N
        jbtnLoadGame.setText("Загрузить игру");
        jbtnLoadGame.setToolTipText("Загрузить сохраненную игру ");
        jbtnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnLoadGame.setIconTextGap(10);
        jbtnLoadGame.addActionListener(formListener);

        jbtnStatistics.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_11/images/stat.png"))); // NOI18N
        jbtnStatistics.setText("Статистика");
        jbtnStatistics.setToolTipText("Посмотреть статистику по игрокам");
        jbtnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnStatistics.setIconTextGap(10);
        jbtnStatistics.addActionListener(formListener);

        jbtnExit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/goldman_11/images/exit.png"))); // NOI18N
        jbtnExit.setText("Выход");
        jbtnExit.setToolTipText("Выйти из игры");
        jbtnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnExit.setIconTextGap(10);
        jbtnExit.addActionListener(formListener);

        javax.swing.GroupLayout jpnlMainMenuLayout = new javax.swing.GroupLayout(jpnlMainMenu);
        jpnlMainMenu.setLayout(jpnlMainMenuLayout);
        jpnlMainMenuLayout.setHorizontalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnLoadGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlMainMenuLayout.setVerticalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnLoadGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-267)/2, (screenSize.height-310)/2, 267, 310);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jbtnNewGame) {
                FrameMainMenu.this.jbtnNewGameActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnLoadGame) {
                FrameMainMenu.this.jbtnLoadGameActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnStatistics) {
                FrameMainMenu.this.jbtnStatisticsActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnExit) {
                FrameMainMenu.this.jbtnExitActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed


        if (!saveUser()) {
            return;
        }

        MapInfo mapInfo = new MapInfo();
        mapInfo.setLevelId(MAP_LEVEL_ONE);

        if (!mapLoader.loadMap(mapInfo)) {
            return;
        }

        createFrameGame();

        frameGame.showFrame(this);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void createFrameGame() {
        if (frameGame == null) {
            frameGame = new FrameGame(scoreSaver, mapLoader, soundPlayer);
        }
    }

    private void jbtnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStatisticsActionPerformed
        if (frameStat == null) {
            frameStat = new FrameStat();
        }

        frameStat.setList(scoreSaver.getScoreList());
        frameStat.showFrame(this);
    }//GEN-LAST:event_jbtnStatisticsActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        quit();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoadGameActionPerformed


        if (!saveUser()) {
            return;
        }

        createFrameGame();

        if (frameSavedGames == null) {
            frameSavedGames = new FrameSavedGames(mapLoader, frameGame);
        }



        frameSavedGames.showFrame(this);
    }//GEN-LAST:event_jbtnLoadGameActionPerformed

    /**
     * выход из игры
     */
    private void quit() {
        System.exit(0);// не рекомендуется так делать, т.к. могут быть другие процессы

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jbtnExit;
    javax.swing.JButton jbtnLoadGame;
    javax.swing.JButton jbtnNewGame;
    javax.swing.JButton jbtnStatistics;
    javax.swing.JPanel jpnlMainMenu;
    // End of variables declaration//GEN-END:variables

    private String getUserNameDialog() {

        if (user != null && user.getUsername() != null) {
            usernameDialog.setUsername(user.getUsername());
        }

        usernameDialog.setVisible(true);

        return usernameDialog.getValidatedText();
    }

    
    private boolean saveUser() {// сохранить пользователя, получить его id

        String username = getUserNameDialog();

        if (username != null && !username.trim().equals("")) {
            
            if (user!=null && user.getUsername().equals(username)){// если ввел того же пользователя (т.е. ничего не менял)
                return true;
            }
            
            user = new User();
            user.setUsername(username);
            user.setId(mapLoader.getPlayerId(username));
            
            gameMap.getMapInfo().setUser(user);
            
            return true;
        } 

        return false;
    }
}
