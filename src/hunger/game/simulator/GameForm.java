package hunger.game.simulator;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class GameForm extends javax.swing.JFrame {

    public int day;
    public int currentGuy;
    private Participant[] PPcharacters; // Picked participants

    private String[] eventsSingle;
    private String[] eventsMultiplayer;

    private String[] eventsM1ultiplayer;
    private String[] eventsM2ultiplayer;

    private boolean[] eventsSDeath;
    private boolean[] eventsMDeath;

    private boolean[] eventsM1Death;
    private boolean[] eventsM2Death;

    private Status st;

    private static Random rnd = new Random();
    private boolean gameEnd = false;

    GameForm(Participant[] PPcharacters) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    // Create a JScrollPane and set its viewport to the JPanel
        JScrollPane scrollPane = new JScrollPane(jPanel4);

    // Configure scrolling behavior
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    // Add the JScrollPane to the frame's content pane
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        scrollPane.getVerticalScrollBar().setUnitIncrement(20);

        jButton1.setVisible(false);
        ImageIcon l = new ImageIcon("logo.png");
        jLabel1.setIcon(l);
        this.PPcharacters = PPcharacters;

        eventsSingle = new String[]{"fell from a tree and died.", "tried to make a fire but failed.",
            "found a bow but instantly broke it.", "explores the area.",
            "questions his sanity.", "tries to spear-fishing with a trident.",
            "goes on a hunting spree.", "receives fresh food from an unknown sponsor.",
            "picks flowers.", "tried to swim, but drowned and died."};
        eventsSDeath = new boolean[]{true, false, false, false, false, false, false, false, false, true};

        eventsM1ultiplayer = new String[]{"attacks ",
            "and ", "destroys "};
        eventsM1Death = new boolean[]{false, false, false};

        eventsM2ultiplayer = new String[]{
            " but managed to escape", " going to look for enemies", "'s equipment while he was sleeping"
        };
        eventsM2Death = new boolean[]{false, false, false};

        eventsMultiplayer = new String[]{
            "killed", "stabbed"
        };
        eventsMDeath = new boolean[]{true, true};

        setText();
        st = new Status(PPcharacters, this, day);

    }

    private int rndtypevent() {
        int num = rnd.nextInt(3);

        return num;
    }

    private String handleEvent() {
        String Result;

        if (gameEnd) {
            return "";
        }

        int currenttypeEvent = rndtypevent();
        if (currenttypeEvent == 0) {
            Result = SingleEventHandler();
        } else if (currenttypeEvent == 1) {
            Result = Multiplayer();
        } else {
            Result = Multiplayer1();
        }

        return Result;
    }

    private String SingleEventHandler() {
        int eventnum = eventsSingle.length;

        int currentEvent = rndevent(eventnum);

        boolean isDying = eventsSDeath[currentEvent];
        currentGuy = rndguy();
        if (isDying) {
            PPcharacters[currentGuy].setStatus(false);

        }
        return PPcharacters[currentGuy].getName() + " " + eventsSingle[currentEvent];

    }

    private String Multiplayer() {
        int eventnum = eventsMultiplayer.length;

        int currentEvent = rndevent(eventnum);

        boolean isDying = eventsMDeath[currentEvent];
        currentGuy = rndguy();
        int currentsSecondGuy = rndguy();
        while (currentsSecondGuy == currentGuy) {
            currentsSecondGuy = rndguy();
        }

        if (isDying) {
            PPcharacters[currentsSecondGuy].setStatus(false);

        }
        return PPcharacters[currentGuy].getName() + " " + eventsMultiplayer[currentEvent] + " " + PPcharacters[currentsSecondGuy].getName();

    }

    private String Multiplayer1() {
        int eventnum = eventsM1ultiplayer.length;
        int currentEvent = rndevent(eventnum);

        boolean isDying = eventsM1Death[currentEvent];
        currentGuy = rndguy();
        int currentsSecondGuy = rndguy();
        while (currentsSecondGuy == currentGuy) {
            currentsSecondGuy = rndguy();
        }
        if (isDying) {
            PPcharacters[currentsSecondGuy].setStatus(false);

        }
        return PPcharacters[currentGuy].getName() + " " + eventsM1ultiplayer[currentEvent] + PPcharacters[currentsSecondGuy].getName() + eventsM2ultiplayer[currentEvent];

    }

    private int rndevent(int eventnum) {
        int num = rnd.nextInt(eventnum);

        return num;

    }

    private int rndguy() {
        int guynum = rnd.nextInt(PPcharacters.length);
        while (!PPcharacters[guynum].isStatus()) {
            guynum = rnd.nextInt(PPcharacters.length);
        }
        return guynum;
    }

    private void setText() {
        day++;

        jLabel4.setText("day " + day);
        JLabel[] textLabels = {jLabel5, jLabel7, jLabel9, jLabel11, jLabel13, jLabel15, jLabel17, jLabel19};
        JLabel[] imageLabels = {jLabel2, jLabel6, jLabel8, jLabel10, jLabel12, jLabel14, jLabel16, jLabel18};
        for (int i = 0; i < textLabels.length; i++) { // Go over all the lines of the events

            if (gameEnd) {
                // הסתר את כל התמונות
                imageLabels[i].setIcon(null);

                // הסתר את כל הטקסטים
                textLabels[i].setText("");
            } else {
                // Just before randomizing the event for the current line, check if
                int Alive = 0;
                for (int j = 0; j < PPcharacters.length; j++) {
                    if (PPcharacters[j].isStatus()) {
                        Alive++;
                    }
                }
                if (Alive == 1) {
                    currentGuy = rndguy();
                    jButton1.setVisible(true);

                    jButton2.setVisible(false);
                    gameEnd = true;
                    imageLabels[i].setIcon(PPcharacters[currentGuy].getPic());

                    textLabels[i].setText(PPcharacters[currentGuy].getName() + " won the hunger games");
                } else {

                    textLabels[i].setText(handleEvent());
                    imageLabels[i].setIcon(PPcharacters[currentGuy].getPic());

                }

            }

        }
    }

    private boolean Percent(int Percent) {
        int SPercent = rnd.nextInt(100);
        return SPercent < Percent;

    }

    private void status() {

        st.updateText();
        st.setVisible(true);

    }

    public int getDay() {
        return day;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGO");

        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 7, 7));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("The Hunger Games ");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Day");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(721, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setAlignmentX(0.5F);
        jPanel5.add(jLabel2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setAlignmentX(0.5F);
        jPanel5.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setAlignmentX(0.5F);
        jPanel5.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("jLabel6");
        jLabel7.setAlignmentX(0.5F);
        jPanel5.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setAlignmentX(0.5F);
        jPanel5.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("jLabel2");
        jLabel9.setAlignmentX(0.5F);
        jPanel5.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setAlignmentX(0.5F);
        jPanel5.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("jLabel5");
        jLabel11.setAlignmentX(0.5F);
        jPanel5.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setAlignmentX(0.5F);
        jPanel5.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("jLabel6");
        jLabel13.setAlignmentX(0.5F);
        jPanel5.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setAlignmentX(0.5F);
        jPanel5.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("jLabel2");
        jLabel15.setAlignmentX(0.5F);
        jPanel5.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setAlignmentX(0.5F);
        jPanel5.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("jLabel5");
        jLabel17.setAlignmentX(0.5F);
        jPanel5.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setAlignmentX(0.5F);
        jPanel5.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("jLabel5");
        jLabel19.setAlignmentX(0.5F);
        jPanel5.add(jLabel19);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 20));

        jButton2.setText("Progress");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jButton3.setText("Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        status();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setText();
        st.setDay(day);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
