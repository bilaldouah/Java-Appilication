
package Employes;
import G_Abssence.connexion;
import static G_Abssence.Abssence_form.con;
import static G_Abssence.Abssence_form.rs;
import static G_Abssence.Abssence_form.stm;
import G_Abssence.Conges;
import G_Employe.Employer;
import G_Employe.update_mdp;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Demande_conges extends javax.swing.JFrame {
    public Demande_conges() 
    {
        initComponents();
       combotype();
       adminname();
       demande();
    }
    public void demande(){
         try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select statut from conge where Cin_emp ='"+Employer.id_employer_static+"' order by id_conge desc limit 1"); 
                if(rs.next())
                {
                     demande.setText(rs.getString("statut"));
                     
                }
            } catch (Exception e) 
            {
            }
    }
     public void adminname()
    {
        
        try{    
        stm=con.createStatement();
            rs=stm.executeQuery("select nom_emp   from employer where Cin_emp ='"+Employer.id_employer_static+"'");
            if(rs.next()){
                emp.setText(rs.getString("nom_emp"));
                
            }
        }
        catch(SQLException ex){
        }
    }
    public void combotype(){
        try
        {

            stm=con.createStatement();
            rs=stm.executeQuery("SELECT * FROM type_conge");
            while(rs.next())
            {
                type.addItem(rs.getString("type"));
                

            }
        }
        catch (SQLException e)
        {
            System.err.println(e.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarDemo1 = new com.toedter.calendar.demo.JCalendarDemo();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        deamnde_cng = new javax.swing.JLabel();
        btn_parametres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mdp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        deamnde_abs = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Date_fin = new com.toedter.calendar.JDateChooser();
        Date_deb = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        demande = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jCalendarDemo1Layout = new javax.swing.GroupLayout(jCalendarDemo1.getContentPane());
        jCalendarDemo1.getContentPane().setLayout(jCalendarDemo1Layout);
        jCalendarDemo1Layout.setHorizontalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jCalendarDemo1Layout.setVerticalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 101, 156));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton3.setBackground(new java.awt.Color(127, 101, 156));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setBorder(null);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        deamnde_cng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deamnde_cng.setForeground(new java.awt.Color(255, 255, 255));
        deamnde_cng.setText("Demande de conge");
        deamnde_cng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deamnde_cngMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deamnde_cng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton3)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deamnde_cng)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 50));

        btn_parametres.setBackground(new java.awt.Color(127, 101, 156));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_settings_32px.png"))); // NOI18N

        mdp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mdp.setForeground(new java.awt.Color(255, 255, 255));
        mdp.setText("Modifier mot de Passe");
        mdp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mdpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_parametresLayout = new javax.swing.GroupLayout(btn_parametres);
        btn_parametres.setLayout(btn_parametresLayout);
        btn_parametresLayout.setHorizontalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_parametresLayout.setVerticalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addGroup(btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(btn_parametres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employe");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(127, 101, 156));
        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel4FocusLost(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jToggleButton2.setText("jToggleButton1");

        deamnde_abs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deamnde_abs.setForeground(new java.awt.Color(255, 255, 255));
        deamnde_abs.setText("Demande d' abssence");
        deamnde_abs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deamnde_absMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2)
                    .addComponent(deamnde_abs))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deamnde_abs))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jToggleButton2)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 270, 50));

        emp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 510));

        jPanel1.setBackground(new java.awt.Color(127, 101, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setActionCommand("Demande conge");
        button1.setBackground(new java.awt.Color(54, 33, 89));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Demande conge");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 248, 43));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 234, 34));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date debut");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date fin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 80, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type de conge");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        Date_fin.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 234, 34));

        Date_deb.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Date_deb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 234, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Congé");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 6, -1, -1));

        demande.setBackground(new java.awt.Color(54, 33, 89));
        demande.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        demande.setForeground(new java.awt.Color(54, 33, 89));
        jPanel1.add(demande, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("votre demande est ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 640, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost

    }//GEN-LAST:event_jPanel2FocusLost

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

    }//GEN-LAST:event_jPanel3MousePressed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
       
    }//GEN-LAST:event_typeActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        
        
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       try{
            SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String date_etablir=sdf.format(date);
            String date_deb=sdf.format(Date_deb.getDate());
            String date_fin=sdf.format(Date_fin.getDate());
            String select = Employer.id_employer_static;
            String type_select=type.getSelectedItem().toString();
            
            int id=0;
            try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select id_type from type_conge where type='"+type_select+"'"); 
                if(rs.next())
                {
                     id=rs.getInt("id_type");
                    
                     
                }
            } catch (Exception e) 
            {
            }
            long nbr=ChronoUnit.DAYS.between(LocalDate.parse(date_deb),LocalDate.parse(date_fin));
            if(nbr>0){
                Employer emp=new Employer(select);

                Conges abs=new Conges(date_etablir,date_deb,date_fin,emp,id);
                abs.demande();
                 JOptionPane.showMessageDialog(null, "Demande avec sucees");
               
            }
            else{
                  JOptionPane.showMessageDialog(null, "Ereur de Date");
            }
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null, "Date est Vide");
        }
       demande();
    }//GEN-LAST:event_button1ActionPerformed

    private void jPanel4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4FocusLost

    private void deamnde_absMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deamnde_absMouseClicked
      this.dispose();
        Demande_Abssence e=new Demande_Abssence();
       e.show();
    }//GEN-LAST:event_deamnde_absMouseClicked

    private void mdpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdpMouseClicked
         this.dispose();
        update_mdp e=new update_mdp();
        e.show();
    }//GEN-LAST:event_mdpMouseClicked

    private void deamnde_cngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deamnde_cngMouseClicked
       this.dispose();
        Demande_conges e=new Demande_conges();
        e.show();
    }//GEN-LAST:event_deamnde_cngMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demande_conges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_deb;
    private com.toedter.calendar.JDateChooser Date_fin;
    private javax.swing.JPanel btn_parametres;
    private java.awt.Button button1;
    private javax.swing.JLabel deamnde_abs;
    private javax.swing.JLabel deamnde_cng;
    private javax.swing.JLabel demande;
    private javax.swing.JLabel emp;
    private com.toedter.calendar.demo.JCalendarDemo jCalendarDemo1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel mdp;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
