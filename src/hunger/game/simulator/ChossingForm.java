package hunger.game.simulator;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ChossingForm extends javax.swing.JFrame {

    private String[] Tcharacters; // Names of all characters
    private String[] T1characters; // Names of all characters
    private JCheckBox[] TCHEcharacters; // Checkboxes with all characters
    private Participant[] PPcharacters; // Picked participants
    private ImageIcon[] TIcharacters;

    public ChossingForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Tcharacters = new String[]{"Barack Obama", "peppa-pig", "Mike Wazowski",
            "King Solomon", "Michael Jackson", "Elvis Presley", "Jake Peralta", "Chandler Bing",
            "My Little Pony", "mr incredible", "Charizard", "Pinocchio", "spongebob",
            "Saitama", "nikola tesla", "Mister Bean", "Scooby Doo", "Hide the pain guy",
            "Stewie Griffin", "Bernie Sanders", "Queen Elizabeth II", "Albert Einstein",
            "Technoblade", "Bart Simpson", "the rock", "Shrek", "Jhon cena", "Harry Potter",
            "El primo", "Donkey Kong", "Pepe the Frog", "jesus christ", "Donald Trump",
            "King from clash royale", "Freddie Mercury", "Borat Sagdiyev"};
        T1characters = new String[]{"Barack_Obama(1).JPG", "Peppa-pig(1).JPG", "mike wazowski(1).JPG",
            "king-solomon(1).JPG", "Michael_Jackson(1).JPG", "Elvis_Presley_(1).JPG", "jake-peralte(1).JPG", "chandler-bing(1).JPG",
            "my-little-pony(1).JPG", "mr-incredible(1).JPG", "Charizard(1).JPG", "pinocchio(1).JPG", "SPONGEBOB(1).JPG",
            "Saitama(1).JPG", "nikola tesla(1).JPG", "mr-bean(1).JPG", "Scooby-Doo(1).JPG", "hide-the-pain-guy(1).JPG",
            "Stewie griffin.JPG", "bernie-sanders(1).JPG", "qween-elizabeth(1).JPG", "albert-einstein(1).JPG",
            "Technoblade(1).JPG", "bart-simpson(1).JPG", "the-rock(1).JPG", "Shrek(1).JPG", "John_cena(1).JPG", "harry-potter(1).JPG",
            "El-primo(1).JPG", "Donkey_Kong(1).JPG", "pepe-the-frog(1).JPG", "jesus Christ(1).jpg", "donald-trump(1).JPG",
            "king-from-clash-royale(1).JPG", "Freddie-Mercury(1).JPG", "boart(1).JPG"};
        TCHEcharacters = new JCheckBox[35];
        TIcharacters = new ImageIcon[35];

        for (int i = 0; i < 35; i++) {
            TIcharacters[i] = new ImageIcon(T1characters[i]);
        }
        for (int i = 0; i < 35; i++) {
            JLabel label = new JLabel(TIcharacters[i]);
            checkPanel.add(label);
            TCHEcharacters[i] = new JCheckBox(Tcharacters[i]);
            checkPanel.add(TCHEcharacters[i]);

        }
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(checkPanel);
        getContentPane().add(scrollPane1, java.awt.BorderLayout.CENTER);
        scrollPane1.setWheelScrollingEnabled(true);
        scrollPane1.getVerticalScrollBar().setUnitIncrement(20);

//        JLabel[] image = {jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12,
//            jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel21,
//            jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30,
//            jLabel31, jLabel32, jLabel33, jLabel34, jLabel35, jLabel36, jLabel37, jLabel38,
//            jLabel39, jLabel40};
//        for (int i = 0; i < 35; i++) {
//            JLabel label = new JLabel(TIcharacters[i]);
//            checkPanel.add(label);
//        }
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
            jLabel5.setText("Please select exactly 12 characters. You selected " + selectedIndex + " characters.");
            jLabel5.setVisible(true);

        }

    }

    //            jLabel5.setText("Please select exactly 12 characters.");
    //            jLabel5.setVisible(true);
    private void startGame() {
        setVisible(false);

        int selectedIndex = 0;
        for (int i = 0; i < TCHEcharacters.length; i++) {
            JCheckBox TCHEcharacter = TCHEcharacters[i];
            if (TCHEcharacter.isSelected()) {

                //PPcharacters[selectedIndex++]  = new Participant(TCHEcharacter.getText());
                //identical to:
                PPcharacters[selectedIndex] = new Participant(TCHEcharacter.getText(), TIcharacters[i]);
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

        checkPanel.setLayout(new javax.swing.BoxLayout(checkPanel, javax.swing.BoxLayout.PAGE_AXIS));
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
