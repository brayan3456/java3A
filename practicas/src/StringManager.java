//****************************************************************************
/** TRABAJO HECHO POR:
 
   * Brayan Fernando Vallejo Ruales
   * Kevin Santiago Ordoñez Adrada
   
   *Profe lo que sucede es que Kevin le habia comentado de la dificultad
   que se le presentaba para acceder a un computador,ya que se encuentra en 
   un pueblo y la calidad de internet es muy mala y tampoco tiene pc alla
   y por ello estuvimos realizando el trabajo a traves de zoom y asi el me 
   ayudaba para poder realizar el taller que nos habia dejado y por eso 
   el taller es de ambos.
   */
//*****************************************************************************

import java.util.HashSet;

public class StringManager extends javax.swing.JFrame {
    int letrainicial;
    char inicial = ' ';
    String let= ""; 
    
    public StringManager() {
        initComponents();
        setLocationRelativeTo(null);
    }
public String characters (String parametro){
        for (int i=0;i<parametro.length();i++){
           inicial=parametro.charAt(i);
           if(i==0){
             inicial=Character.toUpperCase(inicial);  
           }
           if(i>=1){
             inicial=Character.toLowerCase(inicial);  
           }
           if(inicial==' '){             
             letrainicial=i+1;
             inicial=Character.toLowerCase(inicial);
           }
           if(letrainicial==i){
             inicial=Character.toUpperCase(inicial);
           }
           let+=inicial;
        }
           return let;      
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        Bmostrar = new javax.swing.JButton();
        Breiniciar = new javax.swing.JButton();
        Bingles = new javax.swing.JButton();
        Bespañol = new javax.swing.JButton();
        Informacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Mnombre = new javax.swing.JLabel();
        MnombreMAY = new javax.swing.JLabel();
        MnombrreMIN = new javax.swing.JLabel();
        Totalcaracteres = new javax.swing.JLabel();
        InicialesMay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Bbuscar = new javax.swing.JButton();
        mletra = new javax.swing.JLabel();
        Bmayusculas = new javax.swing.JButton();
        Bminusculas = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel12.setText("jLabel12");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Manager");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 278));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Your name");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtName.setText("");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        Bmostrar.setBackground(new java.awt.Color(102, 255, 102));
        Bmostrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Bmostrar.setText("Show");
        Bmostrar.setEnabled(false);
        Bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmostrarActionPerformed(evt);
            }
        });

        Breiniciar.setBackground(new java.awt.Color(204, 204, 0));
        Breiniciar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Breiniciar.setText("Reset");
        Breiniciar.setEnabled(false);
        Breiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreiniciarActionPerformed(evt);
            }
        });

        Bingles.setBackground(new java.awt.Color(51, 51, 255));
        Bingles.setText("En");
        Bingles.setEnabled(false);
        Bingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinglesActionPerformed(evt);
            }
        });

        Bespañol.setBackground(new java.awt.Color(255, 51, 51));
        Bespañol.setText("Sp");
        Bespañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BespañolActionPerformed(evt);
            }
        });

        jLabel3.setText("Your name is:");

        jLabel4.setText("Your name in MAY:");

        jLabel5.setText("Your name in MIN:");

        jLabel6.setText("Total characteres:");

        jLabel7.setText("Initial capital letters ");

        Mnombre.setBackground(new java.awt.Color(255, 255, 255));
        Mnombre.setText("-");
        Mnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MnombreMAY.setBackground(new java.awt.Color(255, 255, 255));
        MnombreMAY.setText("-");
        MnombreMAY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MnombrreMIN.setBackground(new java.awt.Color(255, 255, 255));
        MnombrreMIN.setText("-");
        MnombrreMIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Totalcaracteres.setBackground(new java.awt.Color(255, 255, 255));
        Totalcaracteres.setText("-");
        Totalcaracteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InicialesMay.setBackground(new java.awt.Color(255, 255, 255));
        InicialesMay.setText("-");
        InicialesMay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel9.setText("Type a number:");

        Bbuscar.setBackground(new java.awt.Color(255, 102, 0));
        Bbuscar.setText("SEARCH");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        mletra.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        mletra.setText("?");

        Bmayusculas.setBackground(new java.awt.Color(51, 51, 255));
        Bmayusculas.setText("MAY");
        Bmayusculas.setEnabled(false);
        Bmayusculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmayusculasActionPerformed(evt);
            }
        });

        Bminusculas.setBackground(new java.awt.Color(255, 51, 51));
        Bminusculas.setText("MIN");
        Bminusculas.setEnabled(false);
        Bminusculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminusculasActionPerformed(evt);
            }
        });

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(Buscar))))
                .addGap(44, 44, 44)
                .addComponent(mletra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bminusculas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bmayusculas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mletra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Bminusculas)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bmayusculas)
                            .addComponent(Bbuscar))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Letter Finder");

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(MnombreMAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MnombrreMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Totalcaracteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InicialesMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MnombreMAY, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MnombrreMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totalcaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addComponent(InicialesMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Information");

        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Presionar enter para accionar los botones");
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bmostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Breiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Informacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bingles, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bespañol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bespañol)
                            .addComponent(Bingles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bmostrar)
                .addGap(18, 18, 18)
                .addComponent(Breiniciar)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmostrarActionPerformed

        String yName = txtName.getText();
        if (!txtName.getText().isEmpty()){
            
        Mnombre.setText(yName);
        
        MnombreMAY.setText(yName.toUpperCase());

        MnombrreMIN.setText(yName.toLowerCase());
        
        int n = txtName.getText().length();
        Totalcaracteres.setText(String.valueOf(n));
        
        characters(yName);
        InicialesMay.setText(let);
        letrainicial = 0;
        inicial = ' ';
        let= "";     
        }else{
            Mnombre.setText("");
            MnombreMAY.setText("");;
            MnombrreMIN.setText("");
            Totalcaracteres.setText("");
            InicialesMay.setText("");    
        }   
    }//GEN-LAST:event_BmostrarActionPerformed

    private void BreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreiniciarActionPerformed

        txtName.setText("");
        Mnombre.setText("");
        MnombreMAY.setText("");;
        MnombrreMIN.setText("");
        Totalcaracteres.setText("");
        Buscar.setText("");
        InicialesMay.setText("");  
        
    }//GEN-LAST:event_BreiniciarActionPerformed

    private void BespañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BespañolActionPerformed
        // TODO add your handling code here:
        setTitle("Administrador de Cadenas");
        jLabel1.setText("Tu nombre");
        jLabel3.setText("Tu nombre es:");
        jLabel4.setText("Tu nombre en Mayúsculas es:");
        jLabel5.setText("Tu nombre en Minúsculas es:");
        jLabel6.setText("Total carácteres:");
        jLabel7.setText("Iniciales en Mayúsculas: ");
        Bmostrar.setText("Mostrar");
        Breiniciar.setText("Reiniciar");
        jLabel2.setText("Información");
        jLabel8.setText("Buscador De Letras");
        jLabel9.setText("Digite un Número:");
        Bbuscar.setText("BUSCAR");
        
        Bingles.setEnabled(true);
        Bespañol.setEnabled(false);
    }//GEN-LAST:event_BespañolActionPerformed

    private void BinglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinglesActionPerformed
        // TODO add your handling code here:
        setTitle("String Manager");
        jLabel1.setText("Your name");
        jLabel3.setText("Your name is:");
        jLabel4.setText("Your name in MAY:");
        jLabel5.setText("Your name in MIN:");
        jLabel6.setText("Total characteres:");
        jLabel7.setText("Initial capital letters ");
        Bmostrar.setText("Show");
        Breiniciar.setText("Reset");
        jLabel2.setText("Information");
        jLabel8.setText("Letter Finder");
        jLabel9.setText("Type a number:");
        Bbuscar.setText("SEARCH");
        
        Bingles.setEnabled(false);
        Bespañol.setEnabled(true);
    }//GEN-LAST:event_BinglesActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        int num;
        num =Integer.parseInt(Buscar.getText());
        char buscar= name.charAt(num-1);
        mletra.setText(""+buscar);
        if (buscar == ' '){
            mletra.setText("_");//El Guion " _ " bajo significa que hay un espacio***
        }
        if (Character.isLowerCase(buscar)){
            Bmayusculas.setEnabled(true);
            Bminusculas.setEnabled(false);
        }else if (Character.isUpperCase(buscar)){
            Bmayusculas.setEnabled(false);
            Bminusculas.setEnabled(true);
                    
        }else{
            Bmayusculas.setEnabled(false);
            Bminusculas.setEnabled(false);
            }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void BmayusculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmayusculasActionPerformed
        // TODO add your handling code here:
        String le = mletra.getText();
        mletra.setText(le.toUpperCase());
        Bmayusculas.setEnabled(false);
        Bminusculas.setEnabled(true);

    }//GEN-LAST:event_BmayusculasActionPerformed

    private void BminusculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BminusculasActionPerformed
        // TODO add your handling code here:
        String le = mletra.getText();
        mletra.setText(le.toLowerCase());
        Bmayusculas.setEnabled(true);
        Bminusculas.setEnabled(false);
    }//GEN-LAST:event_BminusculasActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        //**********************************************************************
        //PARA ACCIONAR LOS BOTONES SE DEBE DAR ENTER AL DIGITAR LOS CARACTERES
        //**********************************************************************
        String validar = txtName.getText();
        if(validar == " "){
            Bmostrar.setEnabled(false);
            Breiniciar.setEnabled(false);
       }else{
          Bmostrar.setEnabled(true);
          Breiniciar.setEnabled(true); 
          label.setText("");
       }
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Bespañol;
    private javax.swing.JButton Bingles;
    private javax.swing.JButton Bmayusculas;
    private javax.swing.JButton Bminusculas;
    private javax.swing.JButton Bmostrar;
    private javax.swing.JButton Breiniciar;
    private javax.swing.JTextField Buscar;
    private javax.swing.JPanel Informacion;
    private javax.swing.JLabel InicialesMay;
    private javax.swing.JLabel Mnombre;
    private javax.swing.JLabel MnombreMAY;
    private javax.swing.JLabel MnombrreMIN;
    private javax.swing.JLabel Totalcaracteres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel label;
    private javax.swing.JLabel mletra;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
