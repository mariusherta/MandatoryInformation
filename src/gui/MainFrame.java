/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marius.Herta
 */
public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
        
        setTitle("Informatii de comunicat in apel");
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        jButton5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jCheckBox3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                setAlwaysOnTop();
                }
            }
        );
        
                
    }
    
    
    private void clearCheckBoxes(){
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);        
        jCheckBox20.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox32.setSelected(false);
        jCheckBox33.setSelected(false);
        jCheckBox34.setSelected(false);
        jCheckBox36.setSelected(false);
        jCheckBox42.setSelected(false);
        jCheckBox43.setSelected(false);
        jCheckBox44.setSelected(false);
        jCheckBox46.setSelected(false);
        jCheckBox50.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox26.setSelected(false);
        jCheckBox27.setSelected(false);
        jCheckBox28.setSelected(false);
        jCheckBox29.setSelected(false);
        jCheckBox30.setSelected(false);
        jCheckBox31.setSelected(false);
        jCheckBox35.setSelected(false);
        jCheckBox37.setSelected(false);
        jCheckBox39.setSelected(false);
        jCheckBox51.setSelected(false);
        jCheckBox52.setSelected(false);
        jCheckBox55.setSelected(false);
        jCheckBox60.setSelected(false);
        jCheckBox61.setSelected(false);
        jCheckBox62.setSelected(false);
        jCheckBox64.setSelected(false);
        jCheckBox65.setSelected(false);
        jCheckBox66.setSelected(false);
        jCheckBox38.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        
                
    }
    
    private void setAlwaysOnTop(){
        if (jCheckBox3.isSelected()){
            setAlwaysOnTop(true);
        }else{
            setAlwaysOnTop(false);
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox34 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();

        jCheckBox34.setText("resurse suplimentare, bonusuri, alte oferte");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox32.setText("taxe abonament si optiuni in euro, TVA inclus");

        jCheckBox33.setText("resurse incluse voce (national, international, roaming), date, sms");

        jCheckBox36.setText("abonament cu sau fara resurse de roaming");

        jCheckBox46.setText("data la care se implementeaza oferta");

        jCheckBox43.setText("14 zile calendaristice anulare oferta");

        jCheckBox42.setText("prelungire contractuala");

        jCheckBox50.setFont(new java.awt.Font("Helvetica 75 Bold", 0, 14)); // NOI18N
        jCheckBox50.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox50.setText("Aplica procedura de identificare");
        jCheckBox50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox50ActionPerformed(evt);
            }
        });

        jButton5.setText("Alt apel");

        jCheckBox2.setText("adresa trimitere act aditional");

        jCheckBox3.setText("Always on top");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("promoveaza acordul din aplicatie");

        jCheckBox12.setText("bonusuri/reduceri si valabilitatea lor");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox13.setText("Asigura-te ca ai ofertat tot contul");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox32)
                            .addComponent(jCheckBox33)
                            .addComponent(jCheckBox36)
                            .addComponent(jCheckBox46)
                            .addComponent(jCheckBox42)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 202, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jCheckBox46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jCheckBox50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox13)
                        .addGap(40, 40, 40)
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jCheckBox3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Accepta oferta voce", jPanel5);

        jCheckBox51.setText("taxe abonament si optiuni in euro, TVA inclus");

        jCheckBox52.setText("trafic date inclus");

        jCheckBox55.setText("abonament cu sau fara resurse de roaming");

        jCheckBox60.setText("prelungire contractuala");

        jCheckBox61.setText("14 zile calendaristice anulare oferta");

        jCheckBox64.setFont(new java.awt.Font("Helvetica 75 Bold", 0, 14)); // NOI18N
        jCheckBox64.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox64.setText("Aplica procedura de identificare");
        jCheckBox64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox64ActionPerformed(evt);
            }
        });

        jButton6.setText("Alt apel");

        jCheckBox38.setText("data la care intra in vigoare oferta");

        jCheckBox9.setText("promoveaza acordul din aplicatie");

        jCheckBox7.setText("adresa trimitere act aditional");

        jCheckBox14.setText("bonusuri/reduceri si valabilitatea lor");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox15.setText("Asigura-te ca ai ofertat tot contul");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox55)
                            .addComponent(jCheckBox51)
                            .addComponent(jCheckBox52)
                            .addComponent(jCheckBox60)
                            .addComponent(jCheckBox61))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 320, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(173, 173, 173))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox38)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCheckBox64, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addGap(56, 56, 56)
                .addComponent(jCheckBox64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Accepta oferta date", jPanel1);

        jCheckBox21.setText("taxa lunara + taxe STB-uri in euro cu TVA inclus");

        jCheckBox22.setText("canalele disponibile la momentul prelungirii contractului");

        jCheckBox23.setText("perioada contractuala");

        jCheckBox24.setText("data la care intra in vigoare oferta");

        jButton2.setText("Alt apel");

        jCheckBox25.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox25.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox25.setText("Aplica procedura de identificare");

        jCheckBox66.setText("14 zile calendaristice anulare oferta");

        jCheckBox8.setText("promoveaza acordul din aplicatie");

        jCheckBox10.setText("adresa trimitere act aditional");

        jCheckBox16.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox16.setText("Asigura-te ca ai ofertat tot contul");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(172, 172, 172))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox66)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox25))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBox24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addGap(83, 83, 83)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Accepta oferta TV", jPanel2);

        jCheckBox44.setText("cost telefon/device, cost accesorii");

        jCheckBox62.setText("14 zile calendaristice retur");
        jCheckBox62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox62ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("adresa livrare");

        jCheckBox65.setFont(new java.awt.Font("Helvetica 75 Bold", 0, 14)); // NOI18N
        jCheckBox65.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox65.setText("Aplica procedura de identificare");
        jCheckBox65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox65ActionPerformed(evt);
            }
        });

        jButton1.setText("Alt apel");

        jCheckBox4.setText("persoana care primeste coletul si nr. de contact");

        jCheckBox17.setText("data emitere factura, rata si valoarea ei");

        jLabel1.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("! Atentie: nu se promoveaza consent la comanda de telefon din 4sale");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox44)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox62)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox4))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(493, 493, 493)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCheckBox65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17)
                .addGap(109, 109, 109)
                .addComponent(jCheckBox65)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Comanda device", jPanel9);

        jCheckBox26.setText("oferta este disponibila in acest moment, ulterior poate suferi modificari");

        jCheckBox27.setText("stabileste moment decizional");

        jButton3.setText("Alt apel");

        jCheckBox5.setText("propune 2 oferte ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(170, 170, 170))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox5))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCheckBox26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ma mai gandesc", jPanel3);

        jCheckBox28.setText("data la care se proceseaza inchiderea");

        jCheckBox29.setText("sa nu existe datorii pe cont");

        jCheckBox30.setText("taxa de trecere pe prepay cu TVA trecere pe prepay si data facturare");

        jCheckBox31.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox31.setForeground(new java.awt.Color(204, 0, 51));
        jCheckBox31.setText("Aplica procedura de identificare");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jButton4.setText("Alt apel");

        jCheckBox11.setText("retur echipament TV");

        jCheckBox18.setText("propune 2 oferte ");

        jCheckBox19.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox19.setText("Asigura-te ca ai ofertat tot contul");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox28)
                            .addComponent(jCheckBox29)
                            .addComponent(jCheckBox30)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox18)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox31)
                        .addComponent(jButton4)))
                .addGap(165, 165, 165))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBox28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addGap(75, 75, 75)
                .addComponent(jCheckBox31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Refuza oferta", jPanel4);

        jCheckBox20.setText("Oferta este disponibila in acest moment, ulterior poate suferi modificari");

        jCheckBox35.setText("Cererea dvs se va inchide");

        jCheckBox37.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox37.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox37.setText("Asigura-te ca ai ofertat tot contul");
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });

        jCheckBox39.setFont(new java.awt.Font("Helvetica 75 Bold", 1, 14)); // NOI18N
        jCheckBox39.setForeground(new java.awt.Color(204, 0, 51));
        jCheckBox39.setText("Aplica procedura de identificare");
        jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox35)
                            .addComponent(jCheckBox20)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jCheckBox37)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jCheckBox39)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jCheckBox37)
                .addGap(185, 185, 185))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(jCheckBox39)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Pastreaza abonamentul existent", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox65ActionPerformed

    private void jCheckBox62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox62ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox64ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox50ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox39ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
