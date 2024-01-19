package hunger.game.simulator;

import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChossingForm extends javax.swing.JFrame {

    private String[] Tcharacters; // Names of all characters
    private JCheckBox[] TCHEcharacters; // Checkboxes with all characters
    private Participant[] PPcharacters; // Picked participants

    public ChossingForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Tcharacters = new String[]{"Barack Obama", "Peppa Pig", "Mike Wazowski",
            "King Solomon", "Ted Jordan", "Elvis Presley", "Jake Peralta", "Chandler Bing",
            "My Little Pony", "mr incredible", "Charizard", "Pinocchio", "spongebob",
            "Saitama", "nikola tesla", "Mister Bean", "Scooby Doo", "Hide the pain guy",
            "Stewie Griffin", "Bernie Sanders", "Queen Elizabeth II", "Albert Einstein",
            "Technoblade", "Bart Simpson", "Frankenstein", "Shrek", "mike tyson", "Harry Potter",
            "Golem", "Donkey Kong", "Pepe the Frog", "jesus christ", "Donald Trump",
            "king from clash royale", "Freddie Mercury", "Borat Sagdiyev"};
        TCHEcharacters = new JCheckBox[35];
        for (int i = 0; i < 35; i++) {
            TCHEcharacters[i] = new JCheckBox(Tcharacters[i]);
            checkPanel.add(TCHEcharacters[i]);
        }
        PPcharacters = new Participant[12];

        ImageIcon l = new ImageIcon("logo.png");
        jLabel1.setIcon(l);
        jLabel5.setVisible(false);
    }

    private void StartChecking() {
        int selectedIndex = 0;

        //for (int i=0; i<TCHEcharacters.length;i++){
        //JCheckBox TCHEcharacter = TCHEcharacters[i];
        //identical to:
        for (JCheckBox TCHEcharacter : TCHEcharacters) {
            if (TCHEcharacter.isSelected()) {

                //Pcharacters[selectedIndex++] = TCHEcharacter;
                //identical to:
                //Pcharacters[selectedIndex] = TCHEcharacter;
                selectedIndex++;

            }
        }
        if (selectedIndex == 12) {
            startGame();
        } else {
            jLabel5.setText("Please select exactly 12 characters. You pressed " + selectedIndex + " times");
            jLabel5.setVisible(true);

        }

    }

    //            jLabel5.setText("Please select exactly 12 characters.");
    //            jLabel5.setVisible(true);
    private void startGame() {
        setVisible(false);

        int selectedIndex = 0;
        for (JCheckBox TCHEcharacter : TCHEcharacters) {
            if (TCHEcharacter.isSelected()) {

                //PPcharacters[selectedIndex++]  = new Participant(TCHEcharacter.getText());
                //identical to:
                PPcharacters[selectedIndex] = new Participant(TCHEcharacter.getText());
                selectedIndex++;

            }
        }

        //for (int i = 0; i < 12; i++) {
        //    PPcharacters[i] = new Participant(Pcharacters[i].getText());
        //}
        GameForm gf = new GameForm(PPcharacters);
        gf.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        checkPanel = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("The Hunger Games ");
        jPanel1.add(jLabel4, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Choose 12 characters");
        jPanel1.add(jLabel3, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("error?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("StartGame");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        checkPanel.setLayout(new java.awt.GridLayout(37, 1));
        getContentPane().add(checkPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StartChecking();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel checkPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
