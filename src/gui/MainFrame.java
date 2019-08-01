/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

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
        
        jButton7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jButton10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                clearCheckBoxes();
                }
            }
        );
        
        jCheckBox76.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                setAlwaysOnTop();
                }
            }
        );
        
                
    }
    
    
    private void clearCheckBoxes(){
    JCheckBox[] checkboxes =
            new JCheckBox[]{
        jCheckBox1,
        jCheckBox3, 
        jCheckBox4,
        jCheckBox5,
        jCheckBox7,
        jCheckBox8,
        jCheckBox9,
        jCheckBox10,
        jCheckBox11,
        jCheckBox13,
        jCheckBox14,
        jCheckBox15,
        jCheckBox16,
        jCheckBox17,
        jCheckBox18,
        jCheckBox19,        
        jCheckBox20,
        jCheckBox21,
        jCheckBox22,
        jCheckBox23,
        jCheckBox24,
        jCheckBox25,
        jCheckBox26,
        jCheckBox27,
        jCheckBox28,
        jCheckBox29,
        jCheckBox30,
        jCheckBox31,
        jCheckBox34,
        jCheckBox35,
        jCheckBox37,
        jCheckBox38,
        jCheckBox39,
        jCheckBox40,
        jCheckBox41,
        jCheckBox44,
        jCheckBox45,
        jCheckBox47,
        jCheckBox48,
        jCheckBox49,
        jCheckBox50,
        jCheckBox51,
        jCheckBox52,
        jCheckBox53,
        jCheckBox54,
        jCheckBox55,
        jCheckBox56,
        jCheckBox57,
        jCheckBox60,
        jCheckBox61,
        jCheckBox62,
        jCheckBox63,
        jCheckBox64,
        jCheckBox65,
        jCheckBox66,
        jCheckBox67,
        jCheckBox69,
        jCheckBox70,
        jCheckBox71,
        jCheckBox72,
        jCheckBox73,
        jCheckBox74,
        jCheckBox75,
        jCheckBox77,
        jCheckBox78,
        jCheckBox79,
        jCheckBox80
            };
    
    for(JCheckBox checkBox : checkboxes){
        checkBox.setSelected(false);
    }
        
        
    }
    
    private void setAlwaysOnTop(){
        setAlwaysOnTop(jCheckBox76.isSelected());
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox34 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jCheckBox70 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jCheckBox64 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jCheckBox65 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jCheckBox66 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jCheckBox67 = new javax.swing.JCheckBox();

        jCheckBox34.setText("resurse suplimentare, bonusuri, alte oferte");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox51.setText(" Ii detaliezi clientului modalitatile de retur");

        jCheckBox52.setText("Comunici care este termenul de retur conform procedurii");

        jCheckBox60.setText(" Daca plata e facuta din contul online se va da refund din OWS");

        jButton6.setText("Alt apel");

        jCheckBox38.setText("Te asiguri ca solicitarea vine din partea titularului (pentru retur sub 100 lei se preia clientul pe coada, se face telefonic)");

        jCheckBox69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox69.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox69.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox51)
                                .addComponent(jCheckBox52)
                                .addComponent(jCheckBox60)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jCheckBox69)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jCheckBox69)
                .addGap(110, 110, 110)
                .addComponent(jButton6)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Retur Sold", jPanel1);

        jCheckBox21.setText("Clarifici cu clientul in ce data a efectuat plata, prin ce modalitate si ce suma a platit");

        jCheckBox22.setText("In cazul in care plata este nealocata ii soliciti sa ne trimita copia dovezii de plata ");

        jCheckBox24.setText("Te asiguri ca discuti cu titularul");

        jButton2.setText("Alt apel");

        jCheckBox70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox70.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox70.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox24))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(271, 271, 271))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox70)
                                .addGap(229, 229, 229))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jCheckBox70)
                .addGap(73, 73, 73)
                .addComponent(jButton2))
        );

        jTabbedPane1.addTab("Plata nealocata", jPanel2);

        jCheckBox44.setText("Ce suma a achitat");

        jCheckBox62.setText("Data la care s-a facut plata");
        jCheckBox62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox62ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Prin ce modalitate");

        jButton1.setText("Alt apel");

        jCheckBox4.setText("Verificare Vantive - Financial Transaction");

        jCheckBox17.setText("Info costurile suplimentare nefacturate(daca are)");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Daca mai are o factura emisa pe cont, il informezi cu privire la suma si scadenta ei");

        jCheckBox75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox75.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox75.setText("Promoveaza ScOrange");

        jCheckBox77.setText("Actualizezi datele de contact(reminder number, adresa de e-mail)");

        jCheckBox78.setText("Creezi cont online cu drept de admin(daca nu are)");

        jCheckBox79.setText("Promovezi contul online/servicii automate");

        jCheckBox80.setText("Interactiune completa (copy/paste in coment emailurile trimise)");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButton1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox44)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox62)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jCheckBox75))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox77))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox78))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox79))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox80)))
                .addContainerGap(53, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jCheckBox75)
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Confirmare Plata", jPanel9);

        jCheckBox26.setText("Suma de achitat");

        jCheckBox27.setText("Negociez termen de plata");

        jButton3.setText("Alt apel");

        jCheckBox5.setText("Data la care se asteapta plata");

        jCheckBox40.setText("Costurile suplimentare nefacturate(daca are)");

        jCheckBox41.setText("Daca mai are o factura emisa pe cont, il informezi cu privire la suma si scadenta ei");

        jCheckBox45.setText("Promovezi contul online/servicii automate");

        jCheckBox47.setText("Creezi cont online cu drept de admin(daca nu are)");

        jCheckBox48.setText("Interactiune completa (copy/paste in coment emailurile trimise)");

        jCheckBox76.setText("Always on top");
        jCheckBox76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox76ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox3.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox26)
                                    .addComponent(jCheckBox27)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox40)
                                    .addComponent(jCheckBox41)
                                    .addComponent(jCheckBox45)
                                    .addComponent(jCheckBox47)
                                    .addComponent(jCheckBox48)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jButton3)))
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox76)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox48)
                .addGap(66, 66, 66)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(16, 16, 16)
                .addComponent(jCheckBox76))
        );

        jTabbedPane1.addTab("Amanare Plata", jPanel3);

        jCheckBox28.setText("Identificare");

        jCheckBox29.setText("Airtimelimit");

        jCheckBox30.setText("Suma reconectare");

        jButton4.setText("Alt apel");

        jCheckBox11.setText("Servicii automate");

        jCheckBox18.setText("Barari/debarari raportat la bd sau cand revine in tara");

        jCheckBox63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox63.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox63.setText("Promoveaza ScOrange");

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
                            .addComponent(jCheckBox30)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox18)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jCheckBox63)))
                .addContainerGap(242, Short.MAX_VALUE))
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
                .addGap(107, 107, 107)
                .addComponent(jCheckBox63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Apel Limita credit", jPanel4);

        jCheckBox20.setText("Exceptie penalizari ");

        jCheckBox35.setText("Servicii automate");

        jCheckBox49.setText("Rata lunara vs factura emisa ");

        jCheckBox53.setText("Intelegerea telefonica nu se vede pe factura");

        jCheckBox54.setText("Nu se pot face amanari de plata in aceasta perioada");

        jCheckBox56.setText("Airtime 10 euro pentru monitorizare");

        jCheckBox57.setText("In caz de nerespectare reconectarea se va face cu plata integrala si nu va mai primi amanare/esalonare");

        jButton7.setText("Alt apel");

        jCheckBox64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox64.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox64.setText("Promoveaza ScOrange");

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
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox49)
                            .addComponent(jCheckBox53)
                            .addComponent(jCheckBox54)
                            .addComponent(jCheckBox56)
                            .addComponent(jCheckBox57)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jCheckBox64)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox57)
                .addGap(94, 94, 94)
                .addComponent(jCheckBox64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Esalonare de plata", jPanel7);

        jCheckBox8.setText("Vei face identificare complexa intrucat modificarile pot aduce costuri suplimentare in contul clientului");

        jCheckBox9.setText("Clarifici in ce tara calatoreste ");

        jCheckBox10.setText("Intrebi daca doreste activare temporara sau permanenta a serviciului");

        jCheckBox13.setText("Vei promova/activa optiuni pentru optimizare costuri in roaming");

        jCheckBox14.setText("Nu uita sa il anunti care este valoare limitei de credit");

        jCheckBox15.setText("Atentioneaza-l cu privire la consul de internet in roaming");

        jCheckBox16.setText("Care sunt tarifele care se aplica dupa consumarea resurselor? Tarife ");

        jCheckBox19.setText("daca clientul are un pachet de tip SEE ii vei explica clientului modalitatea de consum a resurselor nationale");

        jCheckBox23.setText("Selectie manuala de retea, daca nu se inregistreaza automat");

        jCheckBox25.setText("Cronos in roaming *115#");

        jCheckBox31.setText("Promovare servicii automate pentru activare/dezactivare roaming, optiuni (ivr, ussd, myacc)");

        jButton8.setText("Alt apel");

        jCheckBox65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox65.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox65.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox25)
                            .addComponent(jCheckBox31)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jButton8))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jCheckBox65)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox31)
                .addGap(56, 56, 56)
                .addComponent(jCheckBox65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Activare Roaming", jPanel10);

        jCheckBox37.setText("Discutia se poate purta cu userul sau titularul");

        jCheckBox39.setText("Clientul trebuie sa inchida/redeschida telefonul/STB");

        jCheckBox50.setText("Ofera-i info despre prima factura emisa dupa reconectare (prorata, daca e cazul)");

        jCheckBox55.setText("daca are mai mult de 3 suspendari BDEBT in ultimele 6 luni, se recomanda schimbare de BD ");

        jButton9.setText("Alt apel");

        jCheckBox66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox66.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox66.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox37)
                            .addComponent(jCheckBox39)
                            .addComponent(jCheckBox50)
                            .addComponent(jCheckBox55)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButton9)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCheckBox66)
                .addGap(229, 229, 229))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jCheckBox37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jCheckBox66)
                .addGap(107, 107, 107)
                .addComponent(jButton9)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("FRDOF", jPanel11);

        jCheckBox61.setText("Este necesar sa faci identificare complexa, deci asigura-te ca discuti cu titularul");

        jCheckBox71.setText("Stabileste cu clientul pentru ce numere vrea reconectare");

        jLabel4.setText(" (numerele care au perioada contractuala neincheiata trebuie reconectate obligatoriu)");

        jCheckBox72.setText("Recomanda-i clientului sa inchida/redeschida telefonul/STB");

        jCheckBox73.setText("Info despre prima factura emisa dupa reconectare (prorata, daca e cazul)");

        jCheckBox74.setText("Daca nu doreste reconectarea, spune-i care sunt consecintele:");

        jLabel5.setText("- va pierde definitiv numarul");

        jLabel6.setText("- va trebui sa achite taxa de reziliere (daca e cazul)");

        jLabel7.setText("- se va trimite la agentia de recuperare (daca mai are balanta pozitiva neachitata).");

        jButton10.setText("Alt apel");

        jCheckBox67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox67.setForeground(new java.awt.Color(255, 51, 102));
        jCheckBox67.setText("Promoveaza ScOrange");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox61)
                            .addComponent(jCheckBox71)
                            .addComponent(jCheckBox72)
                            .addComponent(jCheckBox73)
                            .addComponent(jCheckBox74)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton10))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jCheckBox67)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(61, 61, 61)
                .addComponent(jCheckBox67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("ADEBT", jPanel12);

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

    private void jCheckBox76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox76ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox62ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
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
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
