
import java.util.Random;
import javax.swing.ImageIcon;

/*
+++++++++++++++++++++++++++++++++++++++++++
+               CREADORES:                +
+++++++++++++++++++++++++++++++++++++++++++

*******************************************
*   ° BRAYAN FERNANDO VALLEJO RUALES      *
*                                         *
*   ° KEVIN SANTIAGO ORDOÑEZ ADRADA       *
*******************************************

*/

public class Proceso_Juego extends javax.swing.JFrame {
    int E, i = 1, P1 = 0, P2 = 0, P3 = 0, P4 = 0;
    int contador;

    public Proceso_Juego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cplayer1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cplayer4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cplayer2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cplayer3 = new javax.swing.JLabel();
        piri = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        valorm = new javax.swing.JComboBox<>();
        play = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        acumulated = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Ganador = new javax.swing.JLabel();
        Ppirinola = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        Cplayer1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cplayer1.setForeground(new java.awt.Color(255, 0, 0));
        Cplayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cplayer1.setText("0");
        Cplayer1.setToolTipText("");
        Cplayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Coins");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 4");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Coins");

        Cplayer4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cplayer4.setForeground(new java.awt.Color(255, 0, 0));
        Cplayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cplayer4.setText("0");
        Cplayer4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Player 2");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Coins");

        Cplayer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cplayer2.setForeground(new java.awt.Color(255, 0, 0));
        Cplayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cplayer2.setText("0");
        Cplayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player 3");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Coins");

        Cplayer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cplayer3.setForeground(new java.awt.Color(255, 0, 0));
        Cplayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cplayer3.setText("0");
        Cplayer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        piri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        piri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        piri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/interr.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cplayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(piri)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(Cplayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cplayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cplayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(piri)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cplayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Coins per player:");

        valorm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30" }));

        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valorm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(valorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acumulated", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        acumulated.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        acumulated.setForeground(new java.awt.Color(255, 0, 0));
        acumulated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acumulated.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(acumulated, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acumulated, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Ganador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ganador.setText("?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Ppirinola.setBackground(new java.awt.Color(255, 153, 0));
        Ppirinola.setText("Spin around -> Player #");
        Ppirinola.setEnabled(false);
        Ppirinola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpirinolaActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 0, 0));
        Reset.setText("Reiniciar juego");
        Reset.setEnabled(false);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ppirinola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ppirinola, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
    E = Integer.parseInt(valorm.getSelectedItem().toString());
    if (E == 5){
        P1 = 5;
        P2 = 5;
        P3 = 5;
        P4 = 5;
    }else if (E == 10){
        P1 = 10;
        P2 = 10;
        P3 = 10;
        P4 = 10;
    }else if (E == 20){ 
        P1 = 20;
        P2 = 20;
        P3 = 20;
        P4 = 20;
    }else if (E == 30){
        P1 = 30;
        P2 = 30;
        P3 = 30;
        P4 = 30;
    }
    Cplayer1.setText(String.valueOf(P1));
    Cplayer2.setText(String.valueOf(P2));
    Cplayer3.setText(String.valueOf(P3));
    Cplayer4.setText(String.valueOf(P4));
    Ppirinola.setText("Spin around -> Player 1");
    
    Ppirinola.setEnabled(true);
    Reset.setEnabled(true);
    play.setEnabled(false);
    }//GEN-LAST:event_playActionPerformed

    private void PpirinolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpirinolaActionPerformed
    Random D = new Random();
    int d1 = 0 ;
    E = Integer.parseInt(valorm.getSelectedItem().toString());
            if (i == 1){
                i = i + 1;
                if (P1 > 0){
                    Ppirinola.setText("Spin around -> Player 1");
                    d1 =(int) (D.nextDouble()*6+1);
                    if (d1 == 1){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p1.jpg")));
                        if (P1 >= 1){
                            P1 = P1 -1;
                            Cplayer1.setText(String.valueOf(P1));
                            contador = contador +1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 2){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p2.jpg")));
                        if (P1 >= 2){
                            P1 = P1 - 2;
                            Cplayer1.setText(String.valueOf(P1));
                            contador = contador +2;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 3){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom1.jpg")));
                        if (contador >= 1){
                            P1 = P1 + 1;
                            Cplayer1.setText(String.valueOf(P1));
                            contador = contador -1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 4){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom2.jpg")));
                        if (contador >= 2){
                            P1 = P1 +2;
                            Cplayer1.setText(String.valueOf(P1));
                            contador = contador -2;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 5){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tomtod.jpg")));
                        if (contador > 0){
                            P1 = P1 + contador;
                            Cplayer1.setText(String.valueOf(P1));
                            contador = contador - contador;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 6){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/todpon1.jpg")));
                        if (P1 >= 1){
                            P1 = P1 - 1;   
                            contador = contador + 1;
                            Cplayer1.setText(String.valueOf(P1));
                        }
                        if (P2 >= 1){
                            P2 = P2 - 1; 
                            contador = contador + 1;
                            Cplayer2.setText(String.valueOf(P2));
                        }
                        if (P3 >= 1){
                            P3 = P3 - 1;
                            contador = contador + 1;
                            Cplayer3.setText(String.valueOf(P3));
                        }
                        if (P4 >= 1){
                            P4 = P4 - 1;
                            contador = contador + 1;
                            Cplayer4.setText(String.valueOf(P1));
                        }
                        acumulated.setText(String.valueOf(contador));
                    }
                }else if(P1 <= 0){
                    Cplayer1.setText("ELIMINADO");
                }
            }else if (i == 2){
                i = i + 1;
                if (P2 > 0){
                    Ppirinola.setText("Spin around -> Player 2");
                    d1 =(int) (D.nextDouble()*6+1);
                    if (d1 == 1){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p1.jpg")));
                        if (P2 >= 1){ 
                            P2 = P2 -1;
                            Cplayer2.setText(String.valueOf(P2));
                            contador = contador +1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 2){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p2.jpg")));
                        if (P2 >= 1){
                            P2 = P2 - 2;
                            Cplayer2.setText(String.valueOf(P2));
                            contador = contador +2;
                            acumulated.setText(String.valueOf(contador));
                        }    
                    }else if (d1 == 3){
                        if (contador >= 1){
                            piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom1.jpg")));
                            P2 = P2 + 1;
                            Cplayer2.setText(String.valueOf(P2));
                            contador = contador -1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 4){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom2.jpg")));
                        if (contador >= 2){
                            P2 = P2 +2;
                            Cplayer2.setText(String.valueOf(P2));
                            contador = contador -2;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 5){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tomtod.jpg")));
                        if (contador > 0){
                            P2 = P2 + contador;
                            Cplayer2.setText(String.valueOf(P2));
                            contador = contador - contador;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 6){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/todpon1.jpg")));
                        if (P1 >= 1){
                            P1 = P1 - 1;  
                            contador = contador + 1;
                            Cplayer1.setText(String.valueOf(P1));
                        }
                        if (P2 >= 1){
                            P2 = P2 - 1; 
                            contador = contador + 1;
                            Cplayer2.setText(String.valueOf(P2));
                        }
                        if (P3 >= 1){
                            P3 = P3 - 1; 
                            contador = contador + 1;
                            Cplayer3.setText(String.valueOf(P3));
                        }
                        if (P4 >= 1){
                            P4 = P4 - 1;
                            contador = contador + 1;
                            Cplayer4.setText(String.valueOf(P4));
                        }
                        acumulated.setText(String.valueOf(contador));
                    }    
                }else if(P2 <= 0){
                    Cplayer2.setText("ELIMINADO");
                }    
        }else if (i == 3){
                i = i + 1;
                if (P3 > 0){
                    Ppirinola.setText("Spin around -> Player 3");
                    d1 =(int) (D.nextDouble()*6+1);
                    if (d1 == 1){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p1.jpg")));
                        if (P3 >= 1){ 
                            P3 = P3 -1;
                            Cplayer3.setText(String.valueOf(P3));
                            contador = contador +1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 2){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p2.jpg")));
                        if (P3 >= 1){
                            P3 = P3 - 2;
                            Cplayer3.setText(String.valueOf(P3));
                            contador = contador +2;
                            acumulated.setText(String.valueOf(contador));
                        }    
                    }else if (d1 == 3){
                        if (contador >= 1){
                            piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom1.jpg")));
                            P3 = P3 + 1;
                            Cplayer3.setText(String.valueOf(P3));
                            contador = contador -1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 4){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom2.jpg")));
                        if (contador >= 2){
                            P3 = P3 +2;
                            Cplayer3.setText(String.valueOf(P3));
                            contador = contador -2;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 5){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tomtod.jpg")));
                        if (contador > 0){
                            P3 = P3 + contador;
                            Cplayer3.setText(String.valueOf(P3));
                            contador = contador - contador;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 6){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/todpon1.jpg")));
                        if (P1 >= 1){
                            P1 = P1 - 1;    
                            contador = contador + 1;
                            Cplayer1.setText(String.valueOf(P1));
                        }
                        if (P2 >= 1){
                            P2 = P2 - 1; 
                            contador = contador + 1;
                            Cplayer2.setText(String.valueOf(P2));
                        }
                        if (P3 >= 1){
                            P3 = P3 - 1; 
                            contador = contador + 1;
                            Cplayer3.setText(String.valueOf(P3));
                        }
                        if (P4 >= 1){
                            P4 = P4 - 1;
                            contador = contador + 1;
                            Cplayer4.setText(String.valueOf(P4));
                        }
                        acumulated.setText(String.valueOf(contador));
                    }
                }else if(P3 <= 0){
                    Cplayer3.setText("ELIMINADO");
                }       
        }else if (i == 4){
                i = i - 3;
                if (P4 > 0){
                    Ppirinola.setText("Spin around -> Player 4");
                    d1 =(int) (D.nextDouble()*6+1);
                    if (d1 == 1){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p1.jpg")));
                        if (P4 >= 1){ 
                            P4 = P4 -1;
                            Cplayer4.setText(String.valueOf(P4));
                            contador = contador +1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 2){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/p2.jpg")));
                        if (P4 >= 1){
                            P4 = P4 - 2;
                            Cplayer4.setText(String.valueOf(P4));
                            contador = contador +2;
                            acumulated.setText(String.valueOf(contador));
                        }    
                    }else if (d1 == 3){
                        if (contador >= 1){
                            piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom1.jpg")));
                            P4 = P4 + 1;
                            Cplayer4.setText(String.valueOf(P4));
                            contador = contador -1;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 4){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tom2.jpg")));
                        if (contador >= 2){
                            P4 = P4 +2;
                            Cplayer4.setText(String.valueOf(P4));
                            contador = contador -2;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 5){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/tomtod.jpg")));
                        if (contador > 0){
                            P4 = P4 + contador;
                            Cplayer4.setText(String.valueOf(P4));
                            contador = contador - contador;
                            acumulated.setText(String.valueOf(contador));
                        }
                    }else if (d1 == 6){
                        piri.setIcon(new ImageIcon(getClass().getResource("/Icons/todpon1.jpg")));
                        if (P1 >= 1){
                            P1 = P1 - 1; 
                            contador = contador + 1;
                            Cplayer1.setText(String.valueOf(P1));
                        }
                        if (P2 >= 1){
                            P2 = P2 - 1; 
                            contador = contador + 1;
                            Cplayer2.setText(String.valueOf(P2));
                        }
                        if (P3 >= 1){
                            P3 = P3 - 1; 
                            contador = contador + 1;
                            Cplayer3.setText(String.valueOf(P3));
                        }
                        if (P4 >= 1){
                            P4 = P4 - 1;
                            contador = contador + 1;
                            Cplayer4.setText(String.valueOf(P4));
                        }
                        acumulated.setText(String.valueOf(contador));
                    }
                }else if(P4 <= 0){
                    Cplayer4.setText("ELIMINADO");
                }    
            }
            if (P1 >= 1 && P2 <= 0 && P3 <= 0 && P4 <= 0){
                Ganador.setText("Player 1");
                i = 0;
                Ppirinola.setText("Spin around -> Player #");
                Ppirinola.setEnabled(false);
            }else if (P2 >= 1 && P1 <= 0 && P3 <= 0 && P4 <= 0){
                Ganador.setText("Player 2");
                i = 0;
                Ppirinola.setText("Spin around -> Player #");
                Ppirinola.setEnabled(false);
            }else if (P3 >= 1 && P1 <= 0 && P2 <= 0 && P4 <= 0){
                Ganador.setText("Player 3");
                i = 0;
                Ppirinola.setText("Spin around -> Player #");
                Ppirinola.setEnabled(false);
            }else if (P4 >= 1 && P1 <= 0 && P2 <= 0 && P3 <= 0){
                Ganador.setText("Player 4");
                i = 0;
                Ppirinola.setText("Spin around -> Player #");
                Ppirinola.setEnabled(false);
            }
    }//GEN-LAST:event_PpirinolaActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        Ppirinola.setEnabled(false);
        Reset.setEnabled(false);
        play.setEnabled(true);
        
        P1 = 0;
        P2 = 0;
        P3 = 0;
        P4 = 0;
        contador = 0;
        Cplayer1.setText("0");
        Cplayer2.setText("0");
        Cplayer3.setText("0");
        Cplayer4.setText("0");
        acumulated.setText("0");
        Ppirinola.setText("Spin around -> Player #");
                
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Proceso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proceso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proceso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proceso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proceso_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cplayer1;
    private javax.swing.JLabel Cplayer2;
    private javax.swing.JLabel Cplayer3;
    private javax.swing.JLabel Cplayer4;
    private javax.swing.JLabel Ganador;
    private javax.swing.JButton Ppirinola;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel acumulated;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel piri;
    private javax.swing.JButton play;
    private javax.swing.JComboBox<String> valorm;
    // End of variables declaration//GEN-END:variables
}
