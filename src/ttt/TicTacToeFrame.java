package ttt;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TicTacToeFrame extends javax.swing.JFrame {
    private String whoseTurn = "X";
    private String playerOne = "Player one";
    private String playerTwo = "Player two";
    private String playerTurn = "";
    private int playerOneScoreCount = 0;
    private int playerTwoScoreCount = 0;
    
    public TicTacToeFrame() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);  
        getPlayerNames();
        setScoreAndTurn();
    }
    
    private void setScoreAndTurn() {
        playerTurn = whoseTurn.equalsIgnoreCase("X") ? playerOne : playerTwo;

        
        jLabel_ScoreInfo.setText(
                playerOne + ": " + String.valueOf(playerOneScoreCount) + 
                "           On the move: " + playerTurn + "           " 
                + playerTwo + ": " + String.valueOf(playerTwoScoreCount)
        );
    }
    
    private void getPlayerNames() {
        playerOne = JOptionPane.showInputDialog(this,
                "Player one name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        playerTwo = JOptionPane.showInputDialog(this,
                "Player two name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        if(playerOne.equals("")){
            playerOne = "Player one";
        }
        if(playerTwo.equals("")){
            playerTwo = "Player two";
        }
    }
    
    private void determineWhoseTurn() {
        whoseTurn = whoseTurn.equalsIgnoreCase("X") ? "O" : "X";
    }

    private void theWinnerIs(String mark) {
        if(mark.equalsIgnoreCase("X")) {
            xWins();
        } else {
            oWins();
        }
    }
    
    private void xWins() {
        JOptionPane.showMessageDialog(this,
                playerOne + " wins", 
                "Winner", 
                JOptionPane.INFORMATION_MESSAGE);
        playerOneScoreCount++;
        resetGame();
    }
    
    private void oWins() {
        JOptionPane.showMessageDialog(this,
                playerTwo + " wins", 
                "Winner", 
                JOptionPane.INFORMATION_MESSAGE);
        playerTwoScoreCount++;
        resetGame();        
    }
    
    private void resetGame() {
        JButton buttons[] = {
                            jButton1, 
                            jButton2, 
                            jButton3, 
                            jButton4, 
                            jButton5,
                            jButton6,
                            jButton7,
                            jButton8,
                            jButton9
        };

        for(JButton b : buttons)
        {
            b.setText("");
            b.setEnabled(true);
        }
        setScoreAndTurn();
    }
    
    private void determineIfWinOccurred() {
        String firstField = jButton1.getText();
        String secondField = jButton2.getText();
        String thirdField = jButton3.getText();
        String fourthField = jButton4.getText();
        String fifthField = jButton5.getText();
        String sixthField = jButton6.getText();
        String seventhField = jButton7.getText();
        String eighthField = jButton8.getText();
        String ninthField = jButton9.getText();

        
        //Winning conditions
        
        // 1 2 3
        if(firstField == secondField && secondField == thirdField && firstField != ""){
            theWinnerIs(firstField);
        }
        // 4 5 6
        if(fourthField == fifthField && fifthField == sixthField && fourthField != ""){
            theWinnerIs(fourthField);
        } 
        // 7 8 9
        if(seventhField == eighthField && eighthField == ninthField  && seventhField != ""){
            theWinnerIs(seventhField);
        }
        // 1 4 7
        if(firstField == fourthField && fourthField == seventhField  && firstField != ""){
            theWinnerIs(firstField);
        }
        // 2 5 8
        if(secondField == fifthField && fifthField == eighthField  && secondField != ""){
            theWinnerIs(secondField);
        }
        // 3 6 9
        if(thirdField == sixthField && sixthField == ninthField  && thirdField != ""){
            theWinnerIs(thirdField);
        }
        // 1 5 9
        if(firstField == fifthField && fifthField == ninthField  && firstField != ""){
            theWinnerIs(firstField);
        }
        // 3 5 7
        if(thirdField == fifthField && fifthField == seventhField  && thirdField != ""){
            theWinnerIs(thirdField);
        }
    }
    
    private void tieGame() {
        String firstField = jButton1.getText();
        String secondField = jButton2.getText();
        String thirdField = jButton3.getText();
        String fourthField = jButton4.getText();
        String fifthField = jButton5.getText();
        String sixthField = jButton6.getText();
        String seventhField = jButton7.getText();
        String eighthField = jButton8.getText();
        String ninthField = jButton9.getText();
        
        if(firstField != "" && secondField != "" && thirdField != "" 
                && fourthField != "" && fifthField != "" && sixthField != "" 
                && seventhField != "" && eighthField != "" && ninthField != "") {
            JOptionPane.showMessageDialog(this,
                "Game is a tie!", 
                "Tie game", 
                JOptionPane.INFORMATION_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_ScoreInfo = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_ScoreInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ScoreInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ScoreInfo.setText("Placeholder for score");
        jPanel1.add(jLabel_ScoreInfo, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_9);

        jPanel1.add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseTurn);
        jButton1.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton1.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whoseTurn);
        jButton2.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton2.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseTurn);
        jButton3.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton3.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whoseTurn);
        jButton4.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton4.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseTurn);
        jButton5.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton5.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseTurn);
        jButton6.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton6.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(whoseTurn);
        jButton7.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton7.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whoseTurn);
        jButton8.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton8.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whoseTurn);
        jButton9.setForeground(whoseTurn.equalsIgnoreCase("X") ? Color.red : Color.blue);
        determineWhoseTurn();
        jButton9.setEnabled(false);
        determineIfWinOccurred();
        tieGame();
        setScoreAndTurn();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_ScoreInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}
