package hunger.game.simulator;

import javax.swing.ImageIcon;

public class Status extends javax.swing.JFrame {

    private Participant[] PPcharacters; // Picked participants

    public Status(Participant[] participants) {
        this.PPcharacters = participants;
        initComponents();
        ImageIcon l = new ImageIcon("logo.png");
        jLabel25.setIcon(l);
        jLabel1.setText(PPcharacters[0].getName());
        jLabel28.setText(isDead(0));

        jLabel14.setText(PPcharacters[1].getName());
        jLabel29.setText(isDead(1));

        jLabel3.setText(PPcharacters[2].getName());
        jLabel30.setText(isDead(2));

        jLabel4.setText(PPcharacters[3].getName());
        jLabel31.setText(isDead(3));

        jLabel8.setText(PPcharacters[4].getName());
        jLabel35.setText(isDead(4));

        jLabel6.setText(PPcharacters[5].getName());
        jLabel33.setText(isDead(5));

        jLabel7.setText(PPcharacters[6].getName());
        jLabel34.setText(isDead(6));

        jLabel5.setText(PPcharacters[7].getName());
        jLabel32.setText(isDead(7));

        jLabel12.setText(PPcharacters[8].getName());
        jLabel36.setText(isDead(8));

        jLabel22.setText(PPcharacters[9].getName());
        jLabel37.setText(isDead(9));

        jLabel10.setText(PPcharacters[10].getName());
        jLabel38.setText(isDead(10));

        jLabel9.setText(PPcharacters[11].getName());
        jLabel39.setText(isDead(11));

    }

    private String isDead(int i) {
        if (PPcharacters[i].isStatus()) {
            return "Alive";
        } else {
            return "Deceased";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel25.setText("logo");

        jPanel15.setLayout(new java.awt.GridLayout(2, 1, 7, 7));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel26.setText("The Hunger Games ");
        jPanel15.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel27.setText("day");
        jPanel15.add(jLabel27);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(3, 4, 10, 30));

        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel13.setText("pic");
        jLabel13.setToolTipText("");
        jPanel5.add(jLabel13);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("jLabel28");
        jPanel5.add(jLabel28);

        jPanel1.add(jPanel5);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel2.setText("pic");
        jPanel2.add(jLabel2);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setText("jLabel29");
        jPanel2.add(jLabel29);

        jPanel1.add(jPanel2);

        jPanel12.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel15.setText("pic");
        jPanel12.add(jLabel15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel12.add(jLabel3);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("jLabel30");
        jPanel12.add(jLabel30);

        jPanel1.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel16.setText("pic");
        jPanel13.add(jLabel16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel13.add(jLabel4);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setText("jLabel31");
        jPanel13.add(jLabel31);

        jPanel1.add(jPanel13);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel20.setText("pic");
        jPanel3.add(jLabel20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("jLabel35");
        jPanel3.add(jLabel35);

        jPanel1.add(jPanel3);

        jPanel8.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel19.setText("pic");
        jPanel8.add(jLabel19);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel8.add(jLabel6);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("jLabel33");
        jPanel8.add(jLabel33);

        jPanel1.add(jPanel8);

        jPanel10.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel17.setText("pic");
        jPanel10.add(jLabel17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel10.add(jLabel7);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("jLabel34");
        jPanel10.add(jLabel34);

        jPanel1.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel18.setText("pic");
        jPanel11.add(jLabel18);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel11.add(jLabel5);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel11.add(jLabel32);

        jPanel1.add(jPanel11);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel24.setText("pic");
        jPanel4.add(jLabel24);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel4.add(jLabel12);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setText("jLabel36");
        jPanel4.add(jLabel36);

        jPanel1.add(jPanel4);

        jPanel6.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel11.setText("pic");
        jPanel6.add(jLabel11);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel6.add(jLabel22);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel37.setText("jLabel37");
        jPanel6.add(jLabel37);

        jPanel1.add(jPanel6);

        jPanel9.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel23.setText("pic");
        jPanel9.add(jLabel23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel9.add(jLabel10);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setText("jLabel38");
        jPanel9.add(jLabel38);

        jPanel1.add(jPanel9);

        jPanel7.setLayout(new java.awt.GridLayout(3, 1, 2, 2));

        jLabel21.setText("pic");
        jPanel7.add(jLabel21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel7.add(jLabel9);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel39.setText("jLabel39");
        jPanel7.add(jLabel39);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GameForm gf = new GameForm(PPcharacters);
        gf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
