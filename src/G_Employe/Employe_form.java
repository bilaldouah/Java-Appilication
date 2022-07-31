package G_Employe;
import Authentification.Acceuil;
import static Authentification.Acceuil.con;
import static Authentification.Acceuil.rs;
import static Authentification.Acceuil.stm;
import G_Abssence.Abssence_form;
import G_Abssence.Conge_form;
import G_Abssence.connexion;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rh.fonction;
import rh.service;
import rh.serviceRepository;
public class Employe_form extends javax.swing.JFrame{
    public Employe_form() {
       initComponents();
       refreshTable();
        adminname();
        
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btn_AJOUTER3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_pointage = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_absence1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_parametres = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_statistiques = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_statistiques1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fermer2 = new javax.swing.JLabel();
        Minimise2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(54, 33, 89));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(54, 33, 89));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setBackground(new java.awt.Color(255, 255, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CIN", "Prenom", "Nom", "Email", "Telephone", "ville", "Contrat", "Fonction", "Service"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel22.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 607, 370));

        btn_AJOUTER3.setBackground(new java.awt.Color(127, 101, 156));
        btn_AJOUTER3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AJOUTER3.setForeground(new java.awt.Color(255, 255, 255));
        btn_AJOUTER3.setText("Ajouter");
        btn_AJOUTER3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AJOUTERMouseClicked(evt);
            }
        });
        btn_AJOUTER3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AJOUTERActionPerformed(evt);
            }
        });
        jPanel22.add(btn_AJOUTER3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 194, 50));

        jButton7.setBackground(new java.awt.Color(85, 55, 118));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Supprimer");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 198, 50));

        jButton8.setBackground(new java.awt.Color(127, 101, 156));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Modifier");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 191, 50));

        btn_pointage.setBackground(new java.awt.Color(85, 55, 118));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_attendance_32px.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fonction");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_pointageLayout = new javax.swing.GroupLayout(btn_pointage);
        btn_pointage.setLayout(btn_pointageLayout);
        btn_pointageLayout.setHorizontalGroup(
            btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pointageLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_pointageLayout.setVerticalGroup(
            btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pointageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(btn_pointageLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel22.add(btn_pointage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        btn_absence1.setBackground(new java.awt.Color(85, 55, 118));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_exhibitor_50px.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Service");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_absence1Layout = new javax.swing.GroupLayout(btn_absence1);
        btn_absence1.setLayout(btn_absence1Layout);
        btn_absence1Layout.setHorizontalGroup(
            btn_absence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_absence1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        btn_absence1Layout.setVerticalGroup(
            btn_absence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_absence1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(btn_absence1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_parametres.setBackground(new java.awt.Color(127, 101, 156));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_settings_32px.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Congés");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_parametresLayout = new javax.swing.GroupLayout(btn_parametres);
        btn_parametres.setLayout(btn_parametresLayout);
        btn_parametresLayout.setHorizontalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_parametresLayout.setVerticalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(btn_parametres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        btn_statistiques.setBackground(new java.awt.Color(54, 33, 89));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_attendance_32px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Abssence");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_statistiquesLayout = new javax.swing.GroupLayout(btn_statistiques);
        btn_statistiques.setLayout(btn_statistiquesLayout);
        btn_statistiquesLayout.setHorizontalGroup(
            btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_statistiquesLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_statistiquesLayout.setVerticalGroup(
            btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_statistiquesLayout.createSequentialGroup()
                .addGroup(btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel22.add(btn_statistiques, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_statistiques1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_combo_chart_80px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Statistique");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_statistiques1Layout = new javax.swing.GroupLayout(btn_statistiques1);
        btn_statistiques1.setLayout(btn_statistiques1Layout);
        btn_statistiques1Layout.setHorizontalGroup(
            btn_statistiques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_statistiques1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_statistiques1Layout.setVerticalGroup(
            btn_statistiques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_statistiques1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel22.add(btn_statistiques1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 320, -1));

        jPanel16.setBackground(new java.awt.Color(127, 101, 156));
        jPanel16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel16FocusLost(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jLabel24.setText("jLabel2");

        jToggleButton7.setText("jToggleButton1");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Employés");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jToggleButton7)
                .addContainerGap())
        );

        jPanel22.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 50));

        jPanel23.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employés");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel23.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 70));

        Fermer2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fermer2.setText("X");
        Fermer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fermer2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fermer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fermer2MouseExited(evt);
            }
        });
        jPanel23.add(Fermer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        Minimise2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Minimise2.setText("-");
        Minimise2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimise2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Minimise2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Minimise2MouseExited(evt);
            }
        });
        jPanel23.add(Minimise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("RESSOURCES HUMAINES");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel23.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, -1));

        admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jPanel23.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 188, -1));

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public  static Connection con=connexion.connecterDB();;
  public  static ResultSet res;
  public  static  java.sql.PreparedStatement ps;
  public  static Statement stm;
   public void adminname()
    {
        
        try{    
        stm=con.createStatement();
            rs=stm.executeQuery("select nom_emp   from employer where Cin_emp ='"+Employer.id_employer_static+"'");
            if(rs.next()){
                admin.setText(rs.getString("nom_emp"));
                
            }
        }
        catch(SQLException ex){
        }
    }
    public void refreshTable(){

		DefaultTableModel D = new DefaultTableModel(null,new String[]{"Cin_emp","prenom_emp","nom_emp","email_emp","telephone_emp","Ville","contrat","nom_service"});
        try {
             con=connexion.connecterDB();
               String query = "select e.Cin_emp, e.prenom_emp,e.nom_emp,e.email_emp,e.telephone_emp,v.nom as 'Ville',t.nom as 'contrat',f.nom_fonction,s.nom_service from type_contrat t inner join contrat c on t.id_type_contrat=c.contrat_type inner join employer e on e.id_contrat=c.id_contrat inner join fonction f on f.id_fonction=e.id_fonction_ inner join service s on s.id_service=e.id_service inner join ville v on v.idVille=e.id_ville";
               Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery(query);
               while (res.next()) {
                   D.addRow(new Object[]{res.getObject(1),res.getObject(2),res.getObject(3),res.getObject(4),res.getObject(5),res.getObject(6),res.getObject(7),res.getObject(8)});
            }
               jTable4.setModel(D);
        } catch (Exception e) {
            
        }
        
		
	}
    private void Minimise2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise2MouseExited
        Minimise2.setForeground(Color.black);
    }//GEN-LAST:event_Minimise2MouseExited

    private void Minimise2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise2MouseEntered
        Minimise2.setForeground(Color.white);
    }//GEN-LAST:event_Minimise2MouseEntered

    private void Minimise2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimise2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimise2MouseClicked

    private void Fermer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer2MouseExited
        Fermer2.setForeground(Color.black);
    }//GEN-LAST:event_Fermer2MouseExited

    private void Fermer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer2MouseEntered
        Fermer2.setForeground(Color.white);
    }//GEN-LAST:event_Fermer2MouseEntered

    private void Fermer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fermer2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Fermer2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
       DefaultTableModel model= (DefaultTableModel)jTable4.getModel();
        int selectedRowIndex= jTable4.getSelectedRow();
        String  email =(model.getValueAt(selectedRowIndex,3).toString());
        
        String  id =(model.getValueAt(selectedRowIndex,0).toString());
        int   tele =Integer.parseInt(model.getValueAt(selectedRowIndex,4).toString());
        
        Employer e = new Employer(tele,email);
        e.modifier(id);
        refreshTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model= (DefaultTableModel)jTable4.getModel();
        int selectedRowIndex= jTable4.getSelectedRow();
      
        
        String  id =(model.getValueAt(selectedRowIndex,0).toString());
       
        
        Employer.supprimer(id);
        refreshTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_AJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AJOUTERActionPerformed

    }//GEN-LAST:event_btn_AJOUTERActionPerformed

    private void btn_AJOUTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AJOUTERMouseClicked
        Ajouter_Employe A =  new Ajouter_Employe();
        A.setVisible(true);
        A.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_AJOUTERMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.dispose();
        Abssence_form e=new Abssence_form();
        e.show();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.dispose();
        service e=new service();
        e.show();

    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        this.dispose();
        fonction e=new fonction();
        e.show();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.dispose();
        Conge_form e=new Conge_form();
        e.show();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        this.dispose();
        Employe_form e=new Employe_form();
        e.show();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jPanel16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel16FocusLost

    }//GEN-LAST:event_jPanel16FocusLost

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        this.dispose();
        Acceuil e=new Acceuil();
        e.show();
    }//GEN-LAST:event_jLabel26MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            Employe_form E =  new Employe_form();
            E.setVisible(true);
            E.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fermer2;
    private javax.swing.JLabel Minimise2;
    private javax.swing.JLabel admin;
    private javax.swing.JButton btn_AJOUTER3;
    private javax.swing.JPanel btn_absence1;
    private javax.swing.JPanel btn_parametres;
    private javax.swing.JPanel btn_pointage;
    private javax.swing.JPanel btn_statistiques;
    private javax.swing.JPanel btn_statistiques1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JToggleButton jToggleButton7;
    // End of variables declaration//GEN-END:variables

    

   
}
