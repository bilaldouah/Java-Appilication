
package G_Employe;
import java.awt.Color;
import G_Abssence.connexion;
import java.sql.*;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JFrame;

import javax.swing.*;
import javax.swing.text.Document;
import rh.fonction;
import rh.serviceModel;

public class Ajouter_Employe extends javax.swing.JFrame {

  public  static Connection con=connexion.connecterDB();
  public  static ResultSet rs;
  public  static  PreparedStatement ps; 
  public  static Statement stm;  
    private Object DbUtils;
    public Ajouter_Employe() {
        initComponents();      
        remplire_combobox_v();
        remplire_combobox_s();
        remplire_combobox_CONTRAT();
    }
    public void remplire_combobox_CONTRAT()
        {
     	try {
       String query ="select * from type_contrat";
       ps = con.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
       contrat.addItem(rs.getString("nom"));
        }	
		} catch (Exception e) {
			e.printStackTrace();
		}         
        }
     public void remplire_combobox_v()
        {
     	try {
       String query ="select * from ville";
       ps = con.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
       Ville.addItem(rs.getString("nom"));
        }	
		} catch (Exception e) {
			e.printStackTrace();
		}         
        }
      
       public void remplire_combobox_s()
        {
     	try {
       String query ="select * from Service";
       ps = con.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
       service.addItem(rs.getString("Nom_service"));
        }	
		} catch (Exception e) {
			e.printStackTrace();
		}         
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_année = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_Prenom = new javax.swing.JTextField();
        txt_cin = new javax.swing.JTextField();
        Ville = new javax.swing.JComboBox<>();
        txt_passwrd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dip = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ec = new javax.swing.JTextField();
        service = new javax.swing.JComboBox<>();
        deb = new com.toedter.calendar.JDateChooser();
        fin = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        contrat = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txt_stf = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Fermer3 = new javax.swing.JLabel();
        Minimise3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setMaximumSize(new java.awt.Dimension(445, 473));
        jPanel1.setMinimumSize(new java.awt.Dimension(445, 473));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 101, 156));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CIN :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ville :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prenom :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nom :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Situation_ F :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Login :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Année experience");

        Ville.setToolTipText("");
        Ville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VilleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diplome");

        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telephone");

        dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dipActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("école");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Service");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Debut Contrat");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fin Contrat");

        contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contrat");

        txt_stf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marié", "Célibataire", "Divorcé" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel17)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(service, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Prenom)
                            .addComponent(txt_login)
                            .addComponent(txt_passwrd)
                            .addComponent(contrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cin)
                            .addComponent(deb, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txt_stf, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel5))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_année, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tele, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(dip)
                                            .addComponent(ec)))))))
                    .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel14)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_passwrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(deb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forme Ajouter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 20, -1, 53));

        Fermer3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fermer3.setText("X");
        Fermer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fermer3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fermer3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fermer3MouseExited(evt);
            }
        });
        jPanel1.add(Fermer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 4, -1, -1));

        Minimise3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minimise3.setText("-");
        Minimise3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimise3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Minimise3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Minimise3MouseExited(evt);
            }
        });
        jPanel1.add(Minimise3, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 4, -1, -1));

        jButton1.setBackground(new java.awt.Color(127, 101, 156));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 262, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fermer3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer3MouseEntered
        Fermer3.setForeground(Color.white);
    }//GEN-LAST:event_Fermer3MouseEntered

    private void Minimise3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise3MouseExited
        Minimise3.setForeground(Color.black);
    }//GEN-LAST:event_Minimise3MouseExited

    private void Fermer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer3MouseClicked
       this.dispose();

    }//GEN-LAST:event_Fermer3MouseClicked

    private void Minimise3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimise3MouseClicked

    private void Fermer3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer3MouseExited
        Fermer3.setForeground(Color.black);
    }//GEN-LAST:event_Fermer3MouseExited

    private void Minimise3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise3MouseEntered
         Minimise3.setForeground(Color.white);
    }//GEN-LAST:event_Minimise3MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String v=Ville.getSelectedItem().toString();
        int id = 0;
        try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select IdVille from ville where nom='"+v+"'"); 
                while(rs.next())
                {
                     id=rs.getInt("idVille");
                }
            } catch (Exception e) 
            {
            }
        
        /*---------------------------------------------------------------------*/
        //String d=Diplome.getSelectedItem().toString();
        String Cin,NOM,Prenom,stf,login,password,documment,Email,AnnéeEx,ecole,diplome;
        int Tel;
        Cin=txt_cin.getText();
        NOM=txt_nom.getText();
        Prenom=txt_Prenom.getText();
        stf=(String) txt_stf.getSelectedItem();
        login=txt_login.getText();
        password=txt_passwrd.getText();
        Email=txt_email.getText();
        AnnéeEx=txt_année.getText();       
        Tel=Integer.parseInt(tele.getText());
        diplome=dip.getText();
        ecole=ec.getText();
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
        
       String date_deb=sdf.format(deb.getDate());
       String  date_fin="0001-01-01";
       if(etat==false){
            date_fin=sdf.format(fin.getDate());
       }
       

       
       
        
       
         
        
        String service_ = service.getSelectedItem().toString();
        String contrat_ = contrat.getSelectedItem().toString();
        int id_s = 0,id_c = 0,id_type=0;
         try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select id_type_contrat from type_contrat where nom='"+contrat_+"'"); 
                while(rs.next())
                {
                     id_type=rs.getInt("id_type_contrat");
                }
            } catch (Exception e) 
            {
            }
        try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select id_service from service where nom_service='"+service_+"'"); 
                while(rs.next())
                {
                     id_s=rs.getInt("id_service");
                }
            } catch (Exception e) 
            {
            }
     
        Contrat c=new Contrat(id_type,date_deb,date_fin);
            c.ajouter();
         try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select id_contrat from contrat order by id_contrat desc limit 1"); 
                if(rs.next())
                {
                     id_c=rs.getInt("id_contrat");
                     
                }
            } catch (Exception e) 
            {
            }
         long nbr=ChronoUnit.DAYS.between(LocalDate.parse(date_deb),LocalDate.parse(date_fin));
            if(nbr>0 | date_fin=="0001-01-01" ){
                serviceModel s= new serviceModel(id_s);

                Employer e=new Employer(Cin,Prenom,NOM,stf,login,password,Email,Tel,diplome,ecole,id,v,s,c);
                int nbr_=Integer.parseInt(txt_année.getText());
                e.ajouterEmployer(nbr_,id_c);
                    this.dispose();
                    fonction f =new fonction();
                    f.show();
            
            }
            else{
              
            }
        }
        catch(Exception e){
            
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dipActionPerformed

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void VilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VilleActionPerformed
        // remplire_combobox();
    }//GEN-LAST:event_VilleActionPerformed
    public boolean etat;
    private void contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratActionPerformed
        // TODO add your handling code here:
          String type_cont=contrat.getSelectedItem().toString();
          if("CDI".equals(type_cont)){
           fin.setVisible(false);
           jLabel17.setVisible(false);
           etat=true;
           }
          else{
           fin.setVisible(true);
           jLabel17.setVisible(true);
           etat=false;
           }
    }//GEN-LAST:event_contratActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ajouter_Employe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fermer3;
    private javax.swing.JLabel Minimise3;
    private javax.swing.JComboBox<String> Ville;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> contrat;
    private com.toedter.calendar.JDateChooser deb;
    private javax.swing.JTextField dip;
    private javax.swing.JTextField ec;
    private com.toedter.calendar.JDateChooser fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JTextField tele;
    private javax.swing.JTextField txt_Prenom;
    private javax.swing.JTextField txt_année;
    private javax.swing.JTextField txt_cin;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JPasswordField txt_passwrd;
    private javax.swing.JComboBox<String> txt_stf;
    // End of variables declaration//GEN-END:variables
}
